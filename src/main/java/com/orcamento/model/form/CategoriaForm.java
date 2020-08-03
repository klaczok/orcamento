package com.orcamento.model.form;

public class CategoriaForm {

	private Long codigo;
	public CategoriaForm() {
		// TODO Auto-generated constructor stub
	}
	

	public CategoriaForm(Long codigo) {
		super();
		this.codigo = codigo;
	}


	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
}
