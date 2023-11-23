package com.example.demo.models;

import java.util.UUID;

import lombok.Data;

@Data
public class CreditCard {

    private UUID id;
    private UUID idUser;
    private Double creditLimit;
    private Double interestRate;
    private Integer installments;

    public CreditCard(UUID idUser, Double creditLimit, Double interestRate, Integer installments) {
        this.idUser = idUser;
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
        this.installments = installments;
        this.id = UUID.randomUUID();
    }

    

    
}
