package com.example.firstproject.controller;


import com.example.firstproject.models.entity.SavingAccount;
import com.example.firstproject.models.responsesreq.SavingAccountCreationReq;
import com.example.firstproject.models.responsesreq.SavingAccountCreationResp;
import com.example.firstproject.service.SavingAccountsService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;



public class SavingAccountController {
    private SavingAccountsService service;
    public SavingAccountController() {
        service = new SavingAccountsService();
    }

    @POST()  //TODO:add profile dto to project
    @Path("/saving-account")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public SavingAccountCreationResp savingAccountCreation(SavingAccountCreationReq req) throws Exception {
        return service.buildSavingAccount(req);
    }
}
