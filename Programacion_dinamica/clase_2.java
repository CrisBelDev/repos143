public class de_abajo_hacia_arriba {
	static int tam = 20;
	static long tabla[] = new long[tam + 1];

	public static long fib_ab_ar(int n) {
		tabla[0] = 0;
		tabla[1] = 1;
		for (int i = 2; i <= n; i++)
			tabla[i] = tabla[i - 1] + tabla[i - 2];
		return tabla[n];
	}
	public static void main(String[] args) {
		int n = 10;
		for (int i = 0;i <n ; i++) {
			System.out.print(fib_ab_ar(i) + " ");
		}
	}
}
