package br.com.glandata.abstracao.service;

public interface Veiculo {

	String setNome(String nome);
	
	void liga();
	
	int velocidadeMaxima();
	
	void buzina();
}
