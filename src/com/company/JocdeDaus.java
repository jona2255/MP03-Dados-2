package com.company;

public class JocdeDaus {

    Dau[] dados = new Dau[3];

    public JocdeDaus() {

        this.dados[0] = new Dau();
        this.dados[1] = new Dau();
        this.dados[2] = new Dau();
    }

    public boolean jugar(){

        boolean acierto = false;

        dados[0].tirar();
        dados[1].tirar();
        dados[2].tirar();

        int a = dados[0].getValor();
        int b = dados[1].getValor();
        int c = dados[2].getValor();


        for (int i = 0; i < dados.length; i++) {

            dados[i].imprimir();
        }
        System.out.println();

        if (a == b && b == c){

            acierto = true;
        }


        return acierto;
    }

}
