package com.company.tekwill;

import com.company.Animal;

public class Student {
    String name;
    int age;
   double height;
   Animal animalDeCompanie;

    void printDetals() {
        printName();
        printAge();
        printHeight();
    }

    void printName() {
        System.out.println("My name is " + name);
    }

    void printAge() {
        System.out.println("Age " + age);
    }

    void printHeight(){ System.out.println("Height " + height);}


}
