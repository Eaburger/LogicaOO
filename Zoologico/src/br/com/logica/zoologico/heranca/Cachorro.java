package br.com.logica.zoologico.heranca;

import br.com.logica.zoologico.classes.Animal;

public class Cachorro extends Animal{
	
	private void emtir() {
		System.out.println("latindo");

	}
	
	
	@Override
	public  boolean isAdulto() {
		if(estaVivo) {
			
			return idade >=1;
		}else {
			return false;
		}
	

}
}
