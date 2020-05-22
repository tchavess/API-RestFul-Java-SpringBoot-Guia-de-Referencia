package com.tchaves.api;

import com.tchaves.api.documents.Cliente;
import com.tchaves.api.repositories.ClienteRepository;
import com.tchaves.api.security.entities.Usuario;
import com.tchaves.api.security.enums.PerfilEnum;
import com.tchaves.api.security.repositories.UsuarioRepository;
import com.tchaves.api.services.ExemploCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.tchaves.api.utils.SenhaUtils;


@SpringBootApplication
@EnableCaching
public class ApiRestfulSpringbootReferenciaApplication {

  @Autowired
  private ClienteRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(ApiRestfulSpringbootReferenciaApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner() {
    return args -> {

      repository.save(new Cliente("Alice", 20));
      repository.save(new Cliente("João", 30));
      repository.save(new Cliente("Maria", 40));

      System.out.println("Lista todos com o findAll():");
      System.out.println("-------------------------------");
      repository.findAll().forEach(System.out::println);
      System.out.println();

      System.out.println("Busca um único cliente com o findByNome('Alice'):");
      System.out.println("--------------------------------");
      System.out.println(repository.findByNome("Alice"));
      System.out.println();

      System.out.println("Clientes com idade entre 18 and 35:");
      System.out.println("--------------------------------");
      repository.findByIdadeBetween(18, 35).forEach(System.out::println);


    };
  }

}
