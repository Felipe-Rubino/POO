package br.com.residencia.projeto1;
	import java.util.Scanner;
	
public class Projetoscinco {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double num;
		double num1;
		double soma;
		double sub;
		double mult;
		double div;
		double rest;
		
		
		System.out.println("Digite o primeiro número: ");
		num = read.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		num1 = read.nextDouble();
		
		soma = num + num1;
		sub = num - num1;
		mult = num * num1;
		div = num / num1;
		rest = num % num1;
		
		System.out.println("A soma é " + soma );
		System.out.println("A subtração é " + sub );
		System.out.println("A multiplicação é " + mult );
		System.out.println("A divisão é " + div );
		System.out.println("O resto da divisão é " + rest );
		
		read.close();
	
	}
	

}
