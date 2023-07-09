package com.example.firstproject.models.entity;

import com.example.firstproject.models.enums.Type;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "account_type")
public class AccountType extends AbstractEntity{
    private String accountName;
    @Enumerated
    private Type accountType;
    @OneToOne
    @JoinColumn(name = "savingAccount_id")
    private SavingAccount savingAccount;

    public AccountType() {
    }

    public AccountType(LocalDateTime createdDate, LocalDateTime lastModifiedDate, Integer version, String accountName, Type accountType) {
        super(createdDate, lastModifiedDate, version);
        this.accountName = accountName;
        this.accountType = accountType;

    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Type getAccountType() {
        return accountType;
    }

    public void setAccountType(Type accountType) {
        this.accountType = accountType;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }
}
