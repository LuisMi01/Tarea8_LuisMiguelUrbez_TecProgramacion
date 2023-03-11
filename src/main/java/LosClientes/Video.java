package LosClientes;

import java.util.ArrayList;
import java.util.Scanner;

public class Video extends Obra{
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
}
