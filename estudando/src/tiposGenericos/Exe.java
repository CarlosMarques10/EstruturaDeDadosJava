package tiposGenericos;

import java.util.Random;

public class Exe {
	public static void main(String[] args) {
		
		Sacola<Integer> sacola = new SacolaSequencial<Integer>();
		
		Random rand = new Random();
		sacola.insere(10);
		sacola.insere(30);
		sacola.insere(3);
		
		
		System.out.println();
		System.out.println("Itens:");
		for(int i=0;i<sacola.tamanho();i++) {
			int item = sacola.get(i);
			System.out.printf("\n%d", item);
		}
		System.out.println();
		
		
	}

}
