import java.util.Scanner;

public class AgeValidation {
    // Defino una constante para el límite de edad
    private static final int AGE_LIMIT = 18;

    public static void main(String[] args) {
        // Creo un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca su edad
        System.out.print("Please enter your age: ");
        
        // Leo la edad del usuario
        int age = scanner.nextInt();

        // Estructura if-else para validar la edad
        if (age >= AGE_LIMIT) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        scanner.close();
    }
}