package tad;

public class Sacola {

	public float max(SacolaFloat s) {
		// acha o maior elemento da sacola

		float max = Float.NEGATIVE_INFINITY;
		int n = s.tamanho();
		for (int i = 0; i < n; i++) {
			float item = s.get(i);
			if (item > max) {
				max = item;
			}

		}
		return max;
	}

}
