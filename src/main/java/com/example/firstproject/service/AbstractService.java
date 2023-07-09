package com.example.firstproject.service;

import com.example.firstproject.dao.DAO;
import com.example.firstproject.dao.ProfileDAO;
import com.example.firstproject.models.entity.Profile;
import jakarta.inject.Inject;

import java.util.Optional;

public abstract class AbstractService <E,D extends DAO<E>>{

    protected D d;

     public AbstractService(){

     }
    public AbstractService(D d) {
            this.d = d;
    }


    public void save(E e) throws Exception {
        if (d != null) {
            d.save(e);
        } else {
           throw new IllegalArgumentException("must provide dao");
        }
    }

    public Optional<E> get(Class<E> entityClass,String id) throws Exception {
        if (d != null) {
            return d.get(entityClass, id);
        } else {
            throw new IllegalArgumentException("must provide dao");
        }
    }
}
