import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		String nombre;
		int edad;
		
		System.out.println("Hola. Me dices tu nombre? ");
		Scanner in = new Scanner(System.in); 
		nombre = in.nextLine();
		System.out.println("Hola " + nombre + ", encantado de conocerte. Me dices tu edad?");
		edad = in.nextInt();
		edad = edad + 10;
		System.out.println(nombre + ", dentro de 10 anyos tendras " + edad);
	}
}