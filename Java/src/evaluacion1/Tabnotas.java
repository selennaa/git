package evaluacion1;

import java.util.Scanner;

public class Tabnotas {

	public static void main(String[] args) {
		/*
		 *  lee la nota de un alumno por teclado y muestra por pantalla la calificacion que le corresponde
		 */
		
		// necesidades previas
		int nota;
		
		
		Scanner teclado; // informo que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado
		
		// leer nota
		System.out.println("Cantidad: ");
		nota = teclado.nextInt();
		
		// libero la memoria asignada al objeto llamado teclado
		teclado.close();
		
		if(nota >= 0) {
			if (nota < 3) {
				System.out.println("MD");
			}
			else if(nota < 5) {
				System.out.println("INS");
			}
			else if(nota < 6) {
				System.out.println("SUF");
			}
			else if(nota < 7) {
				System.out.println("BIEN");
			}
			else if(nota < 9) {
				System.out.println("NOT");
			}
			else if(nota < 10) {
				System.out.println("SOBRE");
			}
		}
	}	
		
}		
		
		
		
		




