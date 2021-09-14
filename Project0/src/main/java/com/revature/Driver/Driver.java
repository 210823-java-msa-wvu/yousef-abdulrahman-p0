package com.revature.Driver;

import com.revature.Services.AddAccount;
import com.revature.Services.DisplayInfo;
import com.revature.Services.RequestDuel;
import com.revature.Services.UserServices;
import com.revature.models.User;
import com.revature.models.leagueinfo;
import com.revature.repositories.league_account_infoRepo;
import com.revature.repositories.UserRepo;
import jdk.nashorn.internal.ir.RuntimeNode;

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
        String looper = "";
        String looperhelper = "";
       
       


            switch (input) {

                case 1: {
                    scanner.nextLine();



                    do {


                        System.out.println("Please enter your username: ");
                        String username = scanner.nextLine();

                        System.out.println("Please enter your password: ");
                        String password = scanner.nextLine();

                        boolean signInResponse = userServices.login(username, password);


                        if (signInResponse) {
                            System.out.println("Successfully logged in");
                            looperhelper = "";
                        } else {

                            System.out.println("Credentials do not match ");
                            looperhelper = "Credentials do not match ";

                        }

                        if (userServices.isadmin(username)) {

                            System.out.println("1.Approve a Duel 0.Quit");
                            int input2 = scanner.nextInt();
                            switch (input2) {
                                case 1: {
                                    scanner.nextLine();
                                    System.out.println("Enter user_id that you would like to approve Duel for");
                                    Integer user_id = scanner.nextInt();

                                    RequestDuel.approveduel(true,user_id);
                                    System.out.println("You have approved this users Duels!");

                                    break;
                                }
                                case 0: {
                                    System.out.println("Thanks for coming ");
                                    break;
                                }

                            }

                        } else if (!userServices.isadmin(username)) {
                            System.out.println("1.Add new Account\n2.Get Account Stats\n3.Request a Duel\n0.Quit");
                            int input3 = scanner.nextInt();
                            switch (input3) {
                                case 1: {
                                    scanner.nextLine();
                                    System.out.println("Please enter the Account name: ");
                                    String accountname = scanner.nextLine();

                                    System.out.println("Please enter your mmr: ");
                                    Integer mmr = Integer.valueOf(scanner.nextLine());

                                    System.out.println("Please enter your border: ");
                                    String border = scanner.nextLine();

                                    System.out.println("Please enter your winrate: ");
                                    String winrate = scanner.nextLine();

                                    System.out.println("Please enter your hours played: ");
                                    Integer hours_played = Integer.valueOf(scanner.nextLine());

                                    System.out.println("Please enter your leader board rank: ");
                                    Integer leader_board_rank = Integer.valueOf(scanner.nextLine());

                                    AddAccount.addaccount(mmr, border, winrate, hours_played, leader_board_rank, accountname);
                                    System.out.println("Account Successfully created thank you");


                                    break;
                                }
                                case 2: {
                                    scanner.nextLine();
                                    System.out.println("Enter the accountname that you would like to get information for.");
                                    String accountname = scanner.nextLine();

                                    DisplayInfo.getallinfo(accountname);


                                    break;

                                }
                                case 3: {
                                    scanner.nextLine();
                                    System.out.println("To Request Duel please type either true or false");
                                    String requestduel = scanner.nextLine();

                                    System.out.println("Enter your leader_board_rank");
                                    Integer leader_board_rank = scanner.nextInt();

                                    System.out.println("Enter your user_id");
                                    Integer user_id = scanner.nextInt();


                                    RequestDuel.requestduel(requestduel, leader_board_rank, user_id);
                                    System.out.println("Duel has been requested, please wait approval at a later time.");

                                    break;
                                }


                            }

                        }


                    }while (looper != looperhelper) ;

                    break;
                }
                // Register
                case 2: {
                    scanner.nextLine();
                    System.out.println("Would you like to create an averageuser account or an admin account?\n" +
                            "1.averageuser 2.Admin user");
                        int input3 = scanner.nextInt();
                        if(input3== 1) {

                            scanner.nextLine();

                            System.out.println("Please enter a username: (no more than 20 characters long)");
                           // scanner.nextLine();
                            String username = scanner.nextLine();
                            while(username.length()>20) {
                                System.out.println("username longer than 20 characters, enter new username");
                                username = scanner.nextLine();
                            }


                            System.out.println("Please enter a password: (no more than 20 characters long)");
                           // scanner.nextLine();
                            String password = scanner.nextLine();
                            while(password.length()>20) {
                                System.out.println("Please enter a password: (no more than 20 characters long)");
                                // scanner.nextLine();
                                 password = scanner.nextLine();
                            }

                            while(username.length()>20) {
                                System.out.println("username longer than 20 characters, enter new username");
                                username = scanner.nextLine();
                            }

                            System.out.println("Account Created, thank you");
                            userServices.averageuserRegister(username, password);
                        }else if(input3==2) {
                            scanner.nextLine();

                            System.out.println("Please enter a username: (no more than 20 characters long)");
                            // scanner.nextLine();
                            String username = scanner.nextLine();
                            while(username.length()>20) {
                                System.out.println("username longer than 20 characters, enter new username");
                                username = scanner.nextLine();
                            }


                            System.out.println("Please enter a password: (no more than 20 characters long)");
                            // scanner.nextLine();
                            String password = scanner.nextLine();
                            while(password.length()>20) {
                                System.out.println("Please enter a password: (no more than 20 characters long)");
                                // scanner.nextLine();
                                password = scanner.nextLine();
                            }

                            while(username.length()>20) {
                                System.out.println("username longer than 20 characters, enter new username");
                                username = scanner.nextLine();
                            }

                            System.out.println("Account Created, thank you");
                            userServices.adminRegister(username, password);


                        }


                    break;
                }


                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }

            System.out.println("Thanks for coming ");

        }

       // scanner.close();


    }






