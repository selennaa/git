package evaluacion1;

import java.util.Scanner;

public class Loncircu {

	public static void main(String[] args) {
		/*
		 *  lee el valor del radio por teclado y muestra el valor de la circunferencia de ese radio por pantalla 
		 *  con dos decimales. Para el cálculo podemos usar la constante Java Math.PI. 
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
		
		// calcula el valor de la circunferencia de ese radio
		resultado = 2 * Math.PI * radio;
		
		// muestra el resultado por pantalla
		System.out.println("El valor de la  circunferencia es " + resultado);

		
		
		
		
	}

}
