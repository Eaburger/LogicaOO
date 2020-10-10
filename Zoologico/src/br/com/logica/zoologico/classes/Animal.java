package br.com.logica.zoologico.classes;



public abstract class Animal {
	
	//Atributos ou Proriedades do Objeto
	//Neste momento as Propriedades sao Publicas
	 private String nome;
	 private String especie;
	 protected int idade;
	 protected boolean estaVivo;

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
	
		
		
	

	
		
	

	public Animal(String nome) {
		
	this.nome=nome;
	}
	
	
	
	public boolean isEstaVivo() {
		return estaVivo;
	}
	
	
		
		
	}

	
	
	

		

