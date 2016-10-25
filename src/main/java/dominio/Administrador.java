package dominio;

public class Administrador extends Usuario{
	
	public Administrador(){
		//Construtor padrão
	}
	
	public Administrador(String login, String senha){
		super(login, senha);
	} 
}