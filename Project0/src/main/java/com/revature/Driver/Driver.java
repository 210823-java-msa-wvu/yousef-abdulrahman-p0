package com.revature.Driver;

import com.revature.Services.UserServices;
import com.revature.repositories.UserRepo;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.List;


public class Driver {

    public static Scanner scanner = new Scanner(System.in);

    private static UserServices userServices = new UserServices();




    public static void main(String[] args) throws SQLException {

        System.out.println("Welcome to the League of Legends application\n Please choose an option below");
        System.out.println("1. Login\n2. Register\n0. Quit");

        int input =scanner.nextInt();

        if(input !=0) {


            switch (input) {

                case 1: {
                    scanner.nextLine();

                    System.out.println("Please enter your username: ");
                    String username = scanner.nextLine();

                    System.out.println("Please enter your password: ");
                    String password = scanner.nextLine();

                    boolean signInResponse = userServices.login(username, password);


                    if (signInResponse) {
                        System.out.println("Successfully logged in");
                    } else {

                        System.out.println("Credentials do not match ");
                    }

                    System.out.println("1.Add new Account\n2.Get Account Stats\n3.Request a Duel\n0.Quit");
                    int input2 = scanner.nextInt();
                    switch (input2) {
                        case 1: {

                            break;
                        }
                        case 2: {
                            break;

                        }
                        case 3: {

                            break;
                        }


                    }


                    break;

                }

                case 2: {

                    break;
                }



            }
        } else {
            System.out.println("Thanks for coming ");

        }

        scanner.close();


    }





}
