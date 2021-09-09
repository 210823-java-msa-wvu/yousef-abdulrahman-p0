package com.revature.Services;


import com.revature.models.User;
import com.revature.repositories.UserRepo;

import java.sql.SQLException;

public class UserServices {

    UserRepo userRepo = new UserRepo();

    public boolean login(String username, String password) {


        User u = userRepo.getByUsername(username);

        if (u != null) {

            if (username.equals(u.getUsername()) && password.equals(u.getPassword())) {

                return true;

            }

        }

        return false;
    }



   // public boolean user_type(String user_type) throws SQLException {

       // User u = userRepo.getByUsertype(user_type);

     //   if (u != null) {
      //      if (user_type.equals(u.getUsertype())) {
       //         return true;
      //      }

     //   }
    //    return false;
   // }












}
