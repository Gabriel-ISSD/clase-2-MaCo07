/*
 * 3 - Se debe desarrollar un programa que pida el ingreso del precio de un 
 * artículo y la cantidad que lleva el cliente. Mostrar lo que debe abonar el 
 * comprador.
 * */
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("ingresar precio de producto: ");
		float precio = teclado.nextFloat();
		
		System.out.println("Cantidad que lleva el cliente: ");
		int cantidad = teclado.nextInt();
		
		float TotalCompra = precio*cantidad;
		
		System.out.println("Total a pagar : " + TotalCompra);

	}

}
