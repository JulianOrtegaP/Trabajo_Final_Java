package com.example.demo.models;

import java.util.UUID;

import lombok.Data;

@Data
public class Cdt {

    private UUID idUser;
    private UUID NumberCdt;
    PR
    private Double amount;
    private Double interestRate;
    private Integer term;
    private Double fee;

    public Cdt(UUID idUser, Double amount, Double interestRate, Integer term, Double fee) {
        this.idUser = idUser;
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;
        this.fee = fee;
        this.NumberCdt = UUID.randomUUID();
    }

    
    
}


