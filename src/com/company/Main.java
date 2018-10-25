package com.company;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int  triunghi;
        triunghi = ShapeController.getPerimetruTriunghi(2,2,2);
        System.out.println(triunghi);
        int dreptunghi;
        dreptunghi =ShapeController.getPerimetruDreptunghi(5, 8);
        System.out.println(dreptunghi);
        Triangle myTriangle = new Triangle();
        ShapeController.incrementByTriunghi( myTriangle,1,1,1);
        Rectangle myRectangle = new Rectangle();
        ShapeController.incrementByDreptunghi(myRectangle, 1, 1);

    }
    }
