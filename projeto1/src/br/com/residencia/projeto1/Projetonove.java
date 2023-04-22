package br.com.residencia.projeto1;
	import java.util.Scanner;
public class Projetonove {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String nome, nome1;
		
		System.out.println("Qual é o seu nome ? ");
		nome = read.nextLine();
		System.out.println( nome  + ", como você gostaria de ser chamado ? ");
		nome1 = read.nextLine();
		read.close();
		System.out.println("Bem vindo " + nome1 + " ao programa");
		
		
		
	}

}
