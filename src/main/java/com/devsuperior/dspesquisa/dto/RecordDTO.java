package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dspesquisa.entities.Record;
import com.devsuperior.dspesquisa.enums.Platform;

import lombok.Data;

@Data
public class RecordDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Instant moment;
	private String name;
	private int age;
	private String gameTitle;
	private Platform gamePlatform;
	private String genreName;
	
	public RecordDTO (Record entity) {
		id =entity.getId();
		moment =entity.getMoment();
		name = entity.getName();
		age = entity.getAge();
		gamePlatform = entity.getGame().getPlatform();
		gameTitle = entity.getGame().getTitle();
		genreName = entity.getGame().getGenre().getName();
		
	}
	
}
