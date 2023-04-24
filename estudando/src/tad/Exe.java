package tad;

public class Exe {
	public static void main(String[] args) {
		
		SacolaFloat sacola = new SacolaFloatSequencial();
		Sacola s = new Sacola();
		sacola.insere(1);
		sacola.insere(10);
		sacola.insere(3);
		
		Float max = s.max(sacola);
		
		System.out.println(max);
	}

}
