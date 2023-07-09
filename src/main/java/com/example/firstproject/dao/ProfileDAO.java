package com.example.firstproject.dao;


import com.example.firstproject.models.entity.Profile;
import com.example.firstproject.service.ProfileService;
import jakarta.inject.Named;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.query.SelectionQuery;


public class ProfileDAO extends DAO<Profile> {
    public String getCustomerNameByCustomerId(String id) {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("SELECT p.name FROM Profile p WHERE p.id = :id");
        query.setParameter("id", id);
        return query.getResultList().toString();

    }


}
