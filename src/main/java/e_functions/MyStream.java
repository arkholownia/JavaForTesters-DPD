package e_functions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class MyStream {
    public static void main(String[] args) {
//        mnames();

        something();
    }

    private static void something() {
        ArrayList<Integer> num = new ArrayList<Integer>();
//        for (int i = 1; i < 10; i++) {
//            num.add(i);
//        }
//        num.forEach(i -> {
//            System.out.print(i * i + ",");
//        });

        List<Integer> nums = IntStream.range(1,10)
                .boxed()
                .map(n -> n*n)
                .toList();
        System.out.print(nums);


    }

    private static void mnames() {
        List<String> names = List.of("John Carmack", "Alan Richardson", "Chuck Norris", "Barack Obama");
        List<String> lastName = names
                .stream()
                .map(f -> f.split(" ")[1])
                .toList();
        System.out.println(lastName);
    }

}
