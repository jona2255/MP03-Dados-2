package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int tiradas = 0;
        int ganadas = 0;
        JocdeDaus juego = new JocdeDaus();


        for (int opcion = menu(); opcion != 0; opcion = menu()) {

            System.out.println();

            ++tiradas;

            boolean acierto = juego.jugar();

            if (acierto) {
                System.out.println("Has ganado!");
                ++ganadas;
            }

        }

        System.out.println("Has tirado "+ tiradas + " y has ganado " + ganadas +" partidas!");

    }

    public static int menu(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.println();
        System.out.println("¿Que quieres hacer?");
        System.out.println("1 - Jugar");
        System.out.println("0 - Cerrar");

        return scanner.nextInt();


    }

}
