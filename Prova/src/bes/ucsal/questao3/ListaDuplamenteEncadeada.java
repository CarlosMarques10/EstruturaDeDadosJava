package bes.ucsal.questao3;

/*Escreva um programa em java que permite a inclusao de um numero inteiro no inicio de uma lista
 *duplamente encadeada
 * */

public class ListaDuplamenteEncadeada {

	No inicio;
	No fim;
	int tamanho;

	public void inserirInicio(int valor) {
		No no = new No();
		no.valor = valor;
		no.anterior = null;
		no.proximo = inicio;
		if (inicio != null) {
			inicio.anterior = no;
		}
		inicio = no;
		if (tamanho == 0) {
			fim = inicio;
		}
		tamanho++;
	}

	public String toString() {
		String str = "(" + tamanho + ")";
		No local = inicio;
		while (local != null) {
			str += local.valor + " ";
			local = local.proximo;
		}
		return str;
	}

	public static void main(String[] args) {

		ListaDuplamenteEncadeada ld = new ListaDuplamenteEncadeada();
		ld.inserirInicio(19);
		ld.inserirInicio(20);
		ld.inserirInicio(49);
		ld.inserirInicio(76);
		System.out.println(ld.toString());		
		ld.inserirInicio(2);
		System.out.println(ld.toString());

	}
}
