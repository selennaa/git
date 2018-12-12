package evaluacion2;

import java.util.Scanner;

public class Numveces {

	public static void main(String[] args) {
		/*
		 * Pide n�meros de 0 a 9 por pantalla y calcula el n�mero de veces que han sido introducidos utilizando un array. 
		 * Finaliza la introducci�n de datos cuando se introduce un valor negativo o mayor que 9. 
		 * Al finalizar la introducci�n de datos muestra por pantalla el n�mero de veces que se ha introducido cada n�mero.
		 */ 

		int n, posicion;
		int [] arrayenteros = new int[10];
		
		//Pide numero de 0 a 9 por pantalla
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		//Leer un valor
		System.out.println("Introduce un valor: ");
		n = teclado.nextInt();
		
		//calcula el n�mero de veces que han sido introducidos utilizando un array. 
		//Finaliza la introducci�n de datos cuando se introduce un valor negativo o mayor que 9. 
		while (n >= 0 && n <= 9) {
			arrayenteros[n] = arrayenteros [n] + 1 ;		
			//Leo otro valor
			System.out.println("Introduce un valor: ");
			n = teclado.nextInt();
		}
		
		//Libero la memoria del teclado
		teclado.close();
		
		//Al finalizar la introducci�n de datos muestra por pantalla el n�mero de veces que se ha introducido cada n�mero.
		posicion = 0;
		while (posicion < 10) {
			System.out.println(posicion + ":" + arrayenteros[posicion] + "Veces");
			posicion = posicion + 1;
		}
	}

}
