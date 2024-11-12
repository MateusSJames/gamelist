package com.mateussjam.gamelist.dto;

import com.mateussjam.gamelist.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;
	
	public GameListDTO() {}

	public GameListDTO(GameList list) {
		super();
		id = list.getId();
		name = list.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
