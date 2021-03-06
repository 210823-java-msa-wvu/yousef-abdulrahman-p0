package com.revature.repositories;

import com.revature.models.User;
import com.revature.models.leagueinfo;
import com.revature.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserRepo implements CrudRepository<User> {

    ConnectionUtil cu = ConnectionUtil.getConnectionUtil();


    public User getByUsername(String username) {

        try (Connection conn = cu.getConnection()) {
            String sql = "select * from users where username = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                User u = new User(
                        rs.getInt("user_id"),
                        rs.getString("username"),
                        rs.getString("password")




                );

                return u;


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public User getisadmin(String username) {
        try (Connection conn = cu.getConnection()) {
            String sql = "select * from users where username = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                User u = new User(
                        rs.getInt("user_id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getBoolean("isadmin")


                );

                return u;


            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }





    public User getUsername(String username) {

        try (Connection conn = cu.getConnection()) {
            String sql = "select * from users where username = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                User u = new User(
                        rs.getInt("user_id"),
                        rs.getString("username"),
                        rs.getString("password")


                );
                return u;


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public User averageuserRegister(String username, String password) {

        try (Connection conn = cu.getConnection()) {
            String sql = "insert into users values(default,?,?,false)";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            int rs = ps.executeUpdate();


                return null;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public User adminRegister(String username, String password) {

        try (Connection conn = cu.getConnection()) {
            String sql = "insert into users values(default,?,?,true)";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            int rs = ps.executeUpdate();


            return null;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }






        @Override
        public User add (User user){
            return null;
        }

        @Override
        public User getById (Integer id){
            return null;
        }

        @Override
        public List<User> getAll () {
            return null;
        }

        @Override
        public void update (User user){

        }

        @Override
        public void delete (Integer id){

        }


}

