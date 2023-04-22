package br.com.poo.contas;

public class ContaPoupanca extends Conta {

	private Double rendimento;
	private String titular;
	
	
	public ContaPoupanca(String nome) {
		this.setTitular(nome);
	}
	

	public Double getRendimento() {
		return rendimento;
	}
	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}
	
	
	
	
}
