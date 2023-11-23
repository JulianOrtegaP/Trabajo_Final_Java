package com.example.demo.models;

import java.util.UUID;

import lombok.Data;

@Data
public class SavingsAccount {

    private UUID id;
    private String accountNumber;
    private Double balance;
    private UUID user;
    private UUID bankiId;


    public SavingsAccount(String accountNumber, Double balance, UUID user, UUID bankId) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.user = user;
        this.bankiId = bankId;
        this.id = UUID.randomUUID();
    }


}




