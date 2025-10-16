/*
 * 1 -  Calcular el sueldo mensual de un operario conociendo 
 * la cantidad de horas trabajadas y el pago por hora.
 * */

public class Ejercicio04 {

	public static void main(String[] args) {
		int PagoHora = 5000;
		int DiasTrabajados = 5;
		int HorasTrabajadas = 12;
		
		int Horas = (HorasTrabajadas * DiasTrabajados) * 4;
		int Sueldo = Horas * PagoHora;
		
		System.out.println("El sueldo del trabajador es de : " + Sueldo);
		
		
		

	}

}
