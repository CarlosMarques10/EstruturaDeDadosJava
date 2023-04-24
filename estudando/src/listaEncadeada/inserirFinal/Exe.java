package listaEncadeada.inserirFinal;

public class Exe {
	public static void main(String[] args) {
	
		ListaSimples l = new ListaSimples();
		
		
		l.inserirFim("Aluno1");
		System.out.println(l.toString());
		l.inserirFim("Aluno2");
		System.out.println(l.toString());
		l.inserirFim("Aluno3");
		System.out.println(l.toString());
		
		l.remover(1);
		System.out.println(l);
		
		String buscar = "Aluno3";
		if(l.buscar(buscar)) {
			System.out.println(buscar + " Encontrado");
		}else {
			System.out.println(buscar + " Nao encontrado");
		}
		
	
	}
}
