package br.com.glandata.abstracao;

import br.com.glandata.abstracao.service.Gerente;

public class App {
	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.testaMetodo();
		System.out.println(gerente.calculaHoras());
	}
}