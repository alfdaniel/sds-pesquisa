package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dspesquisa.entities.Record;

import lombok.Data;

@Data
public class RecordInsertDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private String name;
	private int age;
	private Long gameId;
	

}
