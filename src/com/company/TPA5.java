package com.company;

public class TPA5 {
    public static void main(String[] args) {

        String[] Lunile = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};

        int[] temperaturiMedii2017 = {-4, 0, 7, 9, 16, 21, 22, 23, 18, 10, 5, 3};
        int suma = 0;
        for (int i = 0; i < Lunile.length; i++) {
            /* System.out.print(Lunile[i] + "  " + temperaturiMedii2017[i] + " Celsius, ");*/
            if (i <= 10) {
                System.out.print(Lunile[i] + "  " + temperaturiMedii2017[i] + " Celsius, ");
            } else {
                System.out.print(Lunile[i] + "  " + temperaturiMedii2017[i] + " Celsius. ");
            }

        }
       /* // temperatura medie anuala
        suma= (temperaturiMedii2017[0]+temperaturiMedii2017[1]+temperaturiMedii2017[2]+temperaturiMedii2017[3]+
                temperaturiMedii2017[4]+temperaturiMedii2017[5]+temperaturiMedii2017[6]+temperaturiMedii2017[7]+
                temperaturiMedii2017[8]+temperaturiMedii2017[9]+temperaturiMedii2017[10]+temperaturiMedii2017[11])/12;
        System.out.println("Media anuala = " + suma + "Celsius");*/


        System.out.println("  ");
        System.out.println("  ");
        for (int i = 0; i < Lunile.length; i++) {
            /*  System.out.print(Lunile[i] + " " + (temperaturiMedii2017[i] + 273) + " Kelvin, "); */
            if (i == 11) {
                System.out.print(Lunile[i] + "  " + temperaturiMedii2017[i] + " Celsius. ");
            } else {
                System.out.print(Lunile[i] + "  " + temperaturiMedii2017[i] + " Celsius, ");
            }


        }
    }

}

