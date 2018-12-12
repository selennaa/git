package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumveces {

	public static void main(String[] args) {
		/*
		 * Pide números de 0 a 9 por pantalla y calcula el número de veces que han sido introducidos utilizando un array. 
		 * Finaliza la introducción de datos cuando se introduce un valor negativo o mayor que 9. 
		 * Al finalizar la introducción de datos muestra por pantalla el número de veces que se ha introducido cada número.
		 */ 

		int n, valor;
		
		//creo el arrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		// lo inicializo con 10 elementos
		for(int posicion = 0; posicion < 10; posicion++) {
			arrayList.add(0);	
		}
		
		//Pide numero de 0 a 9 por pantalla
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		//Leer un valor
		System.out.println("Introduce un valor: ");
		n = teclado.nextInt();
		
		//calcula el número de veces que han sido introducidos utilizando un array. 
		//Finaliza la introducción de datos cuando se introduce un valor negativo o mayor que 9. 
		while (n >= 0 && n <= 9) {
			//cojo el valor que hay en esa posicion en arrayList
			valor = arrayList.get(n);
			//le sumo 1
			valor = valor + 1;
			//actualizo el valor que hay en esa posicion en arrayList
			arrayList.set(n, valor);
			
			
			//Leo otro valor
			System.out.println("Introduce un valor: ");
			n = teclado.nextInt();
		}
		
		//Libero la memoria del teclado
		teclado.close();
		
		//Muestro el contenido del diccionario
			for(int posicion = 0; posicion < arrayList.size(); posicion++) {
				valor = arrayList.get(posicion);
				System.out.println(posicion+ ": "+valor+"veces");
		}
	}

}
