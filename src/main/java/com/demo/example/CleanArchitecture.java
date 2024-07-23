package com.demo.example;

public class CleanArchitecture {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.createUser("1", "John Doe");

        User user = userController.getUser("1");

        System.out.println("User retrieved: " + user.getName());
    }
}
