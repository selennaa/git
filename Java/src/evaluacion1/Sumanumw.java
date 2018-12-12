package evaluacion1;

import java.util.Scanner;

public class Sumanumw {

	public static void main(String[] args) {
		/*
		 *  lee   un numero entero por teclado y muestra la suma de todos los números 
		 *  desde 1 hasta él inclusive
		 *
		 */
		// Necesidad previas
		int numero, posicion, suma;
		
		Scanner teclado; // informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// leer numero
		System.out.println("Numero: ");
		numero = teclado.nextInt(); // asigno el valor leido por teclado a la variable n
		
		// cierro teclado
		teclado.close(); // libero la memoria asignada al objeto llamado teclado
		
		// muestra los numeros desde 1 hasta el inclusive
		// inicializo posicion
		suma = 0;
		posicion = 1;
		while(posicion <= numero) {
			// calculo suma
			suma = suma + posicion;
			// actualiazo posicion
			posicion = posicion + 1;
			
		}
		// muestra el resultado por pantalla
		System.out.println("La suma de los "+numero+" primeros numeros es "+suma);
	}
}	

		
		
		
		

