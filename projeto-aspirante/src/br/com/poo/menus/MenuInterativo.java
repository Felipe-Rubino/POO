package br.com.poo.menus;

import java.util.Scanner;

public class MenuInterativo {
	
	private String inputcpf;
	private String inputSenha;
	private Scanner sc = new Scanner(System.in);

	public void login() {
		System.out.println("Digite seu CPF");
		inputcpf = sc.next();
		System.out.println("Digite sua senha");
		inputSenha = sc.next();
		
	}
	




}



	