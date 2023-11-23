package com.example.demo.models;

import java.util.UUID;

import lombok.Data;

@Data
public class Bank {

    private UUID id;
    private String name;
    private String address;


    public Bank(UUID id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    

    
}
