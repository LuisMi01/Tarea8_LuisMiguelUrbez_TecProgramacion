package LosClientes;

import java.util.Scanner;

public class Pedido{
    static Main main = new Main();
    static Obra obra = new Obra();

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
        if (obra.obras.isEmpty()){
            System.out.println("No hay obras registradas");
            Main.main(null);
        }else {
            System.out.println("¿Que obra quieres añadir al pedido?");
            int i;
            for ( i = 0; i < obra.obras.size(); i++) {
                System.out.println(i + ".-" + obra.obras);
            }

            int numObra = sc.nextInt();

            if (numObra < 0 || numObra > obra.obras.size()){
                System.out.println("Debe ingresar un numero de obra valido");
                elegirObra();
            } else {
                System.out.println("Se ha añadido la obra:  " + obra.obras.get(numObra));
            }
        }
    }





}

