package logica;

public class Hombre extends Persona{
	
	public Hombre(double pesoKg, double alturaCm, int edad) {
		super(pesoKg, alturaCm, edad);
	}
	
	@Override
	public double calcularTMB() {
		double TMB = -1.0;
		
		if((60 <= pesoKg && pesoKg <= 110) && (160 <= alturaCm && alturaCm <= 195) && (edad > 15)) {
			TMB = 447.593 + (9.247 * pesoKg) + (3.098 * alturaCm) - (4.33 * edad);
		}
		
		return TMB;
	}

}
