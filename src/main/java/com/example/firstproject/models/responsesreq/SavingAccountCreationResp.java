package com.example.firstproject.models.responsesreq;

import com.example.firstproject.models.entity.AccountType;

import java.time.LocalDateTime;
import java.util.Date;

public class SavingAccountCreationResp {

    private String name;
    private LocalDateTime createdDate;
    private AccountType type;
    private Long balance;

    public SavingAccountCreationResp() {
    }

    public SavingAccountCreationResp(AccountType accountType, String name, LocalDateTime createdDate, AccountType type,Long balance) {
        this.name = name;
        this.createdDate = createdDate;
        this.type = type;
        this.balance=balance;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public String getName(String customerNameByCustomerId) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedDate(LocalDateTime createdDate) {
        return this.createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public AccountType getType(AccountType accountType) {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SavingAccountCreationResp{" +
                "name='" + name + '\'' +
                ", createdDate=" + createdDate +
                ", type=" + type +
                ", balance=" + balance +
                '}';
    }
}
