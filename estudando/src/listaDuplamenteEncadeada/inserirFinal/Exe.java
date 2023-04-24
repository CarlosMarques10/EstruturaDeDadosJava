package listaDuplamenteEncadeada.inserirFinal;

public class Exe {
	public static void main(String[] args) {
		
		ListaDupla ld = new ListaDupla();
		
		ld.inserirFim("Carlos");
		System.out.println(ld.toString());
		
		ld.inserirFim("Artur");
		System.out.println(ld.toString());
		
		ld.inserirFim("Marques");
		System.out.println(ld.toString());
		
		ld.retirFim();
		System.out.println(ld.toString());
		
	}

}
