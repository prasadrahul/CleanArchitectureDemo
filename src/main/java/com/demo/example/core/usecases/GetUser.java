package com.demo.example.core.usecases;

import com.demo.example.core.entities.User;
import com.demo.example.core.usecases.interfaces.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class GetUser {
    private UserRepository userRepository;

    public GetUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String id) {
        return userRepository.findById(id);
    }
}
