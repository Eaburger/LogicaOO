package br.com.logica.zoologico.desafio;

import java.util.Scanner;

public class DesafioHerancaClasseAbstrata {
	
	public static void main(String[] args) {
		
		Scanner scann =  new Scanner(System.in);
		
		MeuLivro a = new MeuLivro();
		
		a.setTitulo(scann.nextLine());
		
		System.out.println(a.getTitulo());
		
		
		
		
		
		
		
	}
	
	

}
