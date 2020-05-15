package com.tchaves.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.tchaves.api.services.ExemploService;


@SpringBootApplication
public class ApiRestfulSpringbootReferenciaApplication {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiRestfulSpringbootReferenciaApplication.class, args);
	}
	
	/*@Bean
	public CommandLineRunner commandLineRunner(){
		return args ->{
			
			
		};
	}*/

}
