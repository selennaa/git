package evaluacion1;

import java.util.Scanner;

public class Valorabs {

	public static void main(String[] args) {
		/*
		 *  lee el valor de un número entero por teclado 
		 *  y muestra su valor absoluto por pantalla
		 */
		
		// necesidades previas
		int n;
		int resultado;
		
		Scanner teclado; // informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// leer n
		System.out.println("Cantidad: ");
		n = teclado.nextInt();
		
		teclado.close(); // libero la memoria asignada al objeto llamado teclado
		
		if(n>0) {
		// si n es positivo
			resultado = n;
		}
		else {
		// si n es negativo
			resultado = -n;
		}
		
		// muestra el resultado por pantalla
		System.out.println("El valor absoluto de " + n +  " es " +  resultado);

	}

}
