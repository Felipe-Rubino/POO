package br.com.poo.pessoa;

public class FolhaPagamento {

	public Double calcularFolhaPagamento(Funcionario nome) {
		return nome.getSalario()+nome.getBonificacao();
	
		
	
	}



}

