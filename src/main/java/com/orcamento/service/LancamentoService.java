package com.orcamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orcamento.model.Categoria;
import com.orcamento.model.Lancamento;
import com.orcamento.model.dto.LancamentoDto;
import com.orcamento.model.form.LancamentoForm;
import com.orcamento.repository.LancamentoRepository;

@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository lancamentoRepository;

	public LancamentoDto save(LancamentoForm lancamentoForm) {
		Lancamento lancamento = new Lancamento();
		Categoria categoria = new Categoria();
		categoria.setCodigo(lancamentoForm.getCodigo());
		lancamento.setCodigo(lancamentoForm.getCodigo());
		lancamento.setDescricao(lancamentoForm.getDescricao());
		lancamento.setDataPagamento(lancamentoForm.getDataPagamento());
		lancamento.setDataVencimento(lancamentoForm.getDataVencimento());
		lancamento.setValor(lancamentoForm.getValor());
		lancamento.setObservacao(lancamentoForm.getObservacao());
		lancamento.setTipo(lancamentoForm.getTipo());
		lancamento.setCategoria(categoria);
		lancamentoRepository.save(lancamento);
		return new LancamentoDto(lancamento.getCodigo(), lancamento.getDescricao(), lancamento.getDataVencimento(),
				lancamento.getDataVencimento(), lancamento.getValor(), lancamento.getObservacao(), lancamento.getTipo(),
				lancamento.getCategoria());
	}

}
