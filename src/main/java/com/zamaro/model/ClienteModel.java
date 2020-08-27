package com.zamaro.model;

import java.io.Serializable;

public class ClienteModel implements Serializable {

	private static final long serialVersionUID = 1L;

	//TODO Implementar dados  Cliente
	
	public class Cliente{
		private int id;
		private String nome;
		private double telefone;
		private int idRepresentante;
		private double cep;
		
		
		public Cliente (int id, String nome, double telefone, int idRepresentante,
				double cep) {
			
			this.id = id;
			this.nome = nome;
			this.telefone = telefone;
			this.idRepresentante = idRepresentante;
			this.cep = cep;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public double getTelefone() {
			return telefone;
		}


		public void setTelefone(double telefone) {
			this.telefone = telefone;
		}


		public int getIdRepresentante() {
			return idRepresentante;
		}


		public void setIdRepresentante(int idRepresentante) {
			this.idRepresentante = idRepresentante;
		}


		public double getCep() {
			return cep;
		}


		public void setCep(double cep) {
			this.cep = cep;
		}
		
	}

}
