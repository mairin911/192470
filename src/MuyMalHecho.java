import java.util.Scanner;

public class MuyMalHecho {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int C = 0;

        System.out.println("Número de usuarios a ingresar:");
        byte numeroUsuario = input.nextByte();
        input.nextLine();

        int edadUno = 0, edadDos = 0, edadtres = 0;
        String usuarioUno = "", usuarioDos = "", usuarioTres = "";

        while (C < numeroUsuario) {
            System.out.println("Nombre del usuario:");
            String nombreUsuario = input.nextLine();

            System.out.println("Edad del usuario:");
            Byte edadUsuario = input.nextByte();
            input.nextLine();
            input.close();

            if (C == 0) {
                usuarioUno = nombreUsuario;
                edadUno = edadUsuario;
            } else if (C == 1) {
                usuarioDos = nombreUsuario;
                edadDos = edadUsuario;
            } else if (C == 2) {
                usuarioTres = nombreUsuario;
                edadtres = edadUsuario;
            }

            if (edadUsuario >= 18) {
                System.out.println(nombreUsuario + " es mayor de edad.");
            } else {
                System.out.println(nombreUsuario + " es menor de edad.");
            }

            if (edadUsuario > 120 || edadUsuario < 1) {
                System.out.println("Edad no válida.");
            }

            C = C + 1;
        }

        System.out.println("Resumen:");
        System.out.println("Usuario 1: " + usuarioUno + " - Edad: " + edadUno);
        System.out.println("Usuario 2: " + usuarioDos + " - Edad: " + edadDos);
        System.out.println("Usuario 3: " + usuarioTres + " - Edad: " + edadtres);
    }
}
