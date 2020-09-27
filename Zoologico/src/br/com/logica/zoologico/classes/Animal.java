package br.com.logica.zoologico.classes;



public class Animal {
	
	//Atributos ou Proriedades do Objeto
	//Neste momento as Propriedades sao Publicas
	 private String nome;
	 private String especie;
	 private int idade;
	
public void setNome(String nome) {
	this.nome = nome;
	
}
public String getNome() {
	return nome;
}

	public void  setEspecie(String especie) {
		this.especie=especie;
		
		
}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setIdade(int idade) {
		
		this.idade=idade;
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

