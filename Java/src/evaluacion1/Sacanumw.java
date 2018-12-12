package evaluacion1;

import java.util.Scanner;

public class Sacanumw {

	public static void main(String[] args) {
		/*
		 *  lee  un número entero por teclado, y muestra los numeros desde 1 hasta él inclusive
		 *
		 */
		// Necesidad previas
		int numero, posicion;
		
		Scanner teclado; // informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// leer numero
		System.out.println("Numero: ");
		numero = teclado.nextInt(); // asigno el valor leido por teclado a la variable n
		
		// cierro teclado
		teclado.close(); // libero la memoria asignada al objeto llamado teclado
		
		// muestra los numeros desde 1 hasta el inclusive
		// inicializo posicion
		posicion = 1;
		while(posicion <= numero) {
			// escribir posicion
			System.out.println(posicion);
			// actualizo posicion
			posicion = posicion + 1;
			
		}
	}
}	

		
		
		
		

