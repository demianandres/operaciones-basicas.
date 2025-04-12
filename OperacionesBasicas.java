import java.util.Scanner;
public class OperacionesBasicas {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); 
      System.out.println("introduzca por favor el primer numero"); 
      
      double num1 = scanner.nextDouble();
      
      System.out.println("introduzca por favor el segundo numero");
      
      double num2 = scanner.nextDouble();
      double suma= num1 + num2;
      double resta= num1 - num2;
      double multiplicacion= num1 * num2;
      double division= num1 / num2;
      double modulo= num1 % num2;
      
      
      System.out.println( "la suma es : "+ suma);
      System.out.println(" la resta es : "+ resta);
      System.out.println("la multiplicacionon es:"+ multiplicacion);
      System.out.println("la division es :"+ division);
      System.out.println("el modulo es : "+ modulo);
      
    }
}
