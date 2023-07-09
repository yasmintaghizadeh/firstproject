package com.example.firstproject.service;

import com.example.firstproject.dao.HibernateUtils;
import com.example.firstproject.dao.ProfileDAO;
import com.example.firstproject.dao.SavingAccountsDao;
import com.example.firstproject.models.builder.savingAccountBuilder.SavingAccountsBuilder;
import com.example.firstproject.models.entity.Profile;
import com.example.firstproject.models.entity.SavingAccount;
import com.example.firstproject.models.responsesreq.SavingAccountCreationReq;
import com.example.firstproject.models.responsesreq.SavingAccountCreationResp;
import org.hibernate.Session;

import java.time.LocalDateTime;
import java.util.Optional;

public class SavingAccountsService extends AbstractService<SavingAccount, SavingAccountsDao> {
    public SavingAccountsService(){
        super(new SavingAccountsDao());
    }



    public SavingAccountCreationResp buildSavingAccount(SavingAccountCreationReq req){
        ProfileDAO dao=new ProfileDAO();
        Optional<Profile> profile = dao.get(Profile.class, req.getCustomerId());
        SavingAccount savingAccount=new SavingAccountsBuilder()
                .withCreatedDate(LocalDateTime.now())
                .withLastModifiedDate(LocalDateTime.now())
                .withBalance(req.getBalance())
                .withProfiles(profile.get())
                .withAccountType(req.getAccountType())
                .build();
        d.merge(savingAccount);

       String accountId= d.getSavingAccountId(savingAccount);


        SavingAccountCreationResp resp=new SavingAccountCreationResp();
        resp.setBalance(d.getCustomerBalance(accountId));
        resp.setCreatedDate(savingAccount.getCreatedDate());
        resp.setName(dao.getCustomerNameByCustomerId(req.getCustomerId()));
        resp.setType(req.getAccountType());
        return resp;
    }


}
