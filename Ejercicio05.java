/*
 * 2 - Realizar la carga del lado de un cuadrado, mostrar por pantalla el 
 * perímetro del mismo (El perímetro de un cuadrado se calcula multiplicando 
 * el valor del lado por cuatro) 
 * */
import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in); 
		
		System.out.println("Ingresar lado de cuadrado: ");
		int lado = teclado.nextInt();
		
		float perimetro = lado*4;
		
		System.out.println("El perimetro del cuadrado es: " + perimetro);

	}

}
