package a_introduction;

import java.text.DecimalFormat;

public class Task11 {

    public static void main(String[] args) {

        int pcs = 7;
        double price = 1.12;
        double discount = 0.13;
        double expectedSum = 6.82;

        boolean isCorrect = validateSumWithDiscount(pcs, price, discount, expectedSum);
        System.out.println("So, result is:\t"+ isCorrect);
    }

    public static boolean validateSumWithDiscount(int pcs, double price, double discount, double expectedSum) {


        DecimalFormat df = new DecimalFormat("#.##");

        double sum, dis, totalPrice;

        totalPrice = pcs * price;

        double discountAmount = totalPrice * discount;

        sum = totalPrice - discountAmount;

        System.out.println("totalPrice: \t"+pcs+" * "+price+" = "+ df.format(totalPrice));
        System.out.println("discountAmount:\t"+df.format(discountAmount));
        System.out.println("sum: \t\t\t"+df.format(totalPrice) +" - "+ df.format(discountAmount)+" = "+df.format(sum));
        System.out.println("expectedSum:\t"+df.format(expectedSum));

        if (df.format(sum).equals(df.format(expectedSum)) ){
            return true;
        }
        return false;
    }
}
