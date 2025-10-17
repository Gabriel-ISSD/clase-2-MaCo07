/*
 * 4 - Se ingresan tres notas de un alumno, si el promedio es 
 * mayor o igual a siete mostrar un mensaje "Promocionado". 
 * */

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresar nota de alumno: ");
		int nota1 = teclado.nextInt();
		System.out.println("Ingresar nota de alumno: ");
		int nota2 = teclado.nextInt();
		System.out.println("Ingresar nota de alumno: ");
		int nota3 = teclado.nextInt();
		
		int suma = nota1 + nota2 + nota3;
		int promedio = suma / 3;
		
		if (promedio >= 7) {
			System.out.println("Promocionado");
		}else {
			System.out.println("No promocionado");
		}
		

	}

}
