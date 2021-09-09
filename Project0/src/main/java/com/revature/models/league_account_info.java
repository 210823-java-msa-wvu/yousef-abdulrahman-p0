package com.revature.models;

public class league_account_info {

    private Integer id;
    private Integer mmr;
    private String border;
    private String winrate;
    private String hours_played;
    private int leader_board_rank;


    public league_account_info() {



    }

    public league_account_info(Integer id) {
        this.id = id;
    }
    // for leaderboard
    public league_account_info(Integer mmr, String border, int leader_board_rank) {
        this.mmr = mmr;
        this.border = border;
        this.leader_board_rank = leader_board_rank;
    }
    // all parameters
    public league_account_info(Integer id, Integer mmr, String border, String winrate, String hours_played, int leader_board_rank) {
        this.id = id;
        this.mmr = mmr;
        this.border = border;
        this.winrate = winrate;
        this.hours_played = hours_played;
        this.leader_board_rank = leader_board_rank;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMmr() {
        return mmr;
    }

    public String getBorder() {
        return border;
    }

    public String getWinrate() {
        return winrate;
    }

    public String getHours_played() {
        return hours_played;
    }

    public int getLeader_board_rank() {
        return leader_board_rank;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMmr(Integer mmr) {
        this.mmr = mmr;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void setWinrate(String winrate) {
        this.winrate = winrate;
    }

    public void setHours_played(String hours_played) {
        this.hours_played = hours_played;
    }

    public void setLeader_board_rank(int leader_board_rank) {
        this.leader_board_rank = leader_board_rank;
    }


    @Override
    public String toString() {
        return "league_account_info{" +
                "id=" + id +
                ", mmr=" + mmr +
                ", border='" + border + '\'' +
                ", winrate='" + winrate + '\'' +
                ", hours_played='" + hours_played + '\'' +
                ", leader_board_rank=" + leader_board_rank +
                '}';
    }
}
