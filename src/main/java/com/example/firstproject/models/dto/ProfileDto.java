package com.example.firstproject.models.dto;

import com.example.firstproject.models.entity.SavingAccount;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class ProfileDto {
    private String id;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
    private Integer version;
    private String name;
    private String familyName;
    private String nationalCode;
    private String fatherName;
    private String city;

    private SavingAccount savingAccount;

    public ProfileDto() {
    }


    public ProfileDto(LocalDateTime createdDate, LocalDateTime lastModifiedDate, Integer version, String name, String familyName, String nationalCode, String fatherName, String city, SavingAccount savingAccount) {
        this.name = name;
        this.familyName = familyName;
        this.nationalCode = nationalCode;
        this.fatherName = fatherName;
        this.city = city;
        this.savingAccount = savingAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }
}
