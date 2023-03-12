package LosClientes;

import java.util.Scanner;

public class Pedido{
    static Main main = new Main();
    static Video video = new Video();
    static Libros libros = new Libros();

    public static void pedido(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Para quien va a ser el pedido?");
        int i;
        for (i = 0; i < main.clientes.size(); i++) {
            System.out.println("Cliente nº"+ i +" "+ main.clientes.get(i));
        }
        int numCliente = teclado.nextInt();
        numCliente = Integer.parseInt(main.clientes.get(i));
        if (numCliente <= 0 || numCliente > main.clientes.size()){
            System.out.println("Debe ingresar un numero de cliente valido");
            pedido();
        }else{
            System.out.println("Se ha elegido el cliente: " + main.clientes.get(numCliente));
        }

        System.out.println("¿Que obra quieres aladir al pedido?");
        int j;
        for (j = 0; j < video.videos.size(); j++) {
            System.out.println(i + ".- Video " + video.videos);
        }
    }









}

