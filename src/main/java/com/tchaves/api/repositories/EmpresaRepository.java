package com.tchaves.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tchaves.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{//Entidade que vamos trabalhar/tipo do foregn key

	Empresa findByCnpj(String cnpj);

}
