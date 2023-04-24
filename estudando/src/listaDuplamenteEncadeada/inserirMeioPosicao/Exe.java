package listaDuplamenteEncadeada.inserirMeioPosicao;

public class Exe {
	public static void main(String[] args) {
		
		ListaDupla ld = new ListaDupla();
		
		ld.inserirMeio(1, "Carlos");
		ld.inserirMeio(2, "Artur");
		ld.inserirMeio(3, "Couto");
		ld.inserirMeio(4, "Marques");
		
		System.out.println(ld.toString());
		
		ld.inserirMeio(1, "ninguem");
		System.out.println(ld.toString());
		
		ld.retirarMeio(0);
		System.out.println(ld.toString() );
		
		
	}
}
