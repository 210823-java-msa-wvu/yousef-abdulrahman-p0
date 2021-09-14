package com.revature.repositories;

import com.revature.models.Duel;
import com.revature.models.User;
import com.revature.models.leagueinfo;
import com.revature.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DuelRepo  implements CrudRepository<Duel> {


    static ConnectionUtil cu = ConnectionUtil.getConnectionUtil();


    public  static Duel RequestDuel(String request_duel,Integer leader_board_rank,Integer user_id) {

        try (Connection conn = cu.getConnection()) {
            String sql = "insert into duel values(default,?,?,false,false,?)";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setBoolean(1, Boolean.parseBoolean(request_duel));
            ps.setInt(2,leader_board_rank);
            ps.setInt(3,user_id);

            Boolean rs = ps.execute();


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


    public static Duel ApproveDuel(Boolean approved,Integer user_id) {
        try (Connection conn = cu.getConnection()) {
            String sql = "update Duel SET approved=? WHERE user_id=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setBoolean(1,approved);
            ps.setInt(2, user_id);


            Boolean rs = ps.execute();

            return null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }








    @Override
    public Duel add(Duel duel) {
        return null;
    }

    @Override
    public Duel getById(Integer id) {
        return null;
    }

    @Override
    public List<Duel> getAll() {
        return null;
    }


    @Override
    public void update(Duel duel) {

    }



    @Override
    public void delete(Integer id) {

    }
}
