import java.util.LinkedList;
import java.util.Queue;


public class Cola {

	public static void main(String[] args) {
		Queue<Integer> colaA = new LinkedList<Integer>();
		colaA.offer(1);
		colaA.offer(2);
		colaA.offer(3);

		Queue<Integer> colaB = new LinkedList<Integer>();
		colaB.offer(1);
		colaB.offer(2);
		colaB.offer(4);
		colaB.offer(5);

		// interseccion

		Queue<Integer> interseccion = new LinkedList<>();
		for (Integer elemento : colaB) {
			if (colaA.contains(elemento)) {
				interseccion.offer(elemento);
			}
		}

		System.out.println("Interseccion: " + interseccion);

		// A U B
		Queue<Integer> union = new LinkedList<>();

		for (Integer elem : colaA) {
		    if (!union.contains(elem)) {
		        union.offer(elem);
		    }
		}
		for (Integer elem : colaB) {
		    if (!union.contains(elem)) {
		        union.offer(elem);
		    }
		}
		System.out.println("union: " + union);

	}

}
