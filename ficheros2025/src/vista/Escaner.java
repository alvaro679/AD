package vista;

import java.util.Scanner;

public class Escaner {

    public static String pedirString(String dato) {

        Consola.mostrarMensaje(dato);
        Scanner sc = new Scanner(System.in);
        String datos = sc.nextLine();

        return datos;
    }

    public static byte pedirByte(byte opcion){;
        Scanner sc = new Scanner(System.in);
        String datos = sc.nextByte();
    }
}