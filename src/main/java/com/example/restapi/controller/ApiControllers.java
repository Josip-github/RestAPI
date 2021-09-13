package com.example.restapi.controller;

import com.example.restapi.model.User;
import com.example.restapi.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;

    @GetMapping
    public String getPage(){
        return "Welcome!";
    }

    @GetMapping(value = "/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }

}
