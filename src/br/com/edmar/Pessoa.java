package br.com.edmar;

import java.util.List;

public class Pessoa {
	private String nome;
	private String genero;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String genero) {
		this.nome = nome;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public List<Pessoa> listPessoas() {
		Pessoa pessoa1 = new Pessoa("Edmar", "M");
		Pessoa pessoa2 = new Pessoa("Ana", "F");
		Pessoa pessoa3 = new Pessoa("Fábio", "M");
		Pessoa pessoa4 = new Pessoa("Ednea", "F");
		Pessoa pessoa5 = new Pessoa("Beatriz", "F");
		return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5);
				
	}

	@Override
	public String toString() {
		return nome + " - " + genero;
	}
	
	
}
