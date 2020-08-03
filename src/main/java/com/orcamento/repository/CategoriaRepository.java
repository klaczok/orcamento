package com.orcamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orcamento.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
}
