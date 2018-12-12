package evaluacion1;

import java.util.Scanner;

public class Cubo {

	public static void main(String[] args) {
		/*
		 *  lee un número por teclado y calcula el cubo de ese número. 
		 *
		 */
		double n;
		double resultado;
		
		Scanner teclado; // informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// antes de leer el mensaje muestro un mensaje informativo
		System.out.println("Introduce un valor entero");
		n = teclado.nextInt(); // asigno el valor leido por teclado a la variable n
		
		// calcula su cubo
		resultado = n * n * n;
		
		// lo muestra por pantalla
		System.out.println("El valor de la  variable es " + resultado);

		teclado.close(); // libero la memoria asignada al objeto llamado teclado
		
		
		
	}

}
