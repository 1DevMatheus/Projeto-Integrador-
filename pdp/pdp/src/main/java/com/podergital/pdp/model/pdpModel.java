package com.podergital.pdp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//Declarando que criaremos a tabela de temas dentro do mysql

@Entity
@Table(name = "tb_temas")
public class pdpModel {

//Itens dentro da tabela temas do projeto

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "Defina o tema de sua postagem!")
	@Size(min = 5, max = 66)
	private String musica;
	
	@NotNull(message = "Defina o tema de sua postagem!")
	@Size(min = 5, max = 66)
	private String filmes;
	
	@NotNull(message = "Defina o tema de sua postagem!")
	@Size(min = 5, max = 66)
	private String artes;
	
	@NotNull(message = "Defina o tema de sua postagem!")
	@Size(min = 5, max = 66)
	private String esporte;
	
	@NotNull(message = "Defina o tema de sua postagem!")
	@Size(min = 5, max = 66)
	private String projetos_sociais;
	
	@NotNull(message = "Defina o tema de sua postagem!")
	@Size(min = 5, max = 66)
	private String outros;

	//metodos getters e setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	public String getFilmes() {
		return filmes;
	}

	public void setFilmes(String filmes) {
		this.filmes = filmes;
	}

	public String getArtes() {
		return artes;
	}

	public void setArtes(String artes) {
		this.artes = artes;
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public String getProjetos_sociais() {
		return projetos_sociais;
	}

	public void setProjetos_sociais(String projetos_sociais) {
		this.projetos_sociais = projetos_sociais;
	}

	public String getOutros() {
		return outros;
	}

	public void setOutros(String outros) {
		this.outros = outros;
	}
	
	
}
