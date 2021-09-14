package com.revature.models;

public class User {

    //Instance Variables
    private Integer user_id;
    private String username;
    private String password;
    private Boolean isadmin;


    public User() {


    }

    public User(String username, String password){

        this.username = username;
        this.password = password;
        this.isadmin = isadmin;
    };


    public User(Integer user_id, String username, String password, Boolean isadmin) {
            this.user_id =user_id;
            this.username =username;
            this.password = password;
            this.isadmin =isadmin;

    }

    public User(Boolean isadmin) {
        this.isadmin = isadmin;
    }




    public User(Integer id, String username, String password) {
        this.user_id = id;
        this.username = username;
        this.password = password;
    }



    public Integer getId() {
        return user_id;
    }

    public void setId(Integer id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public Boolean getAdmin() {return isadmin;}

    public void setAdmin(Boolean Admin) {this.isadmin =isadmin;}

    public void setUsername(String username, String password) {
        this.username = username;  this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean isadmin(){
        return isadmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + user_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}



















