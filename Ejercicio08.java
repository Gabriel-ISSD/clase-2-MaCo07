/*
 * 5 -Se ingresa por teclado un valor entero, mostrar una
 * leyenda que indique si el número es positivo, nulo o negativo.  
 */
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresar un valor entero: ");
		int numero = teclado.nextInt();
		
		if (numero > 0) {
			System.out.println("Positivo");
		}else {
			if (numero < 0) {
				System.out.println("Negativo");
			}else {
				System.out.println("Nulo");
			}
		}

	}

}
