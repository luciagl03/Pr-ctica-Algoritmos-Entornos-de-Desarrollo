package Clase;

/**
 * Clase con métodos para realizar cálculos algorítmicos
 * 
 * @author Lucía Gallar Lorenzo
 */

public abstract class Algoritmos {
	
	/**
	 * Recibe un número entero y devuelve el número de fibonacci de dicho número
	 * 
	 * @param num
	 * @return num2
	 */
	
	public int fibonacci(int num) {
		if (num < 0)
			throw new IllegalArgumentException();
		else {
			int num1 = 0;
			int num2 = 1;
			for (int i = 2; i <= num; i++) {
				int nuevo;
				nuevo = num1 + num2;
				num1 = num2;
				num2 = nuevo;
			}
			return num2;
		}

	}
	
	
}