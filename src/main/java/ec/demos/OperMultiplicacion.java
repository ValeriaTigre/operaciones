package ec.demos;

public class OperMultiplicacion {
	public int value5;
	public int value6;
	
	public OperMultiplicacion() {
		
		this.value5 = 0;
		this.value6 = 0;
	}
	
	public void Multiplicar () {
		int Multiplicacion = value5 * value6;
		System.out.println("Multiplicacion" +Multiplicacion);
	}

	public int getValue5() {
		return value5;
	}

	public void setValue5(int value5) {
		this.value5 = value5;
	}

	public int getValue6() {
		return value6;
	}

	public void setValue6(int value6) {
		this.value6 = value6;
	}



}
