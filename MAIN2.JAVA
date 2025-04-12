import java.util.Scanner;
class Main2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
      // Solicitar nombre
      System.out.print("introduzca por favor su nombre:");
      String nombre = scanner.nextLine();
      
      //Solicitar edad 
      System.out.print("introduzca por favor su edad:");
      int edad = scanner.nextInt(); // Limpiar el buffer del Scanner
      
      //Solicitar correo
      System.out.print("introduzca por favor su correo:");
      String correo = scanner.nextLine();
      
      System.out.println("\n---datos ingresados---");
      System.out.println("nombre: " + nombre);
      System.out.println("edad: " + edad);
      System.out.println("correo: " + correo);
      
             scanner.close();
      
     
       }
       }
