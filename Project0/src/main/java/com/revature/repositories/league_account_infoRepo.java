package com.revature.repositories;

import com.revature.models.User;
import com.revature.models.leagueinfo;
import com.revature.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class league_account_infoRepo  implements CrudRepository<User>{

    ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

    public leagueinfo addAccount(Integer mmr, String border, String winrate, Integer hours_played, Integer leader_board_rank, String accountname) {

        try (Connection conn = cu.getConnection()) {
            String sql = "insert into leagueinfo values(default,?,?,?,?,?,default,?)";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, mmr);
            ps.setString(2, border);
            ps.setString(3, winrate);
            ps.setInt(4, hours_played);
            ps.setInt(5, leader_board_rank);
            ps.setString(6, accountname);

            int rs = ps.executeUpdate();


          //  if (rs.next()) {
             // leagueinfo u = new leagueinfo(;
                     //   rs.getInt("leagueinfo_id"),
                     //   rs.getInt("mmr"),
                     //  rs.getString("border"),
                     //   rs.getString("winrate"),
                     //   rs.getInt("leader_board_rank"),
                     //   rs.getInt("user_id"),
                     //   rs.getString("accountname")


              //  );
                return null;


    } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }


    public leagueinfo getAccountinfo( String accountname) {

        try (Connection conn = cu.getConnection()) {
            String sql = "select * from leagueinfo where accountname= ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, accountname);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                leagueinfo u = new leagueinfo(
                        rs.getInt("leagueinfo_id"),
                        rs.getInt("mmr"),
                        rs.getString("border"),
                        rs.getString("winrate"),
                        rs.getInt("leader_board_rank"),
                        rs.getInt("hours_played"),
                        rs.getInt("user_id"),
                        rs.getString("accountname")


                );
                return u;


            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }












    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public User getById(Integer id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Integer id) {

    }



}
