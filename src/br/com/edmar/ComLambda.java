package br.com.edmar;

import java.util.List;

public class ComLambda {
	public static void main(String[] args) {
		List<Pessoa> lista = new Pessoa().listPessoas();
		
		lista.stream()
				.filter(pessoa -> pessoa.getGenero().equals("F"))
				.forEach(p -> System.out.println(p.getNome()));
	}
}
