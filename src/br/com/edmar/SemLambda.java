package br.com.edmar;

import java.util.List;

public class SemLambda {
	public static void main(String[] args) {
		List<Pessoa> lista = new Pessoa().listPessoas();
		System.out.println(lista);
	}
}
