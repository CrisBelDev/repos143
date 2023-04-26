import java.util.Deque;
import java.util.LinkedList;

public class ejemploDeque {
	public static void main(String[] args) {
		Deque<Integer> bicola = new LinkedList<Integer>(); 
		bicola.addLast(50);
		bicola.addFirst(100);
		System.out.println(bicola);
		System.out.println(bicola.pollLast());
		System.out.println(bicola);
		System.out.println(bicola.pollFirst());
		System.out.println(bicola);
	}
}
