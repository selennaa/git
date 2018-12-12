package evaluacion1;

import java.util.Scanner;

public class EnteroReal {

	public static void main(String[] args) {
		/*
		 * lee un número real por teclado y muestra por separado su parte entera y su parte real
		 *
		 */
		// necesidades previas
		double n;
		int parteentera;
		double partereal; 
		
		Scanner teclado; // informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// leer n
		System.out.println("Cantidad: ");
		n = teclado.nextDouble();
		
		teclado.close(); // libero la memoria asignada al objeto llamado teclado
		
		// calculo parteentera
		parteentera = (int)n;
		
		// calculo partereal
		partereal = n - parteentera;
		
		// lo muestra por pantalla
		System.out.println("Parte entera: " + parteentera  +  "Parte real: " + partereal);

		
		
		
	}

}
