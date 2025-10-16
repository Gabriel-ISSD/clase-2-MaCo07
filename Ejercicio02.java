/*2 – Generar 3 valores aleatorios por teclado, calcular su promedio. 
Mostrar un mensaje si dicho promedio es mayor o igual a 5 o menor.*/

import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa valor 1: ");
		int valor1 = teclado.nextInt();
		System.out.println("Ingresa valor 2: ");
		int valor2 = teclado.nextInt();
		System.out.println("Ingresa valor 3: ");
		int valor3 = teclado.nextInt();
		
		int suma = valor1 + valor2 + valor3;
		
		int promedio = suma / 3;
		
		System.out.println("El promedio es de " + promedio);
		
		if (promedio >= 5) {
			System.out.println("El promedio es mayor que 5");
		}else {
			System.out.println("El promedio es menor que 5");
		}
		
		

	}

}
