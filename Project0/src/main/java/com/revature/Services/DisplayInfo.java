package com.revature.Services;

import com.revature.models.leagueinfo;
import com.revature.repositories.CrudRepository;
import com.revature.repositories.league_account_infoRepo;

import java.util.List;

public class DisplayInfo implements CrudRepository<leagueinfo> {


    static league_account_infoRepo leagueinfoRepo = new league_account_infoRepo();


    public static void  getallinfo(String accountname) {

            leagueinfo u = new leagueinfo();

            u = leagueinfoRepo.getAccountinfo(accountname);

        System.out.println("userid = " + u.getUser_id());
        System.out.println("Leagueinfo_id =  " + u.getLeagueinfo_id());
        System.out.println("Hours played = " + u.getHours_played());
        System.out.println("Border = " +u.getBorder());
        System.out.println("MMR =" +u.getMmr());
        System.out.println("Winrate = " +u.getWinrate());
        System.out.println("Leader Board Rank = " + u. getLeader_board_rank());



    }




    @Override
    public leagueinfo add(leagueinfo leagueinfo) {
        return null;
    }

    @Override
    public leagueinfo getById(Integer id) {
        return null;
    }

    @Override
    public List<leagueinfo> getAll() {
        return null;
    }


    @Override
    public void update(leagueinfo leagueinfo) {

    }



    @Override
    public void delete(Integer id) {

    }



}
