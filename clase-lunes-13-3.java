package holamundo;

public class DigitosNumero {
	public static int algoritmo(int n) {//1
		int suma = 0,copia = n;//1
		int t = 0;
		while(n>0) { // 2 log n
			suma = suma + n%10; // 1 log n
			n = n/10;// 1 log n
			t++;// 1 log n
		}
		System.out.printf("n = %-10d, t = %d \n",copia,t );
		return suma;//1
	}
	public static int busquedabinaria(int a[] , int c,int n) {
		int inf,sup,i;
		inf = 1;
		sup = n;
		int t = 0;
		while(sup>= inf) {
			i = (inf + sup)/2;
			if (a[i] == c)
				return (i);
			else
				if(c< a[i])
					sup = i-1;
				else
					inf = i+1;
			t++;
		}
		System.out.printf("c = %-5d, t = %d \n",c,t);
		return (0);
	}
	// obtenga la complejidad para determinar si un numero es primo
	public static boolean esPrimo(int numero) {//1
			int copia = numero;
			int t = 0;
		  if (numero == 0 || numero == 1 || numero == 4) { //1
		    return false;	//1
		  }
		  
		  for (int x = 2; x < numero / 2; x++) { //n/2 - 1

		    if (numero % x == 0)    // n/2 -2
		      return false;//n/2 -2
		    t++;
		  }
		  System.out.printf("n = %-10d, t = %d \n",copia,t );
		  return true;
		}
	
	
	
	
	public static boolean esPrimoLic (int n) {//1
		int t = 0;
		if (n<2) //1
			return false; //1
		int i = 2;//1
		while(i*i <= n) {//sqrt(n)
			if(n %i == 0)//sqrt(n) -1
				return false;//1
			i++;//sqrt(n) -1
			t++;
			
		}
		System.out.printf("n = %-10d, t = %d \n",n,t );
		return true; //1
		//------------------------------
		// t(n) = 3 sqrt(n) +4
	}
	public static boolean busquedalineal(int v[] , int e) {//	1
		int n = v.length;//										1
		for(int i = 0; i<n;i++) {//								n+1
			if(v[i] == e) {//									n
				return true;//									1
			}
		}
		return false;//											1
		//-----------------------------------------------------------------
		// t(n) = 2n +5 
		// O(n)
	}
	// tarea
	/*
	 * tiene 3 caracteristicas
	 * 	1. 
	 * 	2. 
	 * 	3. 
	 * --------
	 * v = 9,5,30,4,2,1,15,21
	 *  si elem = 9 --> tiempo = 1 (mejor de los casos)				Omega 		Ω(1)
	 *  si elem = 21 --> tiempo = 8 (peor de los casos)				Omicron 	O(n)
	 *  si elem = 50 --> tiempo = 8 (peor de los casos)		
	 *  si elem = 5 --> tiempo = 2 (caso promedio)					Theta 		θ(n)
	 *  si elem = 1 --> tiempo = 6 (caso promedio)					
	 *  
	 * */
	
	public static void main(String args[]){
		/*
		algoritmo(12);
		algoritmo(1232);
		algoritmo(12422);
		algoritmo(1233345);
		algoritmo(1215);*/
		//------------------------------
		/*
		int v[] = {0,10};
		busquedabinaria(v, 10, 1);
		busquedabinaria(v, 5, 1);
		busquedabinaria(v, 15, 1);*/
		
		//--------------------------------
		/*
		for(int i = 1; i<= 20 ;i++) {
			//System.out.println(i+ " es "+ esPrimoLic(i));
			esPrimoLic(i);
		}*/
		
		
		/*
n = 2         , t = 0 
n = 3         , t = 0    sqrt(11) = 3.31
n = 5         , t = 1 	sqrt(17) = 4.37
n = 7         , t = 1 
n = 11        , t = 2 
n = 13        , t = 2 
n = 17        , t = 3 
n = 19        , t = 3 
		 * */
		
		//-------------------
		int v[] = {9,5,30,4,2,1,15,21};
		System.out.println(9 + "  "+busquedalineal(v, 9));
		System.out.println(21 + "  "+busquedalineal(v, 21));
		System.out.println(50 + "  "+busquedalineal(v, 50));

	}
}
