package examen;
/**
 * 
 * @author EymanPashaliev
 * @version 1.1
 * 
 * @see Fecha que contiene un método que valida fechas
 */
public class Fecha {
	static boolean fechaValida;
	/**
	 * @see validarFecha valida los 3 valores: anio, mes y dia; lo que hace es según el mes qeu se haya introducido y el día determina si la fecha introducida es una fecha existente y valida
	 * @param anio es la variable para el año introducido en la fecha
	 * @param mes es la variable del mes que validará de la fecha
	 * @param dia es el día que utilizará para determinar si la fecha es valida después del mes
	 * @return true o false dependiendo del mes y día que se hayan introducido, estos 3 valores tienen que ser validos
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		 fechaValida = false;
		 /**
		  * Aquí es donde se inicia la validación comprobando primero si los valores no son 0 o menos que 0
		  */
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			/**
			 * Ahora según el mes y el día comprueba si son válidos según el mes
			 */
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}