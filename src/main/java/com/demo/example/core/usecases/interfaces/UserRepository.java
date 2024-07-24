package com.demo.example.core.usecases.interfaces;

import com.demo.example.core.entities.User;

public interface UserRepository {
    void save(User user);
    User findById(String id);
}
