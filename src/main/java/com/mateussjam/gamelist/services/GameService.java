package com.mateussjam.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateussjam.gamelist.dto.GameMinDTO;
import com.mateussjam.gamelist.entities.Game;
import com.mateussjam.gamelist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> games = result.stream().map(x -> new GameMinDTO(x)).toList();
		return games;
	}
}
