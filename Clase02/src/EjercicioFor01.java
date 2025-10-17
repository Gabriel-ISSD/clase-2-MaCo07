/*
 * 1 - Desarrollar un programa que solicite la carga de 10 números e imprima la 
 * suma de los últimos 5 valores ingresados. 
 * */

import java.util.Scanner;

public class EjercicioFor01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int suma = 0;
		
		for (int j=1; j<=10; j++) {
			System.out.println("Ingresar valor: ");
			int valor = teclado.nextInt();
			
			if (j > 5) {
				suma = suma + valor;
			}
			
		}
		
		System.out.println("Suma de valores : " + suma);

	}

}
