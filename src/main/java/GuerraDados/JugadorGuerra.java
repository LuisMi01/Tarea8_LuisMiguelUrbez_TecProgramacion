package GuerraDados;

import java.util.Scanner;

public class JugadorGuerra extends GuerraDados{
    static GuerraDados dados = new GuerraDados();
    public static void main(String[] args) {
        jugar();
    }

    static public void jugar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre 1");
        String nombre1 = teclado.nextLine();
        System.out.println("Nombre 2");
        String nombre2 = teclado.nextLine();

        int juego = 10;

        do {

            int dado1 = (int) (Math.random() * 6 + 1);
            System.out.println(nombre1 + " ha sacado un " + dado1);
            dados.dado1 = 10;
            int dado2 = (int) (Math.random() * 6 + 1);
            System.out.println(nombre2 + " ha sacado un " + dado2);
            dados.dado2 = 10;
            if (dado1 > dado2) {
                System.out.println("Gana " + nombre1);
                dados.dado1 = dados.fichas1 + 1;
                dados.dado2 = dados.fichas2 - 1;
                juego += +1;
                System.out.println("Marcador: " + nombre1 + " " + dados.dado1 + " - " + dados.dado2 + " " + nombre2);

            } else if (dado1 < dado2) {
                System.out.println("Gana " + nombre2);
                dados.dado1 = dados.fichas1 - 1;
                dados.dado2 = dados.fichas2 + 1;
                juego += +1;
                System.out.println("Marcador: " + nombre1 + " " + dados.dado1 + " - " + dados.dado2 + " " + nombre2);
            } else {
                System.out.println("Empate");
            }

        }while(juego != 20);
    }
}




















