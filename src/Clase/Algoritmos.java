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
	
	/**
	 * Recibe un número entero y devuelve el factorial de dicho número. 
	 * 
	 * @param num
	 * @return factorial
	 */
	
	public int factorial(int num) {
		if (num < 0)
			throw new IllegalArgumentException();
		else {
			int factorial = 1;
			for (int i = 1; i <= num; i++) {
				factorial *= i;
			}
			return factorial;
		}
	}
	/**
	 *  Recibe un número entero y devuelve true o false en función de si es primo o no.
	 * 
	 * @param num
	 * @return num
	 */
	
	public boolean primo(int num){
	    boolean primo = false;
	    
	    if (num < 2)
	        throw new IllegalArgumentException();
	    else {
	    		if (num % 2 == 0) return false;
	    		for (int i = 3; i * i <= num; i++) {
					if (num % i == 0)
						return false;
				}
	    		return true;
	    }
	}
	
}