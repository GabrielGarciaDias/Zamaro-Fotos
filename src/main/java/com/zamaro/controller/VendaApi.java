package com.zamaro.controller;

import java.util.List;

import com.zamaro.model.VendaModel;

public interface VendaApi {
	List<VendaModel> getTodasVendas();
	VendaModel getVendas();
	void cadastrarVendas();
}
