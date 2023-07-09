package com.example.firstproject;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

@ApplicationPath("/api")
public class BankApplication extends Application {

}