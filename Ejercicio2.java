import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola, �Como te llamas?");
		Scanner in = new Scanner(System.in);
		String nombre;
		nombre = in.nextLine();
		System.out.println("Encantado de conocerte " + nombre);
		System.out.println("�Cuantos a�os tienes?");
		int numero = in.nextInt();
		System.out.println("En 10 a�os tendr�s " + (numero + 10) + " a�os.");
	}

}
