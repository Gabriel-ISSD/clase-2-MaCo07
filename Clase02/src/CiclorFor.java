//Contar del 1 al 10

//Desarrollar un programa que permita la carga de 10 valores por teclado y 
//nos muestre posteriormente la suma de los valores ingresados y su promedio.

import java.util.Scanner;

public class CiclorFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int suma = 0;
		
		for (int x=1; x <=10 ;x++) {
			System.out.println("Ingresar valor: ");
			int valor = teclado.nextInt();
			
			suma = suma + valor;
		}
		
		float promedio = (float) suma / 10;
		
		System.out.println("La suma total es: " + suma);
		System.out.println("El promedio es: " + promedio);
		
		
		/*
		for (int i=1; i <=10 ; i++) {
			System.out.println("Numero: " + i);
		}
		*/
		
	}

}
