package com.example.firstproject.models.builder.savingAccountBuilder;

import com.example.firstproject.models.entity.AccountType;
import com.example.firstproject.models.entity.Profile;
import com.example.firstproject.models.entity.SavingAccount;

import java.time.LocalDateTime;

public class SavingAccountsBuilder extends SavingAccount implements BuildSavingAccount {


    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
    private Integer version;
    private Long balance;
    private Profile profiles;
    private AccountType accountType;

    public SavingAccountsBuilder() {
        super();
    }

    public SavingAccountsBuilder withCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public SavingAccountsBuilder withLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    public SavingAccountsBuilder withVersion(Integer version) {
        this.version = version;
        return this;
    }

    public SavingAccountsBuilder withBalance(Long balance) {
        this.balance = balance;
        return this;
    }


    public SavingAccountsBuilder withAccountType(AccountType accountType) {
        this.accountType = accountType;
        return this;
    }

    @Override
    public void buildCreatedDate(LocalDateTime now) {
        this.createdDate=LocalDateTime.now();
    }

    @Override
    public void buildProfiles(Profile profiles) {
        this.profiles = profiles;
    }

    @Override
    public void buildBalance(Long balance) {
        this.balance = balance;
    }

    @Override
    public void buildAccountType(AccountType type) {
        this.accountType = type;
    }


    public SavingAccount build() {
        return new SavingAccount(createdDate, lastModifiedDate, version, balance, accountType,profiles);
    }

    public SavingAccountsBuilder withProfiles(Profile profile) {
        this.profiles = profile;
        return this;
    }
}

