package holamundo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class tarea {
	public static void main(String[] args) throws FileNotFoundException{
		File f= new File("holamundo.java");
		Scanner leer;
		Set <String> s = new HashSet<String>();
		s.add("if");
		s.add("else");
		s.add("for");
		s.add("new");
		s.add("while");
		s.add("public");
		s.add("void");
		Set <String> aux = new HashSet<String>();

		leer = new Scanner(f);
		int c_if = 0;
		while(leer.hasNext()) {
			String x = leer.nextLine();

			for (String data : s) {
				if(data.contains(x)) {
					aux.add(data);
				}
			}
		}
		
		System.out.println("esta: "+aux);
		
	}
}
