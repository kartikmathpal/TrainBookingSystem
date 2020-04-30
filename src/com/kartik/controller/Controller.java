package com.kartik.controller;
 
import com.kartik.entity.User;
import com.kartik.service.UserService;

import java.util.Scanner;

public class Controller {
    private static Scanner scanner;

    UserService userService = new UserService();
    public Controller() {
    }

    public void initialize() {
        try {
            User user = userService.requestUserLogin();
            System.out.println("Login was succesfull for user" + user);

            // if login successfulll then enter to trin service

        } catch (Exception e) {
            System.out.println("Login faileure: " + e);
        }

    }


}
