package br.com.poo.contas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraEscrita {
	
	
	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	
	public static void leitor(String path) throws IOException {
		BufferedReader buffread = new BufferedReader(new FileReader(PATH_BASICO+path+EXTENSAO));
		String linha = "";
		while(true) {
			linha = buffread.readLine();
			if (linha != null) {
				String[] dados=linha.split(";");
				System.out.println(linha);
			}else {
				break;
				}
			
		}
				
		buffread.close();
	}
	
}
