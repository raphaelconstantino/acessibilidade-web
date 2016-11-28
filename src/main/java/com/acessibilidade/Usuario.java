package com.acessibilidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Usuario {
 
    Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    private String nome;
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
   
}