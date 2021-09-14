package com.revature.models;

import com.revature.repositories.league_account_infoRepo;

import java.util.List;

public class leagueinfo extends league_account_infoRepo {

    private Integer leagueinfo_id;
    private Integer mmr;
    private String border;
    private String winrate;
    private Integer leader_board_rank;
    private Integer hours_played;
    private Integer user_id;
    private String accountname;



    public leagueinfo(Integer leagueinfo_id, Integer mmr, String border, String winrate,Integer leader_board_rank, Integer hours_played, Integer user_id, String accountname) {
        this.leagueinfo_id = leagueinfo_id;
        this.mmr = mmr;
        this.border = border;
        this.winrate = winrate;
        this.leader_board_rank = leader_board_rank;
        this.hours_played = hours_played;
        this.user_id = user_id;
        this.accountname = accountname;
    }

    public leagueinfo() {

    }




    public Integer getLeagueinfo_id() {
        return leagueinfo_id;
    }

    public void setLeagueinfo_id(Integer leagueinfo_id) {
        this.leagueinfo_id = leagueinfo_id;
    }

    public Integer getMmr() {
        return mmr;
    }

    public void setMmr(Integer mmr) {
        this.mmr = mmr;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public String getWinrate() {
        return winrate;
    }

    public void setWinrate(String winrate) {
        this.winrate = winrate;
    }

    public Integer getHours_played() {
        return hours_played;
    }

    public void setHours_played(Integer hours_played) {
        this.hours_played = hours_played;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setLeader_board_rank(Integer leader_board_rank) {
        this.leader_board_rank = leader_board_rank;
    }

    public Integer getLeader_board_rank() {
        return leader_board_rank;
    }

    @Override
    public String toString() {
        return "leagueinfo{" +
                "leagueinfo_id=" + leagueinfo_id +
                ", mmr=" + mmr +
                ", border='" + border + '\'' +
                ", winrate='" + winrate + '\'' +
                ", hours_played='" + hours_played + '\'' +
                ", user_id=" + user_id +
                ", accountname='" + accountname + '\'' +
                '}';
    }
}
