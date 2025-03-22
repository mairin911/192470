import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresar primera nota:");
        double primeraNota = input.nextDouble();
        System.out.println("ingresar segunda nota:");
        double segundaNota = input.nextDouble();
        System.out.println("ingresar tercera nota:");
        double terceraNota = input.nextDouble();
        input.close();

        double promedioEstudiante = (primeraNota + segundaNota + terceraNota) / 3;

            if (promedioEstudiante >= 3.0) {
                System.out.println("estudiate aprobado");
            } else {
                System.out.println("estudiate reprobado");
            }
        }

    }
