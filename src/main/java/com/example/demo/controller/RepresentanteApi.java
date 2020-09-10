package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RepresentanteModel;
import com.example.demo.service.RepresentanteService;

@RestController
@RequestMapping("/api")
public class RepresentanteApi {
	
	RepresentanteService service;
	
	@Autowired
	RepresentanteApi(RepresentanteService service){
		this.service = service;
	}

	@GetMapping("/representante")
	public List<RepresentanteModel> buscaRepresentante() {
		return service.buscarRepresentante();
	}
	
	@GetMapping("/representante/{id}")
	public RepresentanteModel buscaRepresentanteById(@PathVariable(value = "id") Long id) {
		return service.buscarRepresentante(id);
	}
	
	
	@PostMapping(value = "/representante", consumes = "application/json")
	public void cadastroRepresentante(@RequestBody RepresentanteModel body ) {
		service.gravaRepresentante(body); 
	}
}
