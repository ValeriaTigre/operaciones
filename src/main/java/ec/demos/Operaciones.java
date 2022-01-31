package ec.demos;

public class Operaciones {
	public int value1;
	public int value2;
	public int value3;
	public int value4;
	
	
	
	public Operaciones() {
		
		this.value1 = 0;
		this.value2 = 0;
	}



	public void sumar () {
		int suma = value1 + value2;
		System.out.println("Suma" +suma);
		
	}



	public int getValue1() {
		return value1;
	}



	public void setValue1(int value1) {
		this.value1 = value1;
	}



	public int getValue2() {
		return value2;
	}



	public void setValue2(int value2) {
		this.value2 = value2;
	}

	

}
