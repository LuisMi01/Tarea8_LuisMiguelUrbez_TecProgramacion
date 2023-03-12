package LosClientes;

import java.util.Scanner;

public class Pedido{
    static Main main = new Main();
    static Video video = new Video();
    static Libros libros = new Libros();

    public static void pedidoPersona(){
        Scanner sc = new Scanner(System.in);
        if (main.clientes.isEmpty()){
            System.out.println("No hay clientes registrados");
            Main.main(null);
        }else {
            System.out.println("¿Para quien va a ser el pedido?");
            int i;
            for (i = 0; i < main.clientes.size(); i++) {
                System.out.println("Cliente nº" + i + " " + main.clientes.get(i));
            }
            int numCliente = sc.nextInt();

            if (numCliente < 0 || numCliente > main.clientes.size()) {
                System.out.println("Debe ingresar un numero de cliente valido");
                pedidoPersona();
            } else {
                System.out.println("Se ha elegido el cliente: " + main.clientes.get(numCliente));
            }
        }

    }
    public static void elegirObra(){
        Scanner sc = new Scanner(System.in);
        if (libros.libros.isEmpty() && video.videos.isEmpty()){
            System.out.println("No hay obras registradas");
            Main.main(null);
        }else {
            System.out.println("¿Que obra quieres añadir al pedido?");
            int g;
            for (g = 0; g < libros.libros.size(); g++) {
                System.out.println(g + ".- Libro " + libros.libros);
            }
            int j;
            for (j = 0; j < video.videos.size(); j++) {
                System.out.println(j + ".- Video " + video.videos);
            }

            int numObra = sc.nextInt();

            if (numObra < 0 || numObra > libros.libros.size() || numObra > video.videos.size()) {
                System.out.println("Debe ingresar un numero de obra valido");
                elegirObra();
            } else {
                System.out.println("Se ha elegido la obra: ");
                elegirObra();
            }
        }
    }

    public static int salirMenu(){
        boolean salir = true;

        if (salir == true){
            System.out.println("Saliendo al menu...\n");
            Main.main(null);
        }
        return 0;

    }


}

