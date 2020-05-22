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
  private UsuarioRepository usuarioRepository;

  public static void main(String[] args) {
    SpringApplication.run(ApiRestfulSpringbootReferenciaApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner() {
    return args -> {

      Usuario usuario = new Usuario();
      usuario.setEmail("usuario@email.com");
      usuario.setPerfil(PerfilEnum.ROLE_USUARIO);
      usuario.setSenha(SenhaUtils.gerarBCrypt("123456"));
      this.usuarioRepository.save(usuario);

      Usuario admin = new Usuario();
      admin.setEmail("admin@email.com");
      admin.setPerfil(PerfilEnum.ROLE_ADMIN);
      admin.setSenha(SenhaUtils.gerarBCrypt("123456"));
      this.usuarioRepository.save(admin);

    };
  }

}
