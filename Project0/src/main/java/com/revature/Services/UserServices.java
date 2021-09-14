package com.revature.Services;


import com.revature.Exceptions.UserdoesnotExistException;
import com.revature.models.User;
import com.revature.repositories.UserRepo;

public class UserServices {

    UserRepo userRepo = new UserRepo();

    public boolean login(String username, String password) throws UserdoesnotExistException {


        User u = userRepo.getByUsername(username);
        if(u==null){
            throw new UserdoesnotExistException();
        }
        if (u != null) {

            if (username.equals(u.getUsername()) && password.equals(u.getPassword())) {

                return true;

            }

        }

        return false;
    }


    //average userRegister

    public User averageuserRegister(String username, String password){
        User u =userRepo.averageuserRegister(username,password);
        //User u = userRepo.getByUsername(username);
        if(u!=null) {
                throw new IllegalArgumentException();
        }

        return u;



    }


    public User adminRegister(String username, String password){
        User u =userRepo.adminRegister(username,password);
        if(u!=null) {
            throw new IllegalArgumentException();
        }

        return u;



    }



    public boolean isadmin(String accountname) {

        User u = new User();

        u = userRepo.getisadmin(accountname);


        return u.getAdmin();


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
