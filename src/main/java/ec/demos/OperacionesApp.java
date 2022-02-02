package ec.demos;

import java.sql.Date;

import ec.demos.damain.Cliente;

public class OperacionesApp {

	public static void main(String[] args) {
		Operaciones operaciones = new Operaciones ();
		operaciones.setValue1(50);
		operaciones.setValue2(83);
		operaciones.sumar();

		
		
	
    Cliente  cliente=new Cliente();
    
    cliente.setCedula("801");
    cliente.setNombre("Jhons Quinche");
    cliente.setDireccion("Biblian");
    cliente.setEmail("quinchesjohns@gmail.com");
    cliente.setFechallacimiento("02/01/2001");
    
    
  Cliente  cliente2=new Cliente();
    
    cliente2.setCedula("802");
    cliente2.setNombre("Valeria Dominguez");
    cliente2.setDireccion("Azogues");
    cliente2.setEmail("valedominguez@hotmail.com");
    cliente2.setFechallacimiento("1993/06/16");

    
  System.out.println(cliente);
  cliente.nacimiento();
	}
	
	
}

