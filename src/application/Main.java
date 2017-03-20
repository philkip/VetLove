package application;

import controller.gereCliente;
import misc.MData;

public class Main 
{
	public static void main(String[] args) 
	{
		MData.fillData();
		
		gereCliente gc = new gereCliente();
		gc.addCliente(MData.cl);
	}

}
