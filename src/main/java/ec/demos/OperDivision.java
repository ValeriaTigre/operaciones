package ec.demos;

public class OperDivision {
	public int value7;
	public int value8;

public  OperDivision () {
	this.value7 = 0;
	this.value8 = 0;
	
}

public void Dividir () {
	int Division = value7 / value8;
	System.out.println("Division" +Division);

}

public int getValue7() {
	return value7;
}

public void setValue7(int value7) {
	this.value7 = value7;
}

public int getValue8() {
	return value8;
}

public void setValue8(int value8) {
	this.value8 = value8;
}

}
