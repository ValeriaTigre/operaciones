package ec.demos;

public class Operaciones {
	
	public int value;
	public int value2;
	
	
		
		public Operaciones(int value, int value2) {
			super();
			this.value = value;
			this.value2 = value2;
		}
		
		public Operaciones() {
			this.value=0;
			this.value2=0;
		}
		

		public void suma(){
			int suma= value + value2;
			System.out.println("Suma: " + suma);
		}
		
		public void resta(){
			int resta= value + value2;
			System.out.println("Resta: " + resta);
		}
		
		public void multiplicacion(){
			int mult= value + value2;
			System.out.println("Multiplicacion: " + mult);
		}
		
		public void division (){
			int div= value/value2;
			System.out.println("Division: " + div);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public int getValue2() {
			return value2;
		}

		public void setValue2(int value2) {
			this.value2 = value2;
		}
}