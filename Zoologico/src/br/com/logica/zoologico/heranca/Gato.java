package br.com.logica.zoologico.heranca;



public class Gato extends Animal {


@Override
public  boolean isAdulto() {
	if(estaVivo) {
		
		return idade >=2;
	}else {
		return false;
	}
	
}