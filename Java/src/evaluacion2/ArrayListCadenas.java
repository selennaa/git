package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenas {

	public static void main(String[] args) {
	/*  Recibe Strings por teclado hasta que se introduce un String en blanco
	 *  y los va almacenando en un ArrayList. 
	 *  Cuando finaliza la introducción muestra el contenido del array por pantalla
	 */ 

		//Necesidades previas
		String cadena;
		ArrayList <String> arrayListString = new ArrayList<String>();
		
		//Creo objeto Scanner teclado
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		//Leo una cadena
		System.out.println("Introduce una cadena: ");
		cadena = teclado.nextLine();
		
		
		while(!cadena.isEmpty()) {
			//Añado la cadena al arrayList
			arrayListString.add(cadena);
			
			
			//Leo otra cadena
			System.out.println("Introduce una cadena: ");
			cadena = teclado.nextLine();
		}
			
		//Libero la memoria asignada al objeto
		teclado.close();
		
		//Muestro el contenido del diccionario
		for(int posicion = 0; posicion < arrayListString.size(); posicion++) {
			System.out.println(arrayListString.get(posicion));
		}
	}

}
