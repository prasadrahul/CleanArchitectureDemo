package com.demo.example.core.usecases;

import com.demo.example.core.entities.User;
import com.demo.example.core.usecases.interfaces.UserRepository;

public class CreateUser {
    private UserRepository userRepository;

    public CreateUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(String id, String name) {
        User user = new User(id, name);
        userRepository.save(user);
    }
}
