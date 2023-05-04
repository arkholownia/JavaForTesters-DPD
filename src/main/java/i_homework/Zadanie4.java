package i_homework;

import java.util.*;

public class Zadanie4 {


    public static void main(String[] args) {

        ArrayList<String> ListA = new ArrayList<>(Arrays.asList("Asia", "Basia", "Kasia"));
//        ArrayList<String> ListB = new ArrayList<>(Arrays.asList("Asia", "Kasia", "Basia"));
        ArrayList<String> ListB = new ArrayList<>(Arrays.asList("Asia", "Zosia", "Basia"));
        Collections.sort(ListA);
        Collections.sort(ListB);
        boolean equivalent = equivalentList(ListA, ListB);
        System.out.println("status is: "+equivalent);
    }

    private static boolean equivalentList(ArrayList<String> ListaA, ArrayList<String> ListaB){
        boolean equivalen = false;
                if (ListaA.equals(ListaB)){
                    equivalen = true;
                }

        return equivalen;
    }
}
