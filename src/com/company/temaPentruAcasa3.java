package com.company;

public class temaPentruAcasa3 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = 2;
        System.out.println("formula = ((a*(x*x)) + (b*x) + c)=0");
        System.out.println("a,b,c=R, a nu poate fi egal cu 0");
        System.out.println("a= " + a + "; b= " + b + "; c= " + c + ";");
        System.out.println("Rezolvare: ");
        String formula2 = ("Δ = (b*b)-4*a*c");
        System.out.println(formula2);
        int Δ = (b * b) - 4 * a * c;
        System.out.println("Δ = " + Δ);
        System.out.println("Δ>0 - ecuatia are 2 solutii reale si distincte");
        double x1 = ((-b + Math.sqrt(Δ)) / (2 * a));
        System.out.println("Raspuns:");
        System.out.println("x1= " + x1 + ";");
        double x2 = ((-b - Math.sqrt(Δ)) / (2 * a));
        System.out.println("x2= " + x2 + ";");


        System.out.println("\u0394 is the delita");

    }
}
