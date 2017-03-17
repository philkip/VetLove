package model;

public class Cliente 
{
	private int clientID;
	private String nome, morada, email, telefone;
	
	public Cliente(int clientID, String nome, String morada, String email, String telefone) 
	{
		super();
		this.clientID = clientID;
		this.nome = nome;
		this.morada = morada;
		this.email = email;
		this.telefone = telefone;
	}

	public int getClientID() 
	{
		return clientID;
	}

	public void setClientID(int clientID) 
	{
		this.clientID = clientID;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getMorada() 
	{
		return morada;
	}

	public void setMorada(String morada) 
	{
		this.morada = morada;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getTelefone() 
	{
		return telefone;
	}

	public void setTelefone(String telefone) 
	{
		this.telefone = telefone;
	}
	
}
