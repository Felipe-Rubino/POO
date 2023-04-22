package br.com.residencia.projeto1;

 import java.util.Scanner;

public class Projetosete {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double F;
		double C;
		
		System.out.println("Temperatura em C: ");
		C = read.nextDouble();
		F =(C * 1.8) + 32;
		System.out.println("A temperatura em F será : " + F );
		
		
		
		
		
		
		
		
		
		
		
		read.close();
	}

}
