package LosClientes;

import java.util.Scanner;

public class Pedido extends Main{
    Main main = new Main();

    public static void pedido(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Para quien va a ser el pedido?");
        int i;
        for (i = 0; i < clientes.size(); i++) {
            System.out.println("Cliente nº"+ i +" "+ clientes.get(i));
        }
        int numPedido = teclado.nextInt();
        numPedido = Integer.parseInt(clientes.get(i));
        if (numPedido <= 0 || numPedido > clientes.size()){
            System.out.println("Debe ingresar un numero de cliente valido");
            pedido();
        }else{
            System.out.println("Se ha elegido el cliente: " + clientes.get(numPedido));
            System.out.println("¿QUe obra desea añadir?");
            int j;
            for (j = 0; j < .size(); j++) {
                System.out.println(j +".- "+ clientes.get(j));
            }
            int numObra = teclado.nextInt();
            numObra = Integer.parseInt(clientes.get(j));
            if (numObra <= 0 || numObra> clientes.size()){
                System.out.println("Debe ingresar un numero de obra valido");
                pedido();
            }else{
                System.out.println("Se ha elegido la obra: " + clientes.get(numPedido));

            }
        }
    }
}
