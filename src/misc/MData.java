package misc;

import java.util.ArrayList;

import model.Animal;
import model.Cliente;
import model.Consultas;
import model.Ficha;
import model.Vacina;

public class MData 
{
	public static Vacina vac = new Vacina("200317", "rabiolis", 13.4);
	public static Consultas con = new Consultas("200317", "Validar vacinas");
	public static ArrayList<Vacina> arvacs = new ArrayList<Vacina>();
	public static ArrayList<Consultas> arcons = new ArrayList<Consultas>();
	
	public static Ficha fl = Ficha(arvacs, arcons);
	
	public static Animal an = new Animal("Cao", "Pastor Alemao", "200117", fl);
	public static Cliente cl = new Cliente("Abel", "Seixal", "abel@gmail.com", "948754126");
	
	public static void fillData()
	{
		arvacs.add(vac);
		arcons.add(con);
		cl.getAnimais().add(an);
	}
}
