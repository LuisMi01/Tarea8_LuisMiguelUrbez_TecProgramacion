package LosClientes;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido{
    static Main main = new Main();
    static Obra obra = new Obra();

    static ArrayList<String> pedidos = new ArrayList<String>();
    static String numCliente;
    static String numObra;

    public static void pedidoPersona(){
        Scanner sc = new Scanner(System.in);
        if (main.clientes.isEmpty()){
            System.out.println("No hay clientes registrados");
            Main.main(null);
        }else {
            System.out.println("¿Para quien va a ser el pedido?");
            int i;
            for (i = 0; i < main.clientes.size(); i++) {
                System.out.println("Cliente nº" + i + ": " + main.clientes.get(i));
            }
             numCliente = sc.next();

            if (numCliente.length() < 0 || numCliente.length() > main.clientes.size()) {
                System.out.println("Debe ingresar un numero de cliente valido");
                pedidoPersona();
            } else {
                System.out.println("Se ha elegido el cliente: " + main.clientes.get(Integer.parseInt(numCliente)));
                pedidos.add(main.clientes.get(Integer.parseInt(numCliente)));
            }
        }

        if (obra.obras.isEmpty()){
            System.out.println("No hay obras registradas");
            Main.main(null);
        }else {
            System.out.println("¿Que obra quieres añadir al pedido?");
            int i;
            for ( i = 0; i < obra.obras.size(); i++) {
                System.out.println(i + ".-" + obra.obras);
            }

             numObra = sc.next();

            if (numObra.length() < 0 || numObra.length() > obra.obras.size()){
                System.out.println("Debe ingresar un numero de obra valido");
                pedidoPersona();
            } else {
                System.out.println("Se ha añadido la obra:  " + obra.obras.get(Integer.parseInt(numObra)));
                pedidos.add(obra.obras.get(Integer.parseInt(numObra)));
            }
        }
    }

    public static void mostrarPedidos(){
        System.out.println("--Pedidos--\n");
        for(int i = 0; i < pedidos.size(); i++){
            System.out.println("    *Pedido de: " + pedidos.get(Integer.parseInt(main.clientes.get(Integer.parseInt(numCliente)))) + "\n"+
                    "Obra: " + pedidos.get(Integer.parseInt(obra.obras.get(Integer.parseInt(numObra))))
                    );
        }
    }




}

