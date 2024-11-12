package com.mateussjam.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateussjam.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
