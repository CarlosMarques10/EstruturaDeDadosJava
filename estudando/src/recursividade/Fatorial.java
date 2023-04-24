package recursividade;

public class Fatorial {
	public static void main(String[] args) {
		
		Fatorial r = new Fatorial();
		int resp = r.fatorial(8);
		System.out.println(resp);
		
	}
	
	public int fatorial(int x) {
		if(x == 0) {
			return 1;
		}
		
		return x * fatorial(x - 1);
	}

}
