package com.revature.Services;

import com.revature.models.Duel;
import com.revature.models.leagueinfo;
import com.revature.repositories.CrudRepository;
import com.revature.repositories.DuelRepo;

import java.util.List;

public class RequestDuel implements CrudRepository<Duel>
{



    public static Duel requestduel(String request_duel,Integer leader_board_rank,Integer user_id){

        Duel u = DuelRepo.RequestDuel(request_duel,leader_board_rank,user_id);
        if(u!=null) {

            throw new IllegalArgumentException();
        }

        u = DuelRepo.RequestDuel(request_duel,leader_board_rank,user_id);
        return u;



    }

    public static Duel approveduel(Boolean approved,Integer user_id){

        Duel u = DuelRepo.ApproveDuel(approved,user_id);
        if(u!=null) {

            throw new IllegalArgumentException();
        }

        u = DuelRepo.ApproveDuel(approved,user_id);
        return u;



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
