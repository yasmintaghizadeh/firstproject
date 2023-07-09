package com.example.firstproject.models.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "profile")
public class Profile extends AbstractEntity{

    private String name;
    @Column(name = "family_name")
    private String familyName;
    @Column(name = "national_code")
    private String nationalCode;
    @Column(name = "father_name")
    private String fatherName;
    private String city;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<SavingAccount> savingAccount;

    public Profile() {
    }


    public Profile(LocalDateTime createdDate, LocalDateTime lastModifiedDate, Integer version, String name, String familyName, String nationalCode, String fatherName, String city, List<SavingAccount> savingAccount) {
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


    public List<SavingAccount> getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(List<SavingAccount> savingAccount) {
        this.savingAccount = savingAccount;
    }

}
