package com.acessibilidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class User {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    private String username;
   
 
    public String getUitulo() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
   
}