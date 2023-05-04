package h_objects;

public class Paint extends Rectangle implements IPriceable{
// 3.1. Utwórz publiczną klasę Paint, która dziedziczy po Rectangle
// 6.2. Zmodyfikuj klasę Paint, aby zaimplementować interfejs IPriceable

    public Paint( int w,  int s) {
        wysokosc = w;
        szerokosc = s;
        System.out.println("konstruktor z parametrami");
    }
    public Paint(){
        System.out.println("konstruktor domyslny");
    }

    @Override
    public int getPrice() {
        return getArea()*400;
    }

    // 6.3. Skomentuj tymczasowo zapisaną metodę getPrice w klasie Paint i zobacz, co się stanie
//    public int getPrice(){
//        //3.2. Utwórz w nim metodę getPrice() zwracającą cenę (powierzchnia * 400 EURO/m2)
//        System.out.println("getPrice: ");
//        return getArea() * 400;
//
//    }
}
