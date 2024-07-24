package com.demo.example.adapters.controllers;

import com.demo.example.core.entities.User;
import com.demo.example.core.usecases.CreateUser;
import com.demo.example.core.usecases.GetUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Controller (SRP)
@RestController
@RequestMapping("/users")
public class UserController {
    private CreateUser createUser;
    private GetUser getUser;

    public UserController(CreateUser createUser, GetUser getUser) {
        this.createUser = createUser;
        this.getUser = getUser;
    }

    @PostMapping
    public void createUser(@RequestParam String id, @RequestParam String name) {
        createUser.execute(id, name);
        System.out.println("User created: " + name);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return getUser.execute(id);
    }
}