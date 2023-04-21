package a_introduction;

import java.time.Year;

public class Task8 {

    public static void main(String[] args) {

        int price = 123;
        double discount= 0.23;

        calculatePrice(price, discount);
    }
    public static double calculatePrice(int price, double discount) {

        double finalPrice = price - price * discount;

        System.out.println(finalPrice);
        return finalPrice;

    }
}
