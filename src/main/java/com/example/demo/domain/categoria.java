package com.example.demo.domain;

import java.util.Objects;
import java.io.Serializable;

public class categoria implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	
	public categoria() {
		
	}

	public categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		categoria other = (categoria) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}