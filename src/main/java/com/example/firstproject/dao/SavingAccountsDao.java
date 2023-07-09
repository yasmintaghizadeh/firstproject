package com.example.firstproject.dao;

import com.example.firstproject.models.entity.SavingAccount;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class SavingAccountsDao extends DAO<SavingAccount> {

   public String getSavingAccountId(SavingAccount savingAccount){
       Session session=HibernateUtils.getSessionFactory().getCurrentSession();
      Transaction transaction= session.beginTransaction();
       Query query = session.createQuery("SELECT s.id FROM SavingAccount s WHERE s = :savingAccount");
       query.setParameter("savingAccount",savingAccount);
       String accountId=(String) query.uniqueResult();
       transaction.commit();
       session.close();
       return accountId;
   }
    public Long getCustomerBalance(String id){
        Session session=HibernateUtils.getSessionFactory().getCurrentSession();
       Transaction transaction= session.beginTransaction();
        Query query = session.createQuery("SELECT s.balance FROM SavingAccount s where s.id = :id");
        query.setParameter("id",id);
        Long balance= (Long) query.uniqueResult();
        transaction.commit();
        session.close();
        return balance ;
    }


}
