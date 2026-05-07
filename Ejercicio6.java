package modelo.resol.ApellidoN;
import java.util.Scanner;

public class Ejercicio6 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mensaje: ");
        String msg = sc.nextLine();

        System.out.print("Desplazamiento: ");
        int d = sc.nextInt();

        System.out.println("Cifrado: " + cifrar(msg, d));
    }

    public static String cifrar(String texto, int d) {
        StringBuilder res = new StringBuilder();

        for (char c : texto.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                res.append((char) ('a' + (c - 'a' + d) % 26));
            else
                res.append(c);
        }
        return res.toString();
    }
}
