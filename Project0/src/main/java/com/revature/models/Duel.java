package com.revature.models;

public class Duel {

    private int id;
    private String request_duel;
    private boolean approved = false;
    private boolean accepted = false;




    public Duel() {


    }


    public Duel(boolean approved, boolean accepted){

    }


    public Duel(int id, String request_duel,boolean approved, boolean accepted) {

        this.id =id;
        this.request_duel= request_duel;
        this.approved = approved;
        this.accepted = accepted;


    }







}
