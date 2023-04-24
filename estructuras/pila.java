package holamundo;
import java.util.Scanner;
import java.util.Stack;

public class EvalPost {
  public static void main(String[] args) {  
    Scanner sc=new Scanner(System.in);
    String op=sc.next();
    String expr = InordenAPostorden(op);; 
    String[] post = expr.split("");   
   
    
    Stack < String > E = new Stack < String > (); 
    Stack < String > P = new Stack < String > (); 

    for (int i = post.length - 1; i >= 0; i--) {
      E.push(post[i]);

    }

    String operadores = "+-*/%";
    while (!E.isEmpty()) {
      if (operadores.contains("" + E.peek())) {
        P.push(evaluar(E.pop(), P.pop(), P.pop()) + "");
      }else {
        P.push(E.pop());
      }
    }

    System.out.println("postorden: " + expr);
    System.out.println("Resultado: " + P.peek());

  }

  private static int evaluar(String op, String n2, String n1) {
    int num1 = Integer.parseInt(n1);
    int num2 = Integer.parseInt(n2);
    if (op.equals("+")) return (num1 + num2);
    if (op.equals("-")) return (num1 - num2);
    if (op.equals("*")) return (num1 * num2);
    if (op.equals("/")) return (num1 / num2);
    if (op.equals("%")) return (num1 % num2);
    return 0;
  }
  
	   public static boolean esOperador(char c) {
	        return c == '+' || c == '-' || c == '*' || c == '/';
	    }

	    public static int obtenerPrecedencia(char operador) {
	        switch (operador) {
	            case '+':
	            case '-':
	                return 1;
	            case '*':
	            case '/':
	                return 2;
	            default:
	                return -1;
	        }
	    }

	    public static String InordenAPostorden(String expresion) {
	        Stack<Character> pila = new Stack<>();
	        StringBuilder resultado = new StringBuilder();

	        for (int i = 0; i < expresion.length(); i++) {
	            char c = expresion.charAt(i);
	            if (Character.isLetterOrDigit(c)) {
	                resultado.append(c);
	            } else if (c == '(') {
	                pila.push(c);
	            } else if (c == ')') {
	                while (!pila.isEmpty() && pila.peek() != '(') {
	                    resultado.append(pila.pop());
	                }
	                if (!pila.isEmpty() && pila.peek() == '(') {
	                    pila.pop(); 
	                }
	            } else if (esOperador(c)) {
	                
	                while (!pila.isEmpty() && obtenerPrecedencia(c) <= obtenerPrecedencia(pila.peek())) {
	                    resultado.append(pila.pop());
	                }
	                pila.push(c);
	            }
	        }
	        while (!pila.isEmpty()) {
	            resultado.append(pila.pop());
	        }

	        return resultado.toString();
	    }

	    }
