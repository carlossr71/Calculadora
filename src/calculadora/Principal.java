package calculadora;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Operacion o;
	    double a, b, resultado;
	    int opcion;
	    boolean continuar = true;
	    System.out.println("Introduce el primer número: ");
	    a = sc.nextDouble();
	    System.out.println("Introduce el segundo número: ");
	    b = sc.nextDouble();
	    o = new Operacion(a, b);
	    while (continuar) {
	      System.out.println("Elige la operación a realizar: ");
	      System.out.println("1 Sumar");
	      System.out.println("2 Restar");
	      System.out.println("3 Multiplicar");
	      System.out.println("4 Dividir");
	      System.out.println("5 Salir");
	      opcion = sc.nextInt(); 
	      switch (opcion) {
	        case 1:
	          resultado = o.suma();
	          System.out.println("El resultado de la suma es: " + resultado);
	          break;
	        case 2:
	          resultado = o.resta();
	          System.out.println("El resultado de la resta es: " + resultado);
	          break;
	        case 3:
	          resultado = o.multiplicacion();
	          System.out.println("El resultado de la multiplicación es: " + resultado);
	          break;
	        case 4:
	          resultado = o.division();
	          System.out.println("El resultado de la división es: " + resultado);
	          break;
	        case 5:
	          continuar = false;
	          break;
	        default:
	          System.out.println("Opción inválida");
	          break;
	      }
	    } 
	    sc.close();
	  }}	

