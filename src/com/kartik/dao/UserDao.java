package com.kartik.dao;

import com.kartik.entity.User;
import com.kartik.exceptions.InvalidUserCredentialsException;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static List<User> users;

    static {
        users = new ArrayList<User>();

        users.add(new User("kartik","mathpal"));
        users.add(new User("mayank","lohani"));
    }


    public static User searchUser(User user) throws Exception{
        Boolean userFound = false;
        for(User user1: users) {
            if(user1.getUserName().equalsIgnoreCase(user.getUserName())
                    && user1.getPassword().equalsIgnoreCase(user.getPassword())){
                    userFound = true;
                    user = user1;
            }
        }

        if(!userFound) {
            throw new InvalidUserCredentialsException("Invalid user credentials provided");
        } else {
            return user;
        }
    }
}
