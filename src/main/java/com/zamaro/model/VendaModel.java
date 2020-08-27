package com.zamaro.model;

import java.io.Serializable;

public class VendaModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//TODO Implementar atributos venda
	
	public class Venda{
		private float venda;
		private double idCliente;
		private String formaDePagamento;
		private int parcelas;
		private int idStatus;
		private String agendamento;
		private String dataDaVenda;
		
		public Venda(float venda , double idCliente, String formaDePagamento, int parcelas,
			int idStatus, String agendamento, String dataDaVenda){
			
		}

		public float getVenda() {
			return venda;
		}

		public void setVenda(float venda) {
			this.venda = venda;
		}

		public double getIdCliente() {
			return idCliente;
		}

		public void setIdCliente(double idCliente) {
			this.idCliente = idCliente;
		}

		public String getFormaDePagamento() {
			return formaDePagamento;
		}

		public void setFormaDePagamento(String formaDePagamento) {
			this.formaDePagamento = formaDePagamento;
		}

		public int getParcelas() {
			return parcelas;
		}

		public void setParcelas(int parcelas) {
			this.parcelas = parcelas;
		}

		public int getIdStatus() {
			return idStatus;
		}

		public void setIdStatus(int idStatus) {
			this.idStatus = idStatus;
		}

		public String getAgendamento() {
			return agendamento;
		}

		public void setAgendamento(String agendamento) {
			this.agendamento = agendamento;
		}

		public String getDataDaVenda() {
			return dataDaVenda;
		}

		public void setDataDaVenda(String dataDaVenda) {
			this.dataDaVenda = dataDaVenda;
		}
		
		
		
	}
}
