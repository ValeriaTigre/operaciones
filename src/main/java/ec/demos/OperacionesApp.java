package ec.demos;

public class OperacionesApp {

	public static void main(String[] args) {
		Operaciones operaciones = new Operaciones ();
		operaciones.setValue1(50);
		operaciones.setValue2(83);
		operaciones.sumar();

		OperResta oper = new OperResta();
		oper.setValue3(20);
		oper.setValue4(5);
		oper.restar();
		
		OperMultiplicacion oper1 = new OperMultiplicacion();
		oper1.setValue5(30);
		oper1.setValue6(6);
		oper1.Multiplicar();
		
		OperDivision oper2 = new OperDivision();
		oper2.setValue7(90);
		oper2.setValue8(5);
		oper2.Dividir();
		
	}


	}


