package controller;

import java.util.ArrayList;

import model.Animal;
import model.Cliente;
import model.Vacina;

public class gereCliente 
{
	ArrayList<Cliente> arCliente;
	
	public gereCliente()
	{
		this.arCliente = new ArrayList<Cliente>();
	}

	public void addCliente(String nome, String morada, String email, String telefone)
	{			
		Cliente cli = new Cliente(nome, morada, email, telefone);
		
		int novoID = arCliente.size();
		
		cli.setClientID(novoID);
		
		arCliente.add(cli);	
	}
	
	public Cliente getCliente(int id)
	{
		for(Cliente cli : arCliente)
		{
			if(cli.getClientID() == id)
				return cli;
		}
		
		return null;
	}
	
	public double getGastoVacinas(Cliente cli)
	{
		double totalVacAnimais = 0;
			
		for(Animal a : cli.getAnimais())//Para cada animal
		{
			double totalVacinaAnimal = 0;
				
			for(Vacina v : a.getFicha().getVacinas())//Para cada vacina
			{
				totalVacinaAnimal += v.getPreco();
			}
				
			totalVacAnimais += totalVacinaAnimal;
			/*
			 * Pode ser substituido por
			 * */
			//totalVacAnimais += a.getGastosVacinas();
		}
				
		return totalVacAnimais;
	}
	
}
