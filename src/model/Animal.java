package model;

public class Animal 
{
	private String tipo;
	private String raca;
	private String dataNascimento;
	
	public Animal(String tipo, String raca, String dataNascimento)
	{
		super();
		this.tipo = tipo;
		this.raca = raca;
		this.dataNascimento = dataNascimento;
	}

	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}

	public String getRaca() 
	{
		return raca;
	}

	public void setRaca(String raca) 
	{
		this.raca = raca;
	}

	public String getDataNascimento() 
	{
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) 
	{
		this.dataNascimento = dataNascimento;
	}
		
}
