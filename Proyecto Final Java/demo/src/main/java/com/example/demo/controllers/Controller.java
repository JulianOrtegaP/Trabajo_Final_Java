package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Bank;
import com.example.demo.models.Cdt;
import com.example.demo.models.CreditCard;
import com.example.demo.models.SavingsAccount;
import com.example.demo.models.Transfers;
import com.example.demo.models.User;

@RestController
@CrossOrigin(origins = "*")

public class Controller {

    //------------------------------------- BBDD ---------------------------------------------

    List<User> userDb = new ArrayList<>();
    List<Transfers> transfersDb = new ArrayList<>();
    List<SavingsAccount> savingsDb = new ArrayList<>();
    List<CreditCard> creditDb = new ArrayList<>();
    List<Cdt> cdtDb = new ArrayList<>();
    List<Bank> bankDb = new ArrayList<>();
    

    // --------------- METODOS DE USERS ----------------------------------------------------

    



    
}
