import java.util.Scanner;

public class ejercicio2 {
	
		
		

	public static void main (String[] args) {
			System.out.println("Hola");
			
			String Nombre;
			int Edad;
			
			
			Scanner leer = new Scanner(System.in);
			System.out.println("Ponga su nombre: ");
			Nombre=leer.nextLine();
			
			System.out.println("Encantado de conocerte " + Nombre);
			
			System.out.println("Ponga su edad: ");
			Edad=leer.nextInt();
			int n1=10, r=0;
			r=Edad+n1;
			System.out.println(Edad + "+" + n1 + "=" +r);
				
			
			
			
			}
		}	