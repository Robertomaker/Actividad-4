package actividad_4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddresBook {
    String nombre;
    String numero;
    static Map<String, String> contactos= new HashMap<>();
    static Scanner entrada = new Scanner(System.in);

    public void EscribirArchivo() throws FileNotFoundException {
        System.setOut(new PrintStream(new FileOutputStream("Lista.txt")));

        System.out.println(contactos.entrySet());

    }
    public void LeerArchivo() throws IOException {
        String cadena;
        FileReader leer= new FileReader("Lista.txt");
        BufferedReader l = new BufferedReader(leer);
        while((cadena = l.readLine()) != null){
            System.out.println(cadena);

        }

    }

    public void List(){
        if(contactos == null){
            System.out.println("No hay contactos");
        }else {
            System.out.println("Contactos: ");

            System.out.println(contactos.entrySet());
            System.out.println ("");
            System.out.println ("");
        }


    }
    public static void Create(){
        System.out.println("Introduce el nombre");
        String nombre = entrada.nextLine();
        System.out.println("Introduce el numero");
        String numero = entrada.nextLine();
        System.out.println("");
            if(contactos.containsKey(nombre)) {
                System.out.println("Existe el contacto");
            }else{
                contactos.put(nombre, numero);
                System.out.println ("**Se añadio el contacto**");
                System.out.println ("");
                System.out.println ("");


            }
    }
    public static void Delete(){
        System.out.println("Introduce el nombre del contacto que desea eliminar");
        String nombre = entrada.nextLine();

        if(contactos.containsKey(nombre)) {
            contactos.remove(nombre);
            System.out.println("El contacto ha sido borrado");
        }else{
            System.out.println ("El contacto no existe");

        }

    }



}
