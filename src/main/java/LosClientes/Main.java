package LosClientes;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static Scanner teclado = new Scanner(System.in);
    static ArrayList<String> clientes = new ArrayList<String>();
    public static void main(String[] args) {
        boolean salir = false;
        do {
            int opcion;
            System.out.println("--Menu--");
            System.out.println("1.- Mostrar clientes");
            System.out.println("2.- Añadir cliente");
            System.out.println("3.- Crear una obra");
            System.out.println("4.- Crear un pedido");
            System.out.println("5.- Mostrar pedidos");
            System.out.println("6.- salir");

            opcion = teclado.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        mostrarClientes();
                        break;
                    case 2:
                        anadirCliente();
                        break;
                    case 3:
                        Obra.crearObra();
                        break;
                    case 4:
                        Pedido.pedidoPersona();
                        break;
                    case 5:
                        Pedido.mostrarPedidos();
                        break;
                    case 6:
                        salir = true;
                        break;

                    default:
                        System.out.println("Debe ingresar un numero entre el 1 y 7");
                }
            }
            catch (Exception e) {
                System.out.println("Debe ingresar un numero entre el 1 y 7");
            }
        }while (!salir);

    }


    public static void mostrarClientes(){
        System.out.println("--Clientes--");
        for(int i = 0; i < clientes.size(); i++){
            System.out.println("Cliente nº"+ i +" "+ clientes.get(i));
        }
    }

    public static void anadirCliente(){
        System.out.println("¿Cual es el nombre del cliente?");
        String nombre = teclado.next();
        clientes.add(nombre);
    }

}
