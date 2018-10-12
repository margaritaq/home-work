package com.company;

public class Lesson5 {
    public static void main(String[] args) {
        boolean b = (5 > 6) && (3 > 2) || (1 == 1);// AND=&&, OR=||
        boolean afaraPloua = true;
        boolean afaraEfrig = true;
        boolean aziEMiercuri = true;

        boolean stauAcasa = aziEMiercuri && afaraEfrig && afaraPloua;

        System.out.println(stauAcasa);
        if (stauAcasa == true) {
            System.out.println("eu stau acasa");
        } else {
            System.out.println("ma duc la perechi");
        }
        if (afaraPloua == true) {
            System.out.println("afara ploua");


        }

    }
}