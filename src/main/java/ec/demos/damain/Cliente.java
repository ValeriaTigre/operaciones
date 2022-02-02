package ec.demos.damain;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Cliente {

	private String cedula;
	private String nombre;
	private String direccion;
	private String email;
	private String fechallacimiento;
	
public Cliente() {
	
}




public String getCedula() {
	return cedula;
}




public void setCedula(String cedula) {
	this.cedula = cedula;
}




public String getNombre() {
	return nombre;
}




public void setNombre(String nombre) {
	this.nombre = nombre;
}




public String getDireccion() {
	return direccion;
}




public void setDireccion(String direccion) {
	this.direccion = direccion;
}




public String getEmail() {
	return email;
}




public void setEmail(String email) {
	this.email = email;
}




public String getFechallacimiento() {
	return fechallacimiento;
}




public void setFechallacimiento(String fechallacimiento) {
	this.fechallacimiento = fechallacimiento;
}




public Cliente(String cedula, String nombre, String direccion, String email, String fechallacimiento) {
	super();
	this.cedula = cedula;
	this.nombre = nombre;
	this.direccion = direccion;
	this.email = email;
	this.fechallacimiento = fechallacimiento;
}




@Override
public String toString() {
	return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", email=" + email
			+ ", fechallacimiento=" + fechallacimiento + "]";
}
public void nacimiento() {
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate fecha_Nacimiento = LocalDate.parse( fechallacimiento, formato);
	LocalDate fecha_actual = LocalDate.now();
	
	
	Period periodo = Period.between(fecha_Nacimiento, fecha_actual);
	System.out.printf("Su edad es: %s años, %s meses y %s días",
	                    periodo.getYears(), periodo.getMonths(), periodo.getDays());
}

}
		
	


