package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;

public class gereCliente 
{
	ArrayList<Cliente> arCliente;
	
	public gereCliente()
	{
		arCliente = new ArrayList<>();
		
		addCliente();
		visualizarData();
	}

	public void addCliente()
	{			
		int clientID = 0;
		String nome;
		String morada;
		String email;
		String telefone;
		
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Nome: ");
			nome = sc.nextLine();
			System.out.println("Morada: ");
			morada = sc.nextLine();
			System.out.println("E-mail: ");
			email = sc.nextLine();
			System.out.println("Telefone: ");
			telefone = sc.nextLine();
			clientID++;
		}
		finally
		{
			sc.close();
		}
		
		Cliente cli = new Cliente(arCliente.size(), nome, morada, email, telefone);
		
		arCliente.add(cli);
	}
	
	public void visualizarData()
	{
		for(int i = 0; i < arCliente.size(); i++)
		{
			System.out.println(arCliente.get(i).getClientID());
			System.out.println(arCliente.get(i).getNome());
			System.out.println(arCliente.get(i).getMorada());
			System.out.println(arCliente.get(i).getEmail());
			System.out.println(arCliente.get(i).getTelefone());
		}
		
	}
	
}
