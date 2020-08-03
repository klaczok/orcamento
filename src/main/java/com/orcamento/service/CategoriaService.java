package com.orcamento.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orcamento.model.dto.CategoriaDto;
import com.orcamento.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<CategoriaDto> findAllCategoria(){
		return categoriaRepository.findAll().stream().map(c -> new CategoriaDto(c.getCodigo(), c.getNome())).collect(Collectors.toList());
	}

}
