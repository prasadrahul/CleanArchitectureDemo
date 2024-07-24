package com.demo.example.adapters;

import com.demo.example.core.entities.User;
import com.demo.example.core.usecases.interfaces.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

// Implementation (OCP, LSP)
@Repository
public class UserRepositoryImpl implements UserRepository {
    private Map<String, User> userStorage = new HashMap<>();

    @Override
    public void save(User user) {
        userStorage.put(user.getId(), user);
    }

    @Override
    public User findById(String id) {
        return userStorage.get(id);
    }
}