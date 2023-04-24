package br.com.poo.pessoa;



public class Funcionario {

	private String nome;
	private String cpf;
	private String senha;
	private Double salario;

	
	public Double getBonificacao(){
		return this.getSalario() +  this.getSalario()*0.10;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	


	


	



}
