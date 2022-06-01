package br.com.glandata.abstracao.service;

import lombok.Getter;
import lombok.Setter;

public abstract class Funcionario {
	@Getter
	@Setter
	private String nome;

	@Getter
	@Setter
	private double salario;

	public abstract double calculaHoras();

	public double getBonificacao() {
		return this.salario * 0.1;
	}
}
