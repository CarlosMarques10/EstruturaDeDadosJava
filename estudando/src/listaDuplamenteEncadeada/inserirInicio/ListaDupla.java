package listaDuplamenteEncadeada.inserirInicio;

public class ListaDupla {
	
	No inicio;
	No fim;
	int tamanho;
	
	public void inserirInicio(String info) {
		No no = new No();
		no.info = info;
		no.anterior = null;
		no.proximo = inicio;
		if(inicio!=null) {
			inicio.anterior = no;
		}
		inicio = no;
		if(tamanho == 0) {
			fim = inicio;
		}
		tamanho++;
	}
	
	public String retirarInicio() {
		if(inicio == null) {
			return null;
		}
		String out = inicio.info;
		inicio = inicio.proximo;
		if(inicio!=null) {
			inicio.anterior = null;
		}else {
			fim = null;
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
