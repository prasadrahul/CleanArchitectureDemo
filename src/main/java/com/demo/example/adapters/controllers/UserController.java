package com.demo.example.adapters.controllers;

import com.demo.example.core.entities.User;
import com.demo.example.core.usecases.CreateUser;
import com.demo.example.core.usecases.GetUser;

public class UserController {
    private CreateUser createUser;
    private GetUser getUser;

    public UserController(CreateUser createUser, GetUser getUser) {
        this.createUser = createUser;
        this.getUser = getUser;
    }

    public void createUser(String id, String name) {
        createUser.execute(id, name);
        System.out.println("User created: " + name);
    }

    public User getUser(String id) {
        return getUser.execute(id);
    }
}