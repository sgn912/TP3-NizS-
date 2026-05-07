package modelo.resol.NizS;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Ingrese N: ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = r.nextInt(100) + 1;

        int d1 = diagonalPrincipal(m);
        int d2 = diagonalSecundaria(m);

        System.out.println("Diagonal principal: " + d1);
        System.out.println("Diagonal secundaria: " + d2);
        System.out.println("Mayor suma: " + Math.max(d1, d2));
    }

    public static int diagonalPrincipal(int[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++)
            suma += m[i][i];
        return suma;
    }

    public static int diagonalSecundaria(int[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++)
            suma += m[i][m.length - 1 - i];
        return suma;
    }
}
