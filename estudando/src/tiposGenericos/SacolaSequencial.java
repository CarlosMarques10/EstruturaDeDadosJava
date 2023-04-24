package tiposGenericos;

public class SacolaSequencial<T> implements Sacola<T>{

	private T[] vetor;
	private int n;
	
	public SacolaSequencial() {
		vetor = (T[]) new Object[10];
		n=0;
	}
	@Override
	public void insere(T item) {
		vetor[n++] = item;
	}

	@Override
	public T get(int i) {
		return vetor[i];
	}

	@Override
	public int tamanho() {
		return n;
	} 

}
