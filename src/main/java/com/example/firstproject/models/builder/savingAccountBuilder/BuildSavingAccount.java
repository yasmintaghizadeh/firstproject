package com.example.firstproject.models.builder.savingAccountBuilder;

import com.example.firstproject.models.entity.AccountType;
import com.example.firstproject.models.entity.Profile;

import java.time.LocalDateTime;

public interface BuildSavingAccount {
    void buildCreatedDate(LocalDateTime now);
    void buildProfiles(Profile profiles);
    void buildBalance(Long balance);
    void buildAccountType(AccountType type);


}
