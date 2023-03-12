package LosClientes;

import java.util.ArrayList;
import java.util.Scanner;


public class Obra {
    static ArrayList<String> obras = new ArrayList<String>();
    enum Tipo {
        Libro, Video
    }
    public static void crearObra() {

            Scanner teclado = new Scanner(System.in);
            boolean salir = false;
            do {
                int opcion;
                System.out.println("¿Tipo?");
                System.out.println("1.- Libro");
                System.out.println("2.- Video");


                opcion = teclado.nextInt();

                try {
                    switch (opcion) {
                        case 1:
                            Libros.libro();
                            salir = true;
                            break;
                        case 2:
                            Video.video();
                            salir = true;
                            break;

                        default:
                            System.out.println("Debe ingresar un numero entre el 1 y 7");
                    }
                } catch (Exception e) {
                    System.out.println("Debe ingresar un numero entre el 1 y 7");
                }
            } while (!salir);
    }




}

