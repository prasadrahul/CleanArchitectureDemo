package com.demo.example;

import com.demo.example.adapters.UserRepositoryImpl;
import com.demo.example.adapters.controllers.UserController;
import com.demo.example.core.entities.User;
import com.demo.example.core.usecases.CreateUser;
import com.demo.example.core.usecases.GetUser;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CleanArchitecture {
    public static void main(String[] args) {

        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        CreateUser createUser = new CreateUser(userRepository);
        GetUser getUser = new GetUser(userRepository);
        UserController userController = new UserController(createUser, getUser);

        userController.createUser("1", "John Doe");
        User user = userController.getUser("1");
        System.out.println("User retrieved: " + user.getName());
    }
}
