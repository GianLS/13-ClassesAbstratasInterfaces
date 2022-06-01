package br.com.glandata.abstracao.service;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Carro implements Veiculo {
	@Getter
	private String nome;

	@Override
	public String setNome(String nome) {
		this.nome = nome;
		return "ok";
	}

	@Override
	public void liga() {
		System.out.println("O carro ligou!");
	}

	@Override
	public int velocidadeMaxima() {
		return 150;
	}

	@Override
	public void buzina() {
		System.out.println("Fon-fon");
	}

}
