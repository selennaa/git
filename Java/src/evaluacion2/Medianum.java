package evaluacion2;

import java.util.Scanner;

public class Medianum {

	public static void main(String[] args) {
		/*
		 * pide n�meros por pantalla y los almacena en un array hasta que se introduzca un n�mero negativo
		 * que no ser� tenido en cuenta o hasta que est� lleno el array. 
		 * Despu�s calcula la Media y la muestra 
		 */ 

		int n, posicion, elementos;
		int [] arrayenteros = new int[5];
		double media;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		//Leer un valor
		System.out.println("Introduce un valor:");
		n = teclado.nextInt();
		
		elementos = 0;
		
		while (elementos < 5 && n >=0) {
			arrayenteros[elementos] = n;
			elementos = elementos + 1;
			
			if(elementos < 5) {
			//Leo otro valor
			System.out.println();
			n = teclado.nextInt();
		}
		}
		
		// libero la memoria asignada (al teclado)
		teclado.close();
		
		posicion = 0;
		media = 0.0;
		
		while (posicion < elementos) {
			media = media + arrayenteros[posicion];
			posicion = posicion + 1;
		}
		
		media = media / elementos;
		System.out.println("La media es " + media);
	}

}
