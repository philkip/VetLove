package model;

public class Animal 
{
	private String tipo, raca, dataNascimento;
	Ficha ficha;
	
	public Animal(String tipo, String raca, String dataNascimento, Ficha ficha) 
	{
		super();
		this.tipo = tipo;
		this.raca = raca;
		this.dataNascimento = dataNascimento;
		this.ficha = ficha;
	}
	
	public double getGastosVacinas()
	{
		double total = 0;
		
		for(Vacina v : ficha.getVacinas())
		{
			total += v.getPreco();
		}
		
		return total;
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

	public Ficha getFicha() 
	{
		return ficha;
	}

	public void setFicha(Ficha ficha) 
	{
		this.ficha = ficha;
	}
	
	
		
}
