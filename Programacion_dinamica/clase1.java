
import java.util.Arrays;

public class prueba {
	static  long mem[] = new long[1000];
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++)
			mem[i] = -1;
		int n = 11 ;
		for (int i = 0; i<n ; i++) {
			System.out.print(fib_ar_ab(i)+ " ");
			
		}
		System.out.println();
		System.out.println(Arrays.toString(mem));
	}
	public static long fib_ar_ab(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (mem[n] != -1)
			return mem[n];
		mem[n] = fib_ar_ab(n - 1 ) + fib_ar_ab(n - 2);
		return mem[n];
	}
}
