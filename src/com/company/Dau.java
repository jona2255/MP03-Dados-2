package com.company;

public class Dau {

    int valor;

    void tirar(){

        this.valor = (int)(Math.random() * 6.0D) + 1;
    }

    void imprimir(){

        System.out.println("Ha salido un " + valor);
    }

    public int getValor() {

        return valor;
    }


}
