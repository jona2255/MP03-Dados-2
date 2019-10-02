package com.company;

public class Dau {

    int valor;

    int tirar(){

        this.valor = (int)(Math.random() * 6.0D) + 1;
        return valor;

    }

    void imprimir(){


        System.out.println("Ha salido un " + valor);
    }

}
