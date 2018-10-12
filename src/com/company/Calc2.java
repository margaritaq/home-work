package com.company;

public class Calc2 {
    double[] calculeazaDescriminant(double a, double b, double c) {


        double[] solution = new double[2];

        double descriminant = (b * b) - 4 * a * c;


        if (descriminant > 0) {
            solution[0] = ((-b + Math.sqrt(descriminant)) / (2 * a));
            solution[1] = ((-b - Math.sqrt(descriminant)) / (2 * a));

        } else {
            if (descriminant == 0) {
                solution[0] = solution[1] = -b / (2 * a);
            } else {
                System.out.println("Ecuatia nu are solutii reale");
            }
        }
        return solution;
    }
}
