package com.example.firstproject.service;

import com.example.firstproject.models.entity.Profile;
import com.example.firstproject.dao.ProfileDAO;
@Service

public class ProfileService extends AbstractService<Profile,ProfileDAO> {

   public ProfileService(){
       super(new ProfileDAO());
   }


}
