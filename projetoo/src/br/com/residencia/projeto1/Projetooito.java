package br.com.residencia.projeto1;

	import java.util.Scanner;

public class Projetooito {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num;
		
		System.out.println("Quantos produtos você quer comprar ? ");
		num = read.nextInt();	
		read.close();
		System.out.println("Parabéns por comprar " + num + " produtos!");
		
	
	}

}
