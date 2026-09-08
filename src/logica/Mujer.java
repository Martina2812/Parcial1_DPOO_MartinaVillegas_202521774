package logica;

public class Mujer extends Persona{
	public Mujer(double pesoKg, double alturaCm, int edad) {
		super(pesoKg, alturaCm, edad);
	}
	
	@Override
	public double calcularTMB() {
		double TMB = -1.0;
		
		if((40 <= pesoKg && pesoKg <= 80) && (140 <= alturaCm && alturaCm<= 180) && (edad > 15)) {
			TMB = 447.593 + (9.247 * pesoKg) + (3.098 * alturaCm) - (4.33 * edad);
		}
		
		return TMB;
	}

}
