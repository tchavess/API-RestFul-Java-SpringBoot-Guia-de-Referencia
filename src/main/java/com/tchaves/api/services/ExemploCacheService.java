package com.tchaves.api.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
public class ExemploCacheService {
  private static final Logger logger = LoggerFactory.getLogger(ExemploCacheService.class);

  @Cacheable("exemploCache")
  public String exemploCache(){
    logger.info("### Executando o serviço....");
    return "Teste de exemplo de Cache";
  }
}
