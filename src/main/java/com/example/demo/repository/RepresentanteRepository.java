package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RepresentanteEntity;

@Repository
public interface RepresentanteRepository extends JpaRepository<RepresentanteEntity, Long> {
	List<RepresentanteEntity> findAll();
	RepresentanteEntity getOne(Long id);
}
