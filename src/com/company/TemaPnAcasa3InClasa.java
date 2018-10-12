package com.company;

public class TemaPnAcasa3InClasa {
    public static void main(String[] args) {
 // ax^2 + bx +c=0
        int a=3;
        int b=7;
        int c=2;
        // 1x^2 + 2x + 3 = 0
        // delta = b*b - 4 *a * c;
        double delta = b*b - 4 * a * c;
        double one = (-b + Math.sqrt(delta) ) / (2*a);
        double two = (-b - Math.sqrt(delta) ) / (2*a);
        System.out.println(one);
        System.out.println(two);
    }
}
