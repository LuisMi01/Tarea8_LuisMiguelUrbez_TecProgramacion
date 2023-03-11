package GuerraDados;

import java.util.Scanner;

public class JugadorGuerra extends GuerraDados{
    public JugadorGuerra(String nombre) {
        super(nombre);
    }

    public static void main(String[] args) {
            JugadorGuerra jugador1 = new JugadorGuerra("Jugador 1");
            JugadorGuerra jugador2 = new JugadorGuerra("Jugador 2");

            while (jugador1.getFichas() > 0 && jugador2.getFichas() > 0) {
                int resultado1 = jugador1.lanzarDado();
                int resultado2 = jugador2.lanzarDado();

                System.out.println(jugador1.getNombre() + " sacó un " + resultado1);
                System.out.println(jugador2.getNombre() + " sacó un " + resultado2);

                if (resultado1 > resultado2) {
                    System.out.println(jugador1.getNombre() + " gana la ronda");
                    jugador2.quitarFicha();
                } else if (resultado2 > resultado1) {
                    System.out.println(jugador2.getNombre() + " gana la ronda");
                    jugador1.quitarFicha();
                } else {
                    System.out.println("Empate");
                }

                System.out.println(jugador1.getNombre() + " tiene " + jugador1.getFichas() + " fichas");
                System.out.println(jugador2.getNombre() + " tiene " + jugador2.getFichas() + " fichas");
                System.out.println();
            }

            if (jugador1.getFichas() == 0) {
                System.out.println(jugador2.getNombre() + " gana la guerra de dados");
            } else {
                System.out.println(jugador1.getNombre() + " gana la guerra de dados");
            }
        }
    }























