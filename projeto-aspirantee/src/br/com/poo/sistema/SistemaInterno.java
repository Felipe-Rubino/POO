package br.com.poo.sistema;

import java.util.ArrayList;
import java.util.List;

import br.com.poo.contas.ContaPoupanca;
import br.com.poo.enums.PessoaEnum;
import br.com.poo.pessoa.Funcionario;
import br.com.poo.pessoa.Gerente;
import br.com.poo.pessoa.OperadorCaixa;

public class SistemaInterno  {
	private static final String GERENTE = "GERENTE";
	private static final String DIRETOR = "DIRETOR";
	private static final String PRESIDENTE = "PRESIDENTE";
	private static final String OPERADOR_CAIXA = "OPERADOR_CAIXA";

	

	public static void main(String[] args) {
			
	
		
		List lista = new ArrayList();	
		lista.add("Manoel");
		lista.add("fELIPE");
				
		System.out.println(lista);
				
		
	System.out.println("Banco Rubino");
		
		
		Funcionario gr1 = new Gerente();
		gr1.setSalario(1000.0);
		
		Funcionario operCaixa = new OperadorCaixa();
		operCaixa.setSalario(500.0);
		
		System.out.println("Gerente " + gr1.getSalario() + " " + gr1.getBonificacao());
		System.out.println("Caixa " + operCaixa.getSalario() + " " + operCaixa.getBonificacao());
			
		Double salarioBonificacao = gr1.calcularFolhaPagamento(gr1);
		System.out.println("GERENTE" + salarioBonificacao);
		ContaPoupanca felipe = new ContaPoupanca("Felipe");	
		felipe.setRendimento(10.0);
		System.out.println("Seu rendimento é de: " + felipe.getRendimento()+ " por cento ");
		System.out.println("Parabéns " + felipe.getTitular() + " sua conta foi aberta!");
		felipe.getRendimento();
		felipe.depositar(1000.0);
		System.out.println(felipe.getSaldo());
		//Conta lucas = new Conta("321" , "678","Lucas", 50.0); 
		////lucas.setAgencia("345");
		//lucas.setNumConta("678");
		//lucas.setTitular("Lucas");
		//felipe.getSaldo();
		//lucas.getSaldo();
		
		felipe.depositar(10.0);
		//lucas.depositar(50.0);
		//System.out.println(felipe.toString());
		//System.out.println(felipe.getSaldo());
		//System.out.println(lucas.getSaldo());
		////felipe.transferir(10.0, lucas);
		//System.out.println(lucas.getSaldo());
		///System.out.println(felipe.getSaldo());
		//felipe.sacar(10.0);
		//lucas.depositar(100.0);
		
		
		
	
	}
	
	
	

	



}
