package bes.ucsal.questao2;

/* Escreva em Java um metodo recursivo, que receba um numero intero na base decimal
 * e realize a conversao deste numero para a base binario
 */

public class questao2 {
	public static String decimalParaBinario(int numero) {
		if (numero == 0) {
			return "0";
		} else {
			int resto = numero % 2;
			int quociente = numero / 2;
			if (quociente == 0) {
				return Integer.toString(resto);
			} else {
				return decimalParaBinario(quociente) + Integer.toString(resto);
			}
		}
	}

	
	public static void main(String[] args) {
		System.out.println(decimalParaBinario(39));
	}
}
