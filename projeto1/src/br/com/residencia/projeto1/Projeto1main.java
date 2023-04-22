package br.com.residencia.projeto1;

import java.util.Scanner;

public class Projeto1main {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Insira seu nome e sobrenome:");
		String name = myObj.next();
		String lastname = myObj.next();
		myObj.close();		
		
		System.out.println("Bem vindo " + name + " " + lastname + " a programação" );
		

		

	}

}
