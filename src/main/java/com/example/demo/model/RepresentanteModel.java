package com.example.demo.model;

import java.io.Serializable;

import com.example.demo.entity.RepresentanteEntity;

public class RepresentanteModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public RepresentanteModel() {
		
	}

	public RepresentanteModel(RepresentanteEntity entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
	}
	
	private String nome;
	
	private Long id;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
