package com.tchaves.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tchaves.api.util.SenhaUtils;

@SpringBootApplication
public class ApiRestfulSpringbootReferenciaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiRestfulSpringbootReferenciaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(){
		return args ->{
			String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha encoded: " + senhaEncoded );
			
			senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha encoded novamente: " + senhaEncoded );
			
			System.out.println("Senha valida: " + SenhaUtils.senhaValida("123456", senhaEncoded) );
		};
	}

}
