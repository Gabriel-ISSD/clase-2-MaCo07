/*
 * 3 - Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre 
 * la tabla de multiplicar del mismo (los primeros 12 términos)
Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.
*/
import java.util.Scanner;

public class EjercicioFor03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero = 0;
		
		do {
			System.out.println("Que tabla queres ver? ");
			numero = teclado.nextInt();
			
			if (numero != 0) {
				for (int x = 1; x<=12; x++) {
					System.out.println(numero*x);
				}
				
			}
			

		}while(numero != 0);
		

	}

}
