package ec.demos;

public class Calculadora extends Operaciones {
	
	public void modulo() {
		int resultado= getValue2() % getValue2();
		System.out.println("Modulo=" +resultado);
	}
	public void multiplicacion(){
		int result= getValue() * getValue2();
		System.out.println("Modulo: " + result);
	}
}
