import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        if (esPrimo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
        scanner.close();
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        // Se optimiza comprobando solo hasta la raíz cuadrada del número [11]
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // Divisor encontrado, no es primo
        }
        return true; // No se encontraron divisores
    }
}