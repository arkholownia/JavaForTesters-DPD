package i_homework;

import java.util.Random;

public class Zadanie2 {
    static String newUniqueEmail, emialToSplit;

    public static void main(String[] args) {

        emialToSplit = "email@gmail.com";
        newUniqueEmail = StringHomework(emialToSplit);

        System.out.println(emialToSplit+"\n"+newUniqueEmail);
    }

    private static String StringHomework(String email) {

        String[] spl = email.split("@");
        Random r = new Random();
        int i = r.nextInt(100000,999999);

        newUniqueEmail = spl[0] + "+" + i + "@"+spl[1];
        return newUniqueEmail;

    }
}
