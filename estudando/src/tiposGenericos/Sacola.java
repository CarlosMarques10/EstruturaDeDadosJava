package tiposGenericos;

public interface Sacola<T> {

	void insere (T item);
	T get(int i);
	int tamanho();
	
}
