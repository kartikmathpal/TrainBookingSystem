package com.kartik.service;

import com.kartik.dao.UserDao;
import com.kartik.service.inteface.IUserService;
import com.kartik.entity.User;

import java.util.Scanner;

public class UserService implements IUserService {

    UserDao userDao = new UserDao();

    private static String username, password ;
    private static Scanner scanner ;
    static  {
        scanner = new Scanner(System.in);
    }



    @Override
    public  User validate(User user)  throws Exception {
//       try {
//           user =  UserDao.searchUser(user);
//       } catch (InvalidUserCredentialsException e) {
//           System.out.println("Exception while validate InvalidUserCredentialsException" + e);
//           throw  e;
//
//       } catch (Exception e) {
//           System.out.println("Exception while validate" + e);
//           throw e;
//       }
        user =  userDao.searchUser(user);
       return user;
    }

    @Override
    public  User requestUserLogin() throws Exception {
        System.out.print("Enter Username : ");
        username = scanner.nextLine();
        System.out.print("Enter Password: ");
        password = scanner.nextLine();

        try {
            User user = validate(new User(username,password));
            return user;
        } catch (Exception e) {
            System.out.println("Exception while logging in " + e);
            throw new Exception("Either the username/password you provied is wrong.");
        }
    }
}
