
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
	
	System.out.println("Que pasa tu, como te llamas?");
	
	Scanner teclado = new Scanner(System.in);
	String nombre;
	nombre = teclado.nextLine();
	System.out.println("\nEncantado de conocerte, que tal " +nombre+"\n");
	
	
	Scanner teclado2 = new Scanner(System.in);
	int edad;
	System.out.println("Cuantos anyos tienes "+nombre+"?");
	edad = teclado2.nextInt();
	
	int suma;
	suma=(edad+10);
	System.out.println("\n"+"Dentro de 10 anyos tendras "+(edad+10)+" anyos, don "+nombre);
	

	}
}