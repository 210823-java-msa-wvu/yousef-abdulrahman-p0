package com.revature.Services;
import com.revature.models.User;
import com.revature.models.leagueinfo;
import com.revature.repositories.UserRepo;
import com.revature.repositories.league_account_infoRepo;

import java.sql.SQLException;

public class AddAccount {


    static league_account_infoRepo leagueinfoRepo = new league_account_infoRepo();

    //"border can only be one letter"
    //assigns the account with the user thats logged in



    public static leagueinfo addaccount(Integer mmr, String border, String winrate, Integer hours_played, Integer leader_board_rank, String accountname){

        leagueinfo u = leagueinfoRepo.addAccount( mmr, border, winrate, hours_played, leader_board_rank, accountname);
        if(u!=null) {

            throw new IllegalArgumentException();
        }

        u = leagueinfoRepo.addAccount( mmr, border, winrate, hours_played, leader_board_rank,accountname);
        return u;



    }






}
