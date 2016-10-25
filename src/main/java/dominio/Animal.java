package dominio;

public class Animal {
	private String nome;
	private String raça;
	private int idade;
	
	public Animal(){
		
	}
	
	public Animal(String nome, String raça, int idade){
		this.nome = nome;
		this.raça = raça;
		this.idade = idade;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getRaça(){
		return raça;
	}
	
	public void setRaça(String raça){
		this.raça = raça;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
}
