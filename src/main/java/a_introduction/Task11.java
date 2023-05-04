package a_introduction;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Task11 {

    public static void main(String[] args) {

        int pcs = 7;
        double price = 1.12;
        double discount = 0.13;
        double expectedSum = 6.82;
        boolean isCorrect = validateSumWithDiscountBigDecima(pcs, price, discount, expectedSum);
//        boolean isCorrect = validateSumWithDiscount(pcs, price, discount, expectedSum);
//        System.out.println("So, result is:\t"+ isCorrect);
    }
    public static boolean validateSumWithDiscountBigDecima(int pcs, double price, double discount, double expectedSum) {

        String sPrice = ""+price;
        String sDiscount = ""+discount;
        String sExpectSum = ""+expectedSum;


        BigDecimal cenaBezRabatu = new BigDecimal(sPrice );

        System.out.println("price is: " +cenaBezRabatu);

        if (1==1)  {
            return true;
        }
        return false;
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
