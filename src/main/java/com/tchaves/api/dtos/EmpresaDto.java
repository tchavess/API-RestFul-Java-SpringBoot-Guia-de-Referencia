package com.tchaves.api.dtos;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.validation.constraints.NotEmpty;

public class EmpresaDto {

	private Long id;

	@NotEmpty(message = "Razão social não pode ser vazia.")
	@Length(min = 5, max = 200, message = "Razão social deve conter entre 5 e 200 caracteres.")
	private String razaoSocial;

	@NotEmpty(message = "CNPJ não pode ser vazio.")
	@CNPJ(message = "CNPJ inválido.")
	private String cnpj;

	public EmpresaDto() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "EmpresaDto{" +
						"id=" + id +
						", razaoSocial='" + razaoSocial + '\'' +
						", cnpj='" + cnpj + '\'' +
						'}';
	}
}


