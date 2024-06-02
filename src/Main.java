import actividad_4.AddresBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static actividad_4.AddresBook.Create;
import static actividad_4.AddresBook.Delete;
import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) throws IOException {
        String nombre;
        String numero;
        int opcion = 0;

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> contactos = new HashMap<>();

        AddresBook mensajero = new AddresBook();
        System.out.println("Bienvenido a la agenda");
        System.out.println("Elige una accion a ejecutar:");
        System.out.println("Presiona 1 para añadir contactos");
        System.out.println("Presiona 2 para ver la lista de contactos");
        System.out.println("Presiona 3 para eliminar un contacto");
        System.out.println("Presiona 4 para leer el archivo");
        System.out.println("Presiona 5 para escribir en archivo");

        opcion = parseInt(read.readLine());
        while (opcion < 6) {
            switch (opcion) {
                case 1:
                    Create();
                    opcionesAEjecutar();
                    opcion = parseInt(read.readLine());
                    break;
                case 2:
                    mensajero.List();
                    opcionesAEjecutar();
                    opcion = parseInt(read.readLine());
                    break;
                case 3:
                    Delete();
                    opcionesAEjecutar();
                    opcion = parseInt(read.readLine());
                    break;
                case 4:

                mensajero.LeerArchivo();
                opcionesAEjecutar();
                opcion = parseInt(read.readLine());
                break;
                case 5:
                    mensajero.EscribirArchivo();
                    opcion = parseInt(read.readLine());
                    break;


            }
        }

    }
    public static void opcionesAEjecutar() {
        System.out.println("Elige una accion a ejecutar");
        System.out.println("Presiona 1 para añadir contactos");
        System.out.println("Presiona 2 para ver la lista de contactos");
        System.out.println("Presiona 3 para eliminar un contacto");
        System.out.println("Presiona 4 para leer archivo");
        System.out.println("Presiona 5 para escrbir el archivo");
    }

}