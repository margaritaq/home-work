package com.company;

import com.company.tekwill.Student;

public class Calculator {

    int getSum(int a, int b) {
        int suma = a + b;
        return suma;
    }

    int getSubtraction(int a, int b) {
        int diff = a - b;
        return diff;
    }

    int getMultiply(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    double getDivide(double a, double b) {
        double divid = a / b;
        return divid;
    }

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

  /*  Student createStudent(String name, int age, double height) {

        Student studentToBeReturn = new Student();
        studentToBeReturn.name = name;
        studentToBeReturn.age = age;
        studentToBeReturn.height = height;

        return studentToBeReturn;
    }*/

    // ["a", "b", "c"] , 100
    String getStringFromArray(String[] list, int x) {
        if (x < list.length && x >= 0) {
            return list[x];
        } else {
            return "No solution!!!";
        }
    }

}
  /*  void calculeazaDescriminant( double a, double b, double c) {
        double x1;
        double x2;


        double descriminant = (b * b) - 4 * a * c;
        System.out.println(descriminant);

        if (descriminant > 0) {
            x1 = ((-b + Math.sqrt(descriminant)) / (2 * a));
            x2 = ((-b - Math.sqrt(descriminant)) / (2 * a));

            System.out.println("x1= " + x1 + " " + "x2= " + x2);

        } else {
            if (descriminant == 0) {
                x1 = x2 = -b / (2 * a);
                System.out.println("x1= " + x1 + " " + "x2= " + x2);
            } else {
                System.out.println("Ecuatia nu are solutii reale");
            }
        } */


