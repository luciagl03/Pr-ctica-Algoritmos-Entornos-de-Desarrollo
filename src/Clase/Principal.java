package Clase;

public class Principal {
	public static void main(String[] args) {
		int lista[] = new int[3];
		boolean repetido = false;
		int random = 0;
		
		//A
		while (!repetido) {
			for (int i = 0; i < lista.length; i++) {
				random = (int)(Math.random() * 9)+2;
				lista[i] = random;
			}
			for (int i = 0; i < lista.length; i++) {
				if (lista[i] == lista[i+1]) {
					repetido = true;
				}
			}
		}
		
		//B
		Algoritmos f = new Algoritmos() {};
		int resultadoFibonacci[] = new int[lista.length];
		for (int i = 0; i < lista.length; i++) {
			resultadoFibonacci[i] = f.fibonacci(lista[i]);
		}
		
		//C
		int resultadoFactorial[] = new int[lista.length];
		for (int i = 0; i < lista.length; i++) {
			resultadoFactorial[i] = f.factorial(lista[i]);
		}
		
		//D
		boolean resultadoPrimos[] = new boolean[lista.length];
		for (int i = 0; i < lista.length; i++) {
			resultadoPrimos[i] = f.primo(lista[i]);
		}
		
	}
	
	
}