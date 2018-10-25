package com.company;

public class ShapeController {
    static int getPerimetruDreptunghi(int height, int width) {
        int perimetru = 2 * height + 2 * width;
        return perimetru;
    }

    public static int getPerimetruTriunghi(int lengthOne, int lengthTwo, int lengthThree) {
        int perimetru = lengthOne + lengthTwo + lengthThree;
        return perimetru;
    }

    static void incrementByDreptunghi(Rectangle dreptunghi, int x, int y) {
        dreptunghi.height += x;
        dreptunghi.width += y;
    }

    static void incrementByTriunghi(Triangle triunghi, int a, int b, int c) {
        triunghi.lengthOne += a;
        triunghi.lengthTwo += b;
        triunghi.lengthThree += c;

    }
}
