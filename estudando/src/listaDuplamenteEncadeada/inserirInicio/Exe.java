package listaDuplamenteEncadeada.inserirInicio;

public class Exe {
	public static void main(String[] args) {
		
		ListaDupla ld = new ListaDupla();
		
		ld.inserirInicio("Carlos");
		System.out.println(ld.toString());
		ld.inserirInicio("Artur");
		System.out.println(ld.toString());
		ld.inserirInicio("Marques");
		System.out.println(ld.toString());
		
		ld.retirarInicio();
		System.out.println(ld.toString());
	}
}
