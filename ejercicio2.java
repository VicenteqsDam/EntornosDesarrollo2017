import java.util.Scanner;
 
public class ejercicio2 {
 
  public static void main(String[] args) {
 
      int num = 10;
 
      Scanner in= new Scanner(System.in);
 
      System.out.println("Hola");
 
      System.out.println("Quien eres?"
      String s=in.nextLine();
 
      System.out.println("Encantado de conocerte " + s);
 
      System.out.println("Cuantos años tienes?")
      Scanner teclado = new Scanner(System.in);
 
      int edad = teclado.nextInt();
 
      System.out.println(" Dentro de 10 aos tendras: "
      System.out.println( edad+num );
 
      System.exit( 0 );  
 
  }
 
}