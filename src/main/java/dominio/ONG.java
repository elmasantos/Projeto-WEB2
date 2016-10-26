package dominio;

public class ONG extends Usuario{
	private String nome;
	private String email;
	private String endereco;
	private String descricao;
	private String telefone;
	
	public ONG(){
		//Construtor padrão
	}
	
	public ONG(String login, String senha, String nome, String email, String endereco,
			String descricao, String telefone){
		super(login, senha);
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.descricao = descricao;
		this.telefone = telefone;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEndereco(){
		return endereco;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setDescricao(String decricao){
		this.descricao = descricao;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
}