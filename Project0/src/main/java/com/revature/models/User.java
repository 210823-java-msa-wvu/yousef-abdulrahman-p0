package com.revature.models;

public class User {

    //Instance Variables
    private Integer id;
    private String username;
    private String password;
    private Boolean Admin;


    public User(int id, String username, String password, boolean user_type) {

    }

    public User(int id, String username, String password, String user_type){

    }




    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public Boolean getAdmin() {return Admin;}

    public void setAdmin(Boolean Admin) {this.Admin =Admin;}

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}



















