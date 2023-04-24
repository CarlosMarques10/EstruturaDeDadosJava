package listaDuplamenteEncadeada.inserirFinal;

public class ListaDupla {

	No inicio;
	No fim;
	int tamanho;

	public void inserirFim(String info) {
		No no = new No();
		no.info = info;
		no.proximo = null;
		no.anterior = fim;
		if (fim != null) {
			fim.proximo = no;
		}
		fim = no;
		if (tamanho == 0) {
			inicio = fim;
		}
		tamanho++;
	}

	public String retirFim() {
		if (fim == null) {
			return null;
		}
		String out = fim.info;
		fim = fim.anterior;
		if(fim!=null) {
			fim.proximo = null;
		}else {
			inicio = null;
		}
		tamanho--;
		return out;
	}

	public String toString() {
		String str = "(" + tamanho + ")";
		No local = inicio;
		while (local != null) {
			str += local.info + " ";
			local = local.proximo;
		}
		return str;
	}

}
