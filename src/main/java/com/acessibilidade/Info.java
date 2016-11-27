package com.acessibilidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Info {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    private String titulo;
    private String descricao;
	private String link;
	private String video;
 
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public String getDescricao() {
        return descricao;
    }
 
    public void setDescricao(String descricao) {
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
}