package com.zamaro.controller;

import java.util.List;

import com.zamaro.model.RepresentanteModel;

public interface RepresentanteApi {

	List<RepresentanteModel> getListaRepresentante();
	RepresentanteModel getRepresentante();
	void cadastrarRepresentante();
}
