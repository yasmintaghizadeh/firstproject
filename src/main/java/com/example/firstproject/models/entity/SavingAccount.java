package com.example.firstproject.models.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "saving_accounts")
public class SavingAccount extends AbstractEntity {

    private Long balance;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Profile profiles;
    @OneToOne(mappedBy ="savingAccount" )
    @JoinColumn(name = "accountType_id",referencedColumnName = "id")
    private AccountType accountType;

    public SavingAccount() {
    }

    public SavingAccount(LocalDateTime createdDate, LocalDateTime lastModifiedDate, Integer version, Long balance, AccountType accountType, Profile profile) {
        super(createdDate, lastModifiedDate, version);
        this.balance = balance;
        this.accountType = accountType;
        this.profiles=profile;
    }



    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Profile getProfiles() {
        return profiles;
    }

    public void setProfiles(Profile profiles) {
        this.profiles = profiles;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }


}
