package com.example.firstproject.dao;

import com.example.firstproject.models.entity.AbstractEntity;
import com.example.firstproject.models.entity.AccountType;
import com.example.firstproject.models.entity.Profile;
import com.example.firstproject.models.entity.SavingAccount;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory(){
        if (sessionFactory == null){
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(AccountType.class);
            configuration.addAnnotatedClass(Profile.class);
            configuration.addAnnotatedClass(SavingAccount.class);

            sessionFactory = configuration.buildSessionFactory();
            return sessionFactory;
        }
        return sessionFactory;
    }
}
