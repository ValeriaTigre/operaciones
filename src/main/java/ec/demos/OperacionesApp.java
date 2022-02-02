package ec.demos;

import java.sql.Date;

import ec.demos.damain.Cliente;

public class OperacionesApp {

	public static void main(String[] args) {

		Calculadora calculadora=new Calculadora();
		calculadora.setValue(40);
		calculadora.setValue2(20);
		calculadora.suma();
		
		calculadora.setValue(90);
		calculadora.setValue2(11);
		calculadora.resta();
		
		calculadora.setValue(65);
		calculadora.setValue2(10);
		calculadora.modulo();
		
		calculadora.setValue(44);
		calculadora.setValue2(35);
		calculadora.multiplicacion();

		
	
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

