package br.com.poo.pessoa;

public class Gerente extends Funcionario{

	private int numFuncionarios;
	
	
	
	//@Override
	public Double getBonificacao(){
		//return getSalario() + getSalario()*0.15;
	return super.getBonificacao() + getSalario()*0.05 ;
	}

	
	
}
