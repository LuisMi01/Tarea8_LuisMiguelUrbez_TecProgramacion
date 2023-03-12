package LosClientes;

import java.util.ArrayList;
import java.util.Scanner;

public class Libros extends Obra{
    ArrayList<String> libros = new ArrayList<String>();
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
