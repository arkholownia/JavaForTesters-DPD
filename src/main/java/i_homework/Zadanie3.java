package i_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Zadanie3 {
    static boolean sameLists = false;

    public static void main(String[] args) {

        List<String> ListA = Arrays.asList("Asia", "Basia", "Kasia");
        List<String> ListB = Arrays.asList("Asia", "Basia", "Kasia");
//        List<String> ListB = Arrays.asList("Asia", "Kasia", "Basia");

        listHomework(ListA, ListB);

        System.out.println("result is: " + sameLists);


    }


    private static boolean listHomework(List<String> ListA, List<String> ListB) {

        if (ListA.equals(ListB)) {
            sameLists = true;
        }
        return sameLists;
    }


}
