package com.acessibilidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Ouch {
 
 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    private String titulo;
    private StringBuffer descricao;
    private String link;
    private String video;
    private String imagem;
 
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public StringBuffer getDescricao() {
        return descricao;
    }
 
    public void setDescricao(StringBuffer descricao) {
        this.descricao = descricao;
    }
    
    public String getLink() {
        return link;
    }
 
    public void setLink(String link) {
        this.link = link;
    }
    
    public String getVideo() {
        return video;
    }
 
    public void setVideo(String video) {
        this.video = video;
    }
    
    public String getImagem() {
        return imagem;
    }
 
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
   
}