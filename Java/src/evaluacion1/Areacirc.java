package evaluacion1;

import java.util.Scanner;

public class Areacirc {

	public static void main(String[] args) {
		/*
		 *  lee el valor del radio por teclado y muestra el valor del área de un círculo de ese radio 
		 *  por pantalla con dos decimales
		 *
		 */
		// necesidades previas
		double radio;
		double resultado;
		
		
		Scanner teclado; // informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		
		// leer el valor del radio por teclado
		System.out.println("Introduce un valor entero");
		radio = teclado.nextDouble(); //asigno el valor leido por pantalla
		
	  // libero la memoria asignada al objeto llamado teclado
		teclado.close();
		
		// calcula el valor del circulo de ese radio
		resultado = Math.PI * radio * radio;
		
		// muestra el resultado por pantalla
		System.out.println("El valor del circulo es " + resultado);

		
		
		
		
	}

}
