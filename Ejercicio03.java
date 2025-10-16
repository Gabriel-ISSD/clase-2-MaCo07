/*
 * 3 – Generar 3 valores aleatorios comprendidos entre 0 y 10. 
 * Mostrar el menor de los mismos.
 * */
public class Ejercicio03 {

	public static void main(String[] args) {
		int valor1 = (int)(Math.random()*10);
		int valor2 = (int)(Math.random()*10);
		int valor3 = (int)(Math.random()*10);
		
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);

		
		if (valor1 < valor2 && valor1 < valor3) { //comparamos el valor 1 con los demas dos valores, para descartar el valor 1
			System.out.println("El valor 1 es menor");
		} else {
			if (valor2 < valor3) {
				System.out.println("El valor 2 es menor");
			} else {
				System.out.println("El valor 3 es menor");
			}
		}

		

	}

}
