/*
 * 1 -  Generar un valor aleatorio entre 0 y 1000. 
 * Mostrar la cantidad de dígitos que tiene dicho número.*/


public class Ejercicio01 {

	public static void main(String[] args) {
		int aleatorio = (int)(Math.random()*1000); //generamos numeros aleatorios de 0 a 1000
		System.out.println("El numero generado es: " + aleatorio);
		
		String convertidoTexto = String.valueOf(aleatorio); //convertimos el numero a String
		
		int numeroConvertido = convertidoTexto.length();//Obtenemos la longitud del numero
		
		System.out.println("El numero tiene de digitos : " + numeroConvertido);

	}

}
