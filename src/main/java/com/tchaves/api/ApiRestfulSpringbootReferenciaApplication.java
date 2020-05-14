package com.tchaves.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tchaves.api.entities.Empresa;
import com.tchaves.api.repositories.EmpresaRepository;

@SpringBootApplication
public class ApiRestfulSpringbootReferenciaApplication {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiRestfulSpringbootReferenciaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(){
		return args ->{
			
			Empresa empresa = new Empresa();
			empresa.setRazaoSocial("Tchaves Dev");
			empresa.setCnpj("11021317764");
			
			this.empresaRepository.save(empresa);
			
			List<Empresa> empresas = empresaRepository.findAll();
			empresas.forEach(System.out::println);
			
			Optional<Empresa> empresaDb = empresaRepository.findById(1L);
			System.out.println("Empresa por ID: " + empresaDb);
			
			
			
			empresa.setRazaoSocial("KAzALES TI");
			this.empresaRepository.save(empresa);
			
			Empresa empresaCnpj = empresaRepository.findByCnpj("11021317764");
			System.out.println("Empresa por CNPJ: " + empresaCnpj);
			
			this.empresaRepository.deleteById(1L);
			
			empresas = empresaRepository.findAll();
			System.out.println("Empresas: " + empresas.size());
		};
	}

}
