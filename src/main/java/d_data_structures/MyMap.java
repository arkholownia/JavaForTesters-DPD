package d_data_structures;

import java.util.Map;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args) {
        Map<String, String> mojaMapa = new TreeMap<>();
        mojaMapa.put("browser","chrome");
        mojaMapa.put("headless","false");
        mojaMapa.put("res_width","1920");
        mojaMapa.put("res_height","1080");

        if (mojaMapa.containsKey("browser")){
            System.out.println(mojaMapa.get("browser"));
            mojaMapa.remove("headless");
            System.out.println(mojaMapa.get("headless"));
        }
    }




}
