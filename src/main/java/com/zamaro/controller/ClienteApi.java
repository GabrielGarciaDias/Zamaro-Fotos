package com.zamaro.controller;

import java.util.List;

import com.zamaro.model.ClienteModel;

public interface ClienteApi {
	
	List<ClienteModel> getTodosClientes();
	ClienteModel getCliente();
	void cadastrarCliente();
	
}
