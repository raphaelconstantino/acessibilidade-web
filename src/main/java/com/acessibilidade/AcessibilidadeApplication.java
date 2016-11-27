package com.acessibilidade;

  
  import org.springframework.boot.SpringApplication;
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  import org.springframework.boot.orm.jpa.EntityScan;
  import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
   
  @SpringBootApplication
  @EntityScan(basePackages = {
              "com.acessibilidade"
              })
  @EnableJpaRepositories(basePackages = {
              "com.acessibilidade"
              })
  public class AcessibilidadeApplication {
   
      public static void main(String[] args) {
          SpringApplication.run(AcessibilidadeApplication.class, args);    
      }
      
  }