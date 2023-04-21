package a_introduction;

public class Task9 {
    static double min;
    public static void main(String[] args) {

        double a = -12.91;
        double b = 4.2;
        double c = 3.3;

        System.out.println("min is: "+ minFrom(a, b, c));

        System.out.println("max is: "+ Math.max(a, Math.max(b, c)));
    }

    public static double minFrom(double a, double b, double c) {

        if (a<b){
            if(a<c){
                min = a;
            } else
                min = c;
        }

        if (b<a){
            if (b<c) {
                min = b;
            } else
            min = c;
        }
        return min;
    }
}
