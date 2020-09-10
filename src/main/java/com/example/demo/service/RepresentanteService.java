package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.RepresentanteEntity;
import com.example.demo.model.RepresentanteModel;
import com.example.demo.repository.RepresentanteRepository;

@Service
public class RepresentanteService {
	
	RepresentanteRepository repository;
	
	@Autowired
	public RepresentanteService(RepresentanteRepository repository) {
		this.repository = repository;
	}
	
	
	public List<RepresentanteModel> buscarRepresentante(){
		
		List<RepresentanteEntity> listaEntity = repository.findAll();
		
		List<RepresentanteModel> listaModel = new ArrayList<RepresentanteModel>();
		
		RepresentanteModel representante = null;
		
		listaEntity.forEach(item -> {
			listaModel.add(new RepresentanteModel(item));
		});
		
		return listaModel;
	}
	
	public RepresentanteModel buscarRepresentante(Long id) {
		RepresentanteEntity entity = repository.getOne(id);
		RepresentanteModel model = new RepresentanteModel(entity);
		return model;
	}
	
	public void gravaRepresentante(RepresentanteModel model) {
		
		RepresentanteEntity entity = new RepresentanteEntity();
		//entity.setId(model.getId());
		entity.setNome(model.getNome());
		
		repository.save(entity);
	}
}
