package br.com.residencia.projeto1;

import java.util.Scanner;
public class Projeto2 {

	
	public static void main(String[] args) {
	
	Scanner read = new Scanner(System.in);
		
	
	System.out.println("Qual é a idade do primeiro colega? ");
	int age = read.nextInt();
	System.out.println("Qual é a idade do segundo colega? ");
	int age1 = read.nextInt();
	System.out.println("Qual é a idade do terceiro colega? ");
	int age2 = read.nextInt();
	System.out.println("Qual é a idade do quarto colega? ");
	int age3 = read.nextInt();
	System.out.println("Qual é a idade do quinto colega? ");
	int age4 = read.nextInt();
	System.out.println("Qual é a minha idade? ");
	int age5 = read.nextInt();
	read.close();
	int soma = age + age1 + age2 + age3 + age4 + age5; 
	System.out.println("A soma de idades do colegas é " + soma );
	
	
	
	
	}
}
