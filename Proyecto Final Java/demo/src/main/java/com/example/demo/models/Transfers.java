package com.example.demo.models;

import java.util.UUID;

import lombok.Data;

@Data
public class Transfers {
    
    private UUID id;
    private Double amount;
    private UUID idAccountOrigin;
     private UUID idAccountDestination;

    public Transfers(Double amount, UUID idAccountOrigin, UUID idAccountDestination) {
        this.amount = amount;
        this.idAccountOrigin = idAccountOrigin;
        this.idAccountDestination = idAccountDestination;
        this.id = UUID.randomUUID();
    }





    
}
