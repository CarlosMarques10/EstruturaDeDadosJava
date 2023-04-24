package listaEncadeada.inserirInicio;

public class Exe {
	public static void main(String[] args) {
		
		ListaSimples l = new ListaSimples();
		System.out.println(l.toString());
		
		l.inserirInicio("Carlos");
		System.out.println(l);
		
		l.inserirInicio("Artur");
		System.out.println(l.toString());
		
		l.inserirInicio("Couto");
		System.out.println(l);
	}

}
