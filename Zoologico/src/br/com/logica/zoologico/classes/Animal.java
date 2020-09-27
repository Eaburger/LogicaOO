package br.com.logica.zoologico.classes;



public class Animal {
	
	//Atributos ou Proriedades do Objeto
	//Neste momento as Propriedades sao Publicas
	 private String nome;
	 private String especie;
	 private int idade;

		public Animal(String nome, String especie, int idade) {
			this.nome = nome;
			this.especie=especie;
			this.idade= idade;
			
		}

	

public String getNome() {
	return nome;
}


	
	public String getEspecie() {
		return especie;
	}
	
	
	
	public int getIdade() {
		return idade;
	}
	public void emitirSom() {
		System.out.println("Som do Animal");
		
		
	}

	public  boolean isAdulto() {
		return idade >=1;
		
		
	}
	



}

