package evaluacion1;

import java.util.Scanner;

public class CentimosEuro {

	public static void main(String[] args) {
		/*
		 * lee una cantidad en euros por teclado y muestra por separado el número de euros 
		 * y el número de céntimos de euro.
		 */
		
		// necesidades previas
		double cantidad;
		int euros;
		int centimos; 
		
		Scanner teclado; // informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// leer n
		System.out.println("Cantidad: ");
		cantidad = teclado.nextDouble();
		
		teclado.close(); // libero la memoria asignada al objeto llamado teclado
		
		// calculo euros
		euros = (int) cantidad;
		
		// calculo centimos
		centimos = (int) ((cantidad - euros) * 100);
		// lo muestra por pantalla
		System.out.println("Euros: " + euros  +  " Centimos: " + centimos);

		
		
		
	}

}
