package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.Data;

// The cc is unique

@Data


public class User {

    private UUID id;
    private String name;
    private String lastName;
    private String email;
    private String address;
    private String cc;
    private String password;
    private List<UUID> banks;


    public User(String name, String lastName, String email, String address, String cc, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.cc = cc;
        this.id = UUID.randomUUID();
        this.password= password;
        this.banks = new ArrayList<>();
    }

    
}


