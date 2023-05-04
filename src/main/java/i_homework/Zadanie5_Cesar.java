package i_homework;

import java.math.BigInteger;

public class Zadanie5_Cesar {


    static String str = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
    static int m = -3;

    public static void main(String[] args) {

        cesar(str,m);

//        QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
//        QEB NRF@H ?OLTK CLU GRJMP LSBO QEB I>WV ALD
    }

    private static void cesar(String str, int m) {
        for (char c : str.toCharArray()){
            char nc;
            int n = 32;

            if (c != 32){
                n = c+m;
            }

            nc = (char)n;
            System.out.print(nc);
        }
    }

    private static void drugi(){
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray())
            sb.append((int) c);
        System.out.println(sb);

    }
    private static void pierwszy() {
        char c = 'a';
        int i = (int) c; // zamien znak na ascii
        int j = i + m; // dodaj przesuniecie
        char newChar = (char) j;//zmien na litere
        System.out.println(newChar);//wypisz nowy znak
    }

}
