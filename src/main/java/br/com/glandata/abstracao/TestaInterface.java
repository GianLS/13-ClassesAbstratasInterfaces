package br.com.glandata.abstracao;

import br.com.glandata.abstracao.service.Carro;

public class TestaInterface {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setNome("Fusca");
		carro.liga();
		carro.buzina();
		System.out.println(carro.velocidadeMaxima());
		
		System.out.println(carro);
		
	}

}
