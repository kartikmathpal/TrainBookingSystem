package com.kartik.controller;

import com.kartik.entity.User;
import com.kartik.service.UserService;

import java.util.Scanner;

public class Controller {
    private static Scanner scanner;

    public Controller() {
    }

    public void initialize() {
        try {
            User user = UserService.requestUserLogin();
            System.out.println("Login was succesfull");

            // if login successfulll then enter to trin service

        } catch (Exception e) {
            System.out.println("Login faileure: " + e);
        }

    }


}
