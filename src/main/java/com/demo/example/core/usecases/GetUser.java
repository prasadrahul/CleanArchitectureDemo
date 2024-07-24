package com.demo.example.core.usecases;

import com.demo.example.core.entities.User;
import com.demo.example.core.usecases.interfaces.UserRepository;

public class GetUser {
    private final UserRepository userRepository;

    public GetUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String id) {
        return userRepository.findById(id);
    }
}
