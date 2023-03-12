package LosClientes;
import java.util.Scanner;

public class Libros extends Obra{
    static String tituloLibro;
    static String autorLibro;
    static int paginas;
    Obra.Tipo tipo = Obra.Tipo.Libro;
    
    public static void libro(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("¿Título?");
        tituloLibro = teclado.nextLine();
        if (tituloLibro.isEmpty()){
            System.out.println("Debe ingresar un titulo");
            libro();
        }else{
            obras.add(tituloLibro);
        }

        System.out.println("¿Autor?");
        autorLibro = teclado.nextLine();
        if (autorLibro.isEmpty()){
            System.out.println("Debe ingresar un autor");
            libro();
        }else{
            obras.add(autorLibro);
        }

        System.out.println("¿Numero de paginas?");
         paginas = teclado.nextInt();
        if (paginas <= 0){
            System.out.println("Debe ingresar un numero de paginas mayor que 0");
            libro();
        }else{
            obras.add(String.valueOf(paginas));
        }

        System.out.println("Se ha añadido el libro:\n"
                + "Titulo: " + tituloLibro + "\n"
                + "Autor: " + autorLibro + "\n"
                + "Numero de paginas: " + paginas + "\n");
    }

    public static String getTituloLibro() {
        return tituloLibro;
    }

    public static void setTituloLibro(String tituloLibro) {
        Libros.tituloLibro = tituloLibro;
    }

    public static String getAutorLibro() {
        return autorLibro;
    }

    public static void setAutorLibro(String autorLibro) {
        Libros.autorLibro = autorLibro;
    }

    public static int getPaginas() {
        return paginas;
    }

    public static void setPaginas(int paginas) {
        Libros.paginas = paginas;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
