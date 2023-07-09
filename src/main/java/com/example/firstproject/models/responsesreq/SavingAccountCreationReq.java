package com.example.firstproject.models.responsesreq;

import com.example.firstproject.models.entity.AccountType;

public class SavingAccountCreationReq {
   private String customerId;
    private Long balance;

    private AccountType type;

    public SavingAccountCreationReq(String customerId, Long balance, AccountType accountType) {
        this.customerId = customerId;
        this.balance = balance;

    }

    public SavingAccountCreationReq() {
    }



    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return type;
    }

    public void setAccountType(AccountType accountType) {
        this.type = accountType;
    }
}
