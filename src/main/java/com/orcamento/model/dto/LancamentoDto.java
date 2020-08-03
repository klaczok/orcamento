package com.orcamento.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.orcamento.model.Categoria;
import com.orcamento.model.enumerated.TipoLancamento;
import com.orcamento.model.form.CategoriaForm;

public class LancamentoDto {
	private Long codigo;
	private String descricao;
	private LocalDate dataVencimento;
	private LocalDate dataPagamento;
	private BigDecimal valor;
	private String observacao;
	private TipoLancamento tipo;
	private CategoriaForm categoria;
	public LancamentoDto() {
	}
	public LancamentoDto(Long codigo, String descricao, LocalDate dataVencimento, LocalDate dataPagamento,
			BigDecimal valor, String observacao, TipoLancamento tipo, Categoria categoria) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		this.valor = valor;
		this.observacao = observacao;
		this.tipo = tipo;
		this.categoria = new CategoriaForm(categoria.getCodigo());
	}

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public TipoLancamento getTipo() {
		return tipo;
	}
	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo;
	}
	public CategoriaForm getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaForm categoria) {
		this.categoria = categoria;
	}
	
	
	

}
