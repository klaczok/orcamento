package com.orcamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orcamento.model.dto.LancamentoDto;
import com.orcamento.model.form.LancamentoForm;
import com.orcamento.service.LancamentoService;

@RestController
@RequestMapping("/lancamento")
public class LancamentoController {
	
	@Autowired
	private LancamentoService lancamentoService;
	
	@PostMapping
	public ResponseEntity<LancamentoDto> createLancamento(@RequestBody LancamentoForm lancamento){
		return ResponseEntity.status(HttpStatus.CREATED).body(lancamentoService.save(lancamento));
	}

}
