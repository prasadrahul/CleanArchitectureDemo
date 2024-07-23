package com.demo.example;

import java.util.HashMap;
import java.util.Map;

public class UserController {
    private static final Map<String, User> userRepository = new HashMap<>();

    public void createUser(String id, String name) {
        User user = new User(id, name);
        userRepository.put(id, user);
        System.out.println("User created: " + user.getName());
    }

    public User getUser(String id) {
        return userRepository.get(id);
    }
}