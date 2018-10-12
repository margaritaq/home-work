package com.company;

public class Mainx2 {
    public static void main(String[] args) {







      /*  long a = 999999999999999L;
        float b = 5.2f;
        char c = 'v';
        System.out.println(a);
        int m = (int) a;
        System.out.println(m);*/


       /* int a = 5;

        int b = a++ - ++a + a++;// 5-7+7
        System.out.println(b);
        System.out.println(a);*/

      /*  int a = 1;
        // int b = a++;//b=1 a = 2
        // int b = ++a; // 2
        int b = a++ + ++a; //b= 1 + 3 // 1+ (1++)  + (2+1)
        System.out.println(b);
        System.out.println(a);*/


      /*  int a = 0;
        a += 5; // a= a+5;*/

      /*  StringBuilder sb = new StringBuilder("Luca");
        StringBuilder sb2 = new StringBuilder("Luca");
        System.out.println(sb==sb2);
        System.out.println(sb.toString().equals(sb2.toString()));
        System.out.println(sb2);*/


         /*     StringBuilder sb = new StringBuilder("Victor");
        sb.append(" Neaga");
        System.out.println(sb);*/


 /* StringBuilder a = new StringBuilder("Margarita ");

        System.out.println(a.append("Gabureac"));*/

        /*  String a = "Margarita";
        String b = "Natalia";

        int comp = a.compareTo(b);
        if (comp > 0) {
            System.out.println("Al doilea nume este mai mare!");
        } else {
            System.out.println("Primu nume e mai mare!");
        }

        String q = "Ana";
        String w = "Ana";
        int comparatie = q.compareTo(w);
        if(comparatie<0){
            System.out.println("Al doilea nume este mai mare!");
        } else if (comparatie>0){
            System.out.println("Primu nume e mai mare!");
        } else {
            System.out.println("Ele sunt egale");
        }*/


/*import com.company.tekwill.*;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;


import java.util.Arrays;
import java.util.concurrent.Callable;

        public class Main {

            public static void main(String[] args) {
                String s = "A";
                String s1 = "A";
                String s2 = new String("A");
                String s3 = new String("B");
                System.out.println(s == s1);
                System.out.println(s1 == s2);
                System.out.println(s2 == s3);
                System.out.println(s == s3);
            }
        }*/


      /*  Calculator calculator = new Calculator();

        String[] listaMea = {"Jora", " ion", "vasile" ,"Dorin"};
        System.out.println(calculator.getStringFromArray(listaMea,0));
        System.out.println(calculator.getStringFromArray(listaMea,-10));
        System.out.println(calculator.getStringFromArray(listaMea,10));
        System.out.println(calculator.getStringFromArray(listaMea,2));  */

      /* Calculator calculator = new Calculator();
       Student ion = calculator.createStudent("Ion",20, 180.5);
        Student jora = calculator.createStudent("Jora",10, 1.85);
        Animal dog= new Animal();
        dog.name = "Lucky";
        jora.printDetals();
        ion.printDetals();
        System.out.println(ion.name.length());
        ion.animalDeCompanie = dog;
        jora.animalDeCompanie = dog;
        System.out.println(ion.animalDeCompanie.name);
        ion.animalDeCompanie.name = "Good boy";
        System.out.println(jora.animalDeCompanie.name);


    }}*/


     /*   Calculator calculator = new Calculator();
        int sumaMea = calculator.getSum(5, -12);
        System.out.println("Suma = " + sumaMea);
        System.out.println(calculator.getSubtraction(100, 1));


        Calculator calc = new Calculator();
        int multiplicarea = calc.getMultiply(3, 2);
        System.out.println("inmultirea = "+ multiplicarea);

        Calculator divid = new Calculator();
        double impartirea = divid.getDivide(4, 2);
        System.out.println("impartirea = "+ impartirea);

        Calculator ecGradDoi = new Calculator();
        double[]solutiaNoastra = ecGradDoi.calculeazaDescriminant(2,-5,3);
        System.out.println(solutiaNoastra[0]+ " "+ solutiaNoastra[1]);
        // sau System.out.println(Arrays.toString(solutiaNoastra)); */



      /*  Calculator calculator = new Calculator();
        int sumaMea = calculator.getSum(5, -12);
        System.out.println("Suma = " + sumaMea);
        System.out.println(calculator.getSubtraction(100, 1));


        Calculator calc = new Calculator();
        int multiplicarea = calc.getMultiply(3, 2);
        System.out.println("inmultirea = "+ multiplicarea);

        Calculator divid = new Calculator();
        double impartirea = divid.getDivide(4, 2);
        System.out.println("impartirea = "+ impartirea);

        Calculator ecGradDoi = new Calculator();
        ecGradDoi.calculeazaDescriminant(2,4,2); */


/*Animal[] animals = new Animal[3];
//{ null, null, null}
        Animal one=new Animal();
        one.name = "Dog";

        Animal two=new Animal();
       two.name = "cat";

        Animal three=new Animal();
        three.name = "cow";

        animals[0]= one;
        animals[1]= two;
        animals[2]=three;
int animalcounter = 0;
        for (Animal x :animals) {
            if (x.name.startsWith("c")){
                animalcounter++;
            }

        }

        System.out.println(animalcounter);*/




       /* Employee employee1 = new Employee();
        employee1.nume = "Eugen Rata";
        employee1.taraNatala = "Moldova";
        employee1.salariu = 10000;
        employee1.marks = new double[]{7, 8, 6, 7, 8};
        employee1.printMarks();


        employee1.printDitale();*/


/*  String name = "Margarita Gabureac";
        int age = 26;
        double nota = 7.8;
        System.out.println("nume: " + name + "," + "vârsta: " + age + "," + "nota: " + nota ); */
     /* String a = "ds";
      Student jora = new Student();
       jora.age = 19;
       jora.name = "gheorghe";
       jora.height = 180.6;

       Student student1 = new Student();
       student1.name = "Ion";
       student1.age = 40;
       student1.height = 165.5;


        System.out.println(jora.name);
        System.out.println(student1.name);
         student1.printName();
         jora.printName(); */
    }
}
