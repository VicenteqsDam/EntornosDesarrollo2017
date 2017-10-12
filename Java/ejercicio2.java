import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println("Hola!, ¿Como te llamas? ");
		Scanner n = new Scanner(System.in);
		String nombre = n.nextLine();
		System.out.println("Estoy encantado de conocerte " + nombre);
		
		System.out.println("¿Cuantos años tienes? ");
		Scanner e = new Scanner(System.in);
		int edad = e.nextInt();
		System.out.println("Dentro de 10 años tendras " + (edad + 10));
		
		
	}
}