package recursividade;

public class Fibonacci {
	public static void main(String[] args) {
		
		Fibonacci fib = new Fibonacci();
		System.out.println(fib.fibonacci(10));
	}

	public int fibonacci(int x) {
		if(x == 0 || x == 1) {
			return x;
		}
		
		return fibonacci(x - 1) + fibonacci(x - 2);
	}
}
