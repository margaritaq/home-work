package com.company;

import java.util.Arrays;

public class Employee {
    String nume;
    String taraNatala;
    int salariu;
    double[] marks;
void printMarks(){
    for ( double mark : marks){
        System.out.print(mark+" ");
    }
}

    void printDitale() {
        System.out.println("Numele: " + nume + ";" + " Tara natala este: " + taraNatala + ";" + " Salariu: " + salariu + " lei " + ";" + " Notele sunt: " + Arrays.toString(marks)+ ";");
    }
}

/*void printNume (){
    System.out.println("Numele: " + nume);
}
    void printTara (){
        System.out.println("Tara natala este: " + taraNatala);
    }
    void printSalariu () {
        System.out.println("Salariu: " + salariu);
    }
    void printmark (){
        System.out.println("Notele sunt: " + marks);
    }*/

