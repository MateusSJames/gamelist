package com.mateussjam.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateussjam.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
