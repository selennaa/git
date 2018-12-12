package evaluacion1;

import java.util.Scanner;

public class Signonum {

	public static void main(String[] args) {
		/*
		 *  lee  un número entero por teclado, cambia de signo y lo muestra por pantalla
		 *
		 */
		int n;
		Scanner teclado; // informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// antes de leer el mensaje muestro un mensaje informativo
		System.out.println("Introduce un valor entero");
		n = teclado.nextInt(); // asigno el valor leido por teclado a la variable n
		
		// cambio de signo
		n = -n;
		
		// lo muestra por pantalla
		System.out.println("El valor de la  variable es " + n);

		teclado.close(); // libero la memoria asignada al objeto llamado teclado
		
		
		
	}

}
