package com.orcamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orcamento.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
