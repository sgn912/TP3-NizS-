package modelo.resol.NisS;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ejercicio4 {

    public static void ejecutar() {
        LocalDate f1 = LocalDate.of(2023, 1, 1);
        LocalDate f2 = LocalDate.of(2024, 1, 1);

        if (f1.isBefore(f2)) {
            long dias = ChronoUnit.DAYS.between(f1, f2);
            System.out.println("Dias entre fechas: " + dias);
        } else {
            System.out.println("La primera fecha debe ser la anterior");
        }
    }
}
