package br.com.residencia.projeto1;

import java.util.Scanner;

public class projetosquatro {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		Double num1;
		Double num2;
		Double soma;
		
		
		System.out.println("Digite o primeiro número");
		num1 = read.nextDouble();
		
		System.out.println("Digite o segundo número");
		num2 = read.nextDouble();
		
		read.close();
		
		soma =  num1 + num2;
		if(soma%1==0) {
			System.out.println(soma.intValue());
			
		}else {
			System.out.println(soma);
			
		}
		
		
		
		
		
	
		
		
	}

}
