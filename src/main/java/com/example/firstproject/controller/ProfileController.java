package com.example.firstproject.controller;

import com.example.firstproject.models.entity.Profile;
import com.example.firstproject.service.ProfileService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.Optional;

@Path("/profile")
public class ProfileController {
 private ProfileService service;
    public ProfileController() {
        service = new ProfileService();
    }



    @POST  //TODO:add profile dto to project
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void save(Profile profile) throws Exception {
       service.save(profile);

    }
    @GET()  //TODO:add profile dto to project
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Optional<Profile> get(@PathParam("id") String id) throws Exception {
        return service.get(Profile.class,id);

    }



}
