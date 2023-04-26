import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ColaPrioridad {
	public static void main(String[] args) {
		PriorityQueue<Integer> cp = new PriorityQueue<Integer>();
		// de mayor a menor == 1 opcion
		// PriorityQueue<Integer> cp = new
		// PriorityQueue<Integer>(Comparator.reverseOrder());
		// de mayor a menor == 2 opcion
		// PriorityQueue<Integer> cp = new
		// PriorityQueue<Integer>(Collections.reverseOrder());
		cp.offer(1);
		cp.offer(20);
		cp.offer(3);
		cp.offer(4);
		// PriorityQueue : ordena los valores en funcion de la prioridad (es de tipo
		// arbol)
		/*
		 * System.out.println(cp); System.out.println(cp.poll());
		 * System.out.println(cp.poll()); System.out.println(cp.poll());
		 * System.out.println(cp.poll()); System.out.println(cp);
		 */

		PriorityQueue<Integer> cp2 = new PriorityQueue<Integer>();
		cp2.offer(1);
		cp2.offer(2);
		cp2.offer(3);
		cp2.offer(5);
		cp2.offer(6);
		cp2.offer(7);

		// interseccion

		PriorityQueue<Integer> interseccion = new PriorityQueue<>();
		for (Integer elemento : cp) {
			if (cp2.contains(elemento)) {
				interseccion.offer(elemento);
			}
		}
		System.out.println("Interseccion: " + interseccion);

		// A U B
		PriorityQueue<Integer> union = new PriorityQueue<>();

		for (Integer elem : cp) {
			if (!union.contains(elem)) {
				union.offer(elem);
			}
		}
		for (Integer elem : cp2) {
			if (!union.contains(elem)) {
				union.offer(elem);
			}
		}
		System.out.println("union: " + union);

	}
}
