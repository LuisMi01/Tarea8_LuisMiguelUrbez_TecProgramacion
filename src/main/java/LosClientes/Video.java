package LosClientes;
import java.util.Scanner;

public class Video extends Obra{
    static String tituloVideo;
    static String autorVideo;
    static String duracionFinal;
    Obra.Tipo tipo = Obra.Tipo.Video;
    public static void video() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Título?");
        tituloVideo = teclado.nextLine();
        if (tituloVideo.isEmpty()) {
            System.out.println("Debe ingresar un titulo");
            video();
        } else {
            obras.add(tituloVideo);
        }

        System.out.println("¿Autor?");
        autorVideo = teclado.nextLine();
        if (autorVideo.isEmpty()) {
            System.out.println("Debe ingresar un autor");
            video();
        } else {
            obras.add(autorVideo);
        }

        System.out.println("¿Duracion? (Minutos)");
        int duracion = teclado.nextInt();

        if (duracion <= 0) {
            System.out.println("Debe ingresar una duracion mayor que 0 minutos");
            video();
        } else {
            int horas = duracion / 60;
            int minutos = duracion % 60;
            duracionFinal = horas + "h " + minutos + "min";
            obras.add(duracionFinal);
        }

        System.out.println("Se ha añadido el video:\n"
                + "Titulo: " + tituloVideo + "\n"
                + "Autor: " + autorVideo + "\n"
                + "Duracion: " + duracionFinal + "\n");

    }

    public static String getTituloVideo() {
        return tituloVideo;
    }

    public static void setTituloVideo(String tituloVideo) {
        Video.tituloVideo = tituloVideo;
    }

    public static String getAutorVideo() {
        return autorVideo;
    }

    public static void setAutorVideo(String autorVideo) {
        Video.autorVideo = autorVideo;
    }

    public static String getDuracionFinal() {
        return duracionFinal;
    }

    public static void setDuracionFinal(String duracionFinal) {
        Video.duracionFinal = duracionFinal;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
