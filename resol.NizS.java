package modelo.resol.NizS;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- TP3 ---");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> Ejercicio1.ejecutar();
                case 2 -> Ejercicio2.ejecutar();
                case 3 -> Ejercicio3.ejecutar();
                case 4 -> Ejercicio4.ejecutar();
                case 5 -> Ejercicio5.ejecutar();
                case 6 -> Ejercicio6.ejecutar();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion no disponible");
            }
        } while (opcion != 0);
    }
}
