package logica;

public abstract class Persona {
	protected double pesoKg;
	protected double alturaCm;
	protected int edad;
	
	public Persona(double pesoKg, double alturaCm, int edad) {
		this.pesoKg = pesoKg;
		this.alturaCm = alturaCm;
		this.edad = edad;
	}
	
	public abstract double calcularTMB();

}
