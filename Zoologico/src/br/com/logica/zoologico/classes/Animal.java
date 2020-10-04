package br.com.logica.zoologico.classes;



public abstract class Animal {
	
	//Atributos ou Proriedades do Objeto
	//Neste momento as Propriedades sao Publicas
	 private String nome;
	 private String especie;
	 private int idade;
	 private boolean estaVivo;

		public Animal(String nome, String especie, int idade) {
			this.nome = nome;
			this.especie=especie;
			this.idade= idade;
			this.estaVivo = true;
			
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
	
		
		
	

	public  boolean isAdulto() {
		if(estaVivo) {
			
			return idade >=1;
		}else {
			return false;
		}
		
		
	}
	
	public Animal(String nome) {
		
	this.nome=nome;
	}
	
	public abstract void emitirSom() ;
	
	public boolean isEstaVivo() {
		return estaVivo;
	}
	
	public void morrer() {
		this.estaVivo= false;
		
		
	}

	
	
	
}

		

