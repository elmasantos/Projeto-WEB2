package dominio;

public class Campanha {
	private String texto;
	
	public Campanha(){
		
	}
	
	public Campanha(String texto){
		this.texto = texto;
	}
	
	public String getTexto(){
		return texto;
	}
	
	public void setTexto(String texto){
		this.texto = texto;
	}
}
