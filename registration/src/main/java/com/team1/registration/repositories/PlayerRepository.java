package com.team1.registration.repositories;

import com.team1.registration.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    List<Player> getPlayersByUserId(Integer userId);
}
