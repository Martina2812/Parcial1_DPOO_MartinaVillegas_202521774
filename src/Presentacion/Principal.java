package Presentacion;

import logica.Persona;
import logica.Mujer;
import logica.Hombre;

public class Principal {
	
	public Principal() {
		
		Persona m;
		m = new Mujer(38, 170, 20);
		
		if(m.calcularTMB() != -1.0) {
			System.out.println(m.calcularTMB());
		} else {
			System.out.println("No se pudo calcular correctamente el TMB.");
		}
		
		Persona m2;
		m2 = new Mujer(55, 170, 20);
		
		if(m2.calcularTMB() != -1.0) {
			System.out.println(m2.calcularTMB());
		} else {
			System.out.println("No se pudo calcular correctamente el TMB.");
		}
		
		Persona h;
		h = new Hombre(78, 180, 16);
		
		if(h.calcularTMB() != -1.0) {
			System.out.println(h.calcularTMB());
		} else {
			System.out.println("No se pudo calcular correctamente el TMB.");
		}
		
		Persona h2;
		h2 = new Hombre(80, 200, 20);
		
		if(h2.calcularTMB() != -1.0) {
			System.out.println(h2.calcularTMB());
		} else {
			System.out.println("No se pudo calcular correctamente el TMB.");
		}
	}

	public static void main(String[] args) {
		new Principal();
	}
}
