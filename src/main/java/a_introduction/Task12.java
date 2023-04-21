package a_introduction;

import java.text.DecimalFormat;

public class Task12 {
    static DecimalFormat df = new DecimalFormat("#");
    public static void main(String[] args) {

        System.out.println("środek ukłądu: " + getQuadrant(0,0));

        System.out.println("ćwiartka: " + df.format(getQuadrant(1,1)));
        System.out.println("ćwiartka: " + df.format(getQuadrant(1,-1)));
        System.out.println("ćwiartka: " + df.format(getQuadrant(-1,-1)));
        System.out.println("ćwiartka: " + df.format(getQuadrant(-1,1)));

        System.out.println("prawa str: " + getQuadrant(1,0));
        System.out.println("lewa  str: " + getQuadrant(-1,0));

        System.out.println("góra: " + getQuadrant(0,1));
        System.out.println("dół:  " + getQuadrant(0,-1));
    }
    public static double getQuadrant(double x, double y){

        double quadrant = 0;

        if (x > 0 && y > 0)
            quadrant = 1;
        if (x > 0 && y < 0)
            quadrant = 2;
        if (x < 0 && y < 0)
            quadrant = 3;
        if (x < 0 && y > 0)
            quadrant = 4;

        if (x == 0 && y > 0)
            quadrant = 1.4;
        if (x == 0 && y < 0)
            quadrant = 2.3;

        if (x > 0 && y == 0)
            quadrant = 1.2;
        if (x < 0 && y == 0)
            quadrant = 3.4;


        return quadrant;
    }
}