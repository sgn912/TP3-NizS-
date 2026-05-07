package modelo.resol.NizS;
import java.util.Scanner;

public class Ejercicio1 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0, contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (esPrimo(numeros[i])) {
                suma += numeros[i];
                contador++;
            }
        }

        if (contador > 0)
            System.out.println("Promedio de primos: " + (double) suma / contador);
        else
            System.out.println("No se ingresaron numeros primos");
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}
