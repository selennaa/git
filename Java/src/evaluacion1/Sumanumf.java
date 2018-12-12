package evaluacion1;

import java.util.Scanner;

public class Sumanumf {

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

		suma = 0;
		
		for(posicion = 1; posicion <= numero; posicion = posicion+1) {
			// calculo suma
			suma = suma + posicion;
			
		}
		// muestra suma
		System.out.println("La suma de los "+numero+" primeros numeros es "+suma);
	}
}	

		
		
		
		

