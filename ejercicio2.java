import java.util.Scanner;


public class ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido usuario, cual es vuestro nombre?");
		Scanner sc= new Scanner(System.in);
		String nombre=sc.nextLine();
		System.out.println("Encantado de conocerte "+ nombre+" cual es tu edad?");
		int edad= sc.nextInt();
		System.out.println("Entonces tendras "+(edad+10)+" dentro de diez años");

	}

}
