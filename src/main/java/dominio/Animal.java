package dominio;

public class Animal {
	private String nome;
	private String ra�a;
	private int idade;
	
	public Animal(){
		
	}
	
	public Animal(String nome, String ra�a, int idade){
		this.nome = nome;
		this.ra�a = ra�a;
		this.idade = idade;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getRa�a(){
		return ra�a;
	}
	
	public void setRa�a(String ra�a){
		this.ra�a = ra�a;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
}
