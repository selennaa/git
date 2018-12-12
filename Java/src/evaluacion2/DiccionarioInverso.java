package evaluacion2;

import java.util.Scanner;

public class DiccionarioInverso {

	public static void main(String[] args) {
	/* Recibe palabras por teclado y las almacena en un array de Strings en orden alfabético ascendente 
	 * hasta que llega una cadena vacía que no será tenida en cuenta (isEmpty()) o el array esté lleno. 
	 * Una vez finalizado el proceso muestra el contenido del array por pantalla
	 */ 

		//Necesidades previas
		String cadena;
		int elementos, posicion;
		String diccionario[]= new String[10];
		
		//Creo objeto Scanner teclado
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		//Leo una cadena
		System.out.println("Introduce una cadena: ");
		cadena = teclado.nextLine();
		
		elementos = 0;
		while(!cadena.isEmpty() && elementos < 10) {
			//Añado la cadena la diccionario de manera ordenada
			
			//Buscar la posicion
			posicion = 0;
			while(posicion < elementos) {
				//Compruebo si es la posicion (para el inverso se cambia signo de menor a mayor)
				if(cadena.compareTo(diccionario[posicion]) > 0){
					//si es la posicion
					break;
				}
				//Voy a la siguiente posicion
				posicion = posicion + 1;
			}
			
			//Desplazo los elementos desde la posicion una posicion
			for(int posmov = elementos; posmov > posicion; posmov--){
				diccionario[posmov] = diccionario[posmov-1];
			}
			
			//Inserto la cadena en la posicion
			diccionario[posicion] = cadena;
			
			//Incremento el numero de elementos
			elementos = elementos + 1;
			
			
			//Leo otra cadena
			System.out.println("Introduce una cadena: ");
			cadena = teclado.nextLine();
		}
			
		//Libero la memoria asignada al objeto
		teclado.close();
		
		//Muestro el contenido del diccionario
		for(posicion = 0; posicion < elementos; posicion++) {
			System.out.println(diccionario[posicion]);
		}
	}

}
