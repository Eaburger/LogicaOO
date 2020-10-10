package br.com.logica.zoologico.heranca;



public class Gato extends Animal {

	public Gato(String nome, String especie,int idade) {
		super(nome,especie,idade);
		
		
	}

	public  boolean isAdulto() {
		if(isEstaVivo()) {
			
			return idade >=1;
		}else {
			return false;
		}
	}
	
}

