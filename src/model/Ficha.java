package model;

public class Ficha 
{	
	private Vacina fichaVacina;
	private Consultas fichaConsulta;
	
	public Ficha(Vacina fichaVacina, Consultas fichaConsulta)
	{
		super();
		this.fichaVacina = fichaVacina;
		this.fichaConsulta = fichaConsulta;
	}

	public Vacina getFichaVacina() 
	{
		return fichaVacina;
	}

	public void setFichaVacina(Vacina fichaVacina) 
	{
		this.fichaVacina = fichaVacina;
	}

	public Consultas getFichaConsulta() 
	{
		return fichaConsulta;
	}

	public void setFichaConsulta(Consultas fichaConsulta) 
	{
		this.fichaConsulta = fichaConsulta;
	}
	
	

}
