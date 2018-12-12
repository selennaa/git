package evaluacion1;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		/*
		 *  lee un número por teclado y calcula el cubo de ese número.
		 *  pide una cantidad en euros, un tipo de interés (ej: 5,5%), 
		 *  y un período de tiempo expresado en días por pantalla y 
		 *  calcula el interés producido en ese tiempo en base a la fórmula
		 *   Interes=(Cantidad*TipoInteres*Tiempo)/(360*100) 
		 *
		 */
		double cantidad;
		double tipointeres;
		int tiempo;
		double interes; 
		
		Scanner teclado; // informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// leer cantidad
		System.out.println("Cantidad: ");
		cantidad = teclado.nextDouble();
		
		// leer interes
		System.out.println("Tipo de Interes (3,5%): ");
		tipointeres = teclado.nextDouble();
		
		// leer tiempo
		System.out.println("Tiempo en dias: ");
		tiempo = teclado.nextInt();
		
		teclado.close(); // libero la memoria asignada al objeto llamado teclado
		
		// calculo
		interes = (cantidad * tipointeres * tiempo)/(360*100);
		
		// lo muestra por pantalla
		System.out.println("El Interes es " + interes);

		
		
		
	}

}
