package com.example.firstproject;

import com.example.firstproject.models.entity.AccountType;
import com.example.firstproject.models.entity.Profile;
import com.example.firstproject.models.entity.SavingAccount;
import com.example.firstproject.dao.ProfileDAO;
import com.example.firstproject.models.enums.Type;
import com.example.firstproject.models.responsesreq.SavingAccountCreationReq;
import com.example.firstproject.models.responsesreq.SavingAccountCreationResp;
import com.example.firstproject.service.ProfileService;
import com.example.firstproject.service.SavingAccountsService;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<SavingAccount> account = new ArrayList<>();
        AccountType accountType=new AccountType(LocalDateTime.now(),LocalDateTime.now(),0,"بلند مدت", Type.LONG_TERM);
        Profile profile=new Profile(LocalDateTime.now(),LocalDateTime.now(),0,"reza","alipanah","02274156","rezaa","tehran",account);

        SavingAccount account1 = new SavingAccount(LocalDateTime.now(),LocalDateTime.now(),0,1200000L,accountType,profile);
      SavingAccount  account2 = new SavingAccount(LocalDateTime.now(),LocalDateTime.now(),0,1200000L,accountType,profile);
    account.add(account1);
    account.add(account2);


        ProfileDAO profileDAO=new ProfileDAO();
        ProfileService service=new ProfileService();
        //service.save(profile);
     // service.save(new Profile("huihgicu", LocalDateTime.now(), LocalDateTime.now(), 0, "yasmin", "taghizadeh", "0441069622", "mohammad", "tehran", account));
      // System.out.println(service.get(Profile.class,"d90d0a72-40fb-4b14-8fb9-092b817748bf"));
        SavingAccountCreationReq req=new SavingAccountCreationReq("64865ec4-fb19-4ef0-93dc-a64ed197c175",1000000L,accountType);
        SavingAccountsService savingAccountsService=new SavingAccountsService();
        System.out.println(savingAccountsService.buildSavingAccount(req));

    }
}
