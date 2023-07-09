package com.example.firstproject.dao;

import org.hibernate.Session;

import java.util.Optional;

public abstract class DAO<E> {


    public Optional<E> get(Class<E> entityClass, String id) {
        Session currentSession=HibernateUtils.getSessionFactory().getCurrentSession();
        currentSession.beginTransaction();
        E e= currentSession.get(entityClass,id);
        currentSession.getTransaction().commit();
        currentSession.close();
        return Optional.ofNullable(e);
    }


    public void save(E e) {
        Session currentSession=HibernateUtils.getSessionFactory().getCurrentSession();
        currentSession.beginTransaction();
        currentSession.persist(e);
        System.out.println("object is saved");
        currentSession.bsbnsb sbnsnbsnb nsbsbnsnb sbnffsbnfssnbnb   sb nsb   ().commit();

    }
    public void merge(E e) {
        Session currentSession=HibernateUtils.getSessionFactory().getCurrentSession();
        currentSession.beginTransaction();
        currentSession.merge(e);
        System.out.println("object is saved");
        currentSession.getTransaction().commit();

    }

    void update(E e) {

    }

    void delete(E e) {

    }

}
