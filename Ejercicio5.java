package modelo.resol.NizS;
import java.util.Scanner;

public class Ejercicio5 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero positivo: ");
        int n = sc.nextInt();
        System.out.println("Binario: " + convertirABinario(n));
    }

    public static String convertirABinario(int n) {
        String bin = "";
        while (n > 0) {
            bin = (n % 2) + bin;
            n /= 2;
        }
        return bin;
    }
}
