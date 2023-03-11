package LosClientes;

import java.util.ArrayList;
import java.util.Scanner;


public class Obra {
    //Elementos comunes de libros y videos
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
                            libro();
                            salir = true;
                            break;
                        case 2:
                            video();
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

    public static void video() {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> videos = new ArrayList<String>();

        System.out.println("¿Título?");
        String titulo = teclado.nextLine();
        if (titulo.isEmpty()) {
            System.out.println("Debe ingresar un titulo");
            video();
        } else {
            videos.add(titulo);
        }

        System.out.println("¿Autor?");
        String autor = teclado.nextLine();
        if (autor.isEmpty()) {
            System.out.println("Debe ingresar un autor");
            video();
        } else {
            videos.add(autor);
        }

        System.out.println("¿Duracion? (Minutos)");
        int duracion = teclado.nextInt();
        String duracionFinal = null;
        if (duracion <= 0) {
            System.out.println("Debe ingresar una duracion mayor que 0 minutos");
            video();
        } else {
            int horas = duracion / 60;
            int minutos = duracion % 60;
            duracionFinal = horas + "h " + minutos + "min";
            videos.add(duracionFinal);
        }

        System.out.println("Se ha añadido el video:\n"
                + "Titulo: " + titulo + "\n"
                + "Autor: " + autor + "\n"
                + "Duracion: " + duracionFinal + "\n");

    }
    public static void libro(){
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> libros = new ArrayList<String>();

        System.out.println("¿Título?");
        String titulo = teclado.nextLine();
        if (titulo.isEmpty()){
            System.out.println("Debe ingresar un titulo");
            libro();
        }else{
            libros.add(titulo);
        }

        System.out.println("¿Autor?");
        String autor = teclado.nextLine();
        if (autor.isEmpty()){
            System.out.println("Debe ingresar un autor");
            libro();
        }else{
            libros.add(autor);
        }

        System.out.println("¿Numero de paginas?");
        int paginas = teclado.nextInt();
        if (paginas <= 0){
            System.out.println("Debe ingresar un numero de paginas mayor que 0");
            libro();
        }else{
            libros.add(String.valueOf(paginas));
        }

        System.out.println("Se ha añadido el libro:\n"
                + "Titulo: " + titulo + "\n"
                + "Autor: " + autor + "\n"
                + "Numero de paginas: " + paginas + "\n");
    }

}

