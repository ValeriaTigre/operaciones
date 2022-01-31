package ec.demos;

public class OperResta {

	public int value3;
	public int value4;
	
	public OperResta() {
		
		this.value3 = 0;
		this.value4 = 0;
	}
	
	public void restar () {
		int resta = value3 - value4;
		System.out.println("Resta" +resta);
	}

	public int getValue3() {
		return value3;
	}

	public void setValue3(int value3) {
		this.value3 = value3;
	}

	public int getValue4() {
		return value4;
	}

	public void setValue4(int value4) {
		this.value4 = value4;
	}
}
