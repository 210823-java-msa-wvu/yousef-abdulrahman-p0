package com.revature.models;

public class Duel {

    private Integer duel_id;
    private String request_duel;
    private Boolean approved = false;
    private Boolean accepted = false;
    private Integer user_id;




    public Duel() {


    }
public Duel(String request_duel) {};

    public Duel(boolean approved, boolean accepted){

    }


    public Duel(int id, String request_duel,boolean approved, boolean accepted) {

        this.duel_id =id;
        this.request_duel= request_duel;
        this.approved = approved;
        this.accepted = accepted;


    }

    public Integer getDuel_id() {
        return duel_id;
    }

    public void setDuel_id(Integer duel_id) {
        this.duel_id = duel_id;
    }

    public String getRequest_duel() {
        return request_duel;
    }

    public void setRequest_duel(String request_duel) {
        this.request_duel = request_duel;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
