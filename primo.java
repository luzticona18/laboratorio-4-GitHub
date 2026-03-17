import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("El número NO es primo");
        } else {
            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println("El número ES primo");
            } else {
                System.out.println("El número NO es primo");
            }
        }

        sc.close();
    }
}