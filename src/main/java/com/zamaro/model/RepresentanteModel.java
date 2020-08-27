package com.zamaro.model;

import java.io.Serializable;

public class RepresentanteModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//TODO Incluir variaveis cliente
	
	public class Representante{
		private int id;
		private String nome;

	
		public Representante (int id, String nome) {
			
			this.id = id;
			this.nome = nome;
		}


		public int getIdRepresentante() {
			return id;
		}


		public void setIdRepresentante(int id) {
			this.id = id;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}
		
	}
}
