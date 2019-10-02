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

        int a = this.dados[0].tirar();
        int b = this.dados[1].tirar();
        int c = this.dados[2].tirar();

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
