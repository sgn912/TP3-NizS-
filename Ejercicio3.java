package modelo.resol.NizS;
import java.util.Scanner;

public class Ejercicio3 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Texto: ");
        String texto = sc.nextLine();

        System.out.print("Carácter: ");
        char c = sc.next().charAt(0);

        buscar(texto, c);
    }

    public static void buscar(String texto, char c) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (Character.toLowerCase(texto.charAt(i)) == Character.toLowerCase(c)) {
                System.out.println("Encontrado en indice: " + i);
                contador++;
            }
        }

        double porcentaje = (double) contador / texto.length() * 100;
        System.out.printf("Porcentaje: %.2f%%\n", porcentaje);
    }
}
