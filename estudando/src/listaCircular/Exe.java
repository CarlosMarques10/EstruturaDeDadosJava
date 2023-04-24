package listaCircular;

public class Exe {
	public static void main(String[] args) {
		
		ListaCircular lc = new ListaCircular();
		
		lc.adicionarFila(10);
		lc.adicionarFila(90);
		lc.adicionarFila(50);
		lc.adicionarFila(40);
		lc.removerFila();
		System.out.println(lc.toString());
		
		lc.removerFila();
		System.out.println(lc.toString());
		
		
	}

}
