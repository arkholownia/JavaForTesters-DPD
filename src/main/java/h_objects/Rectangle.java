package h_objects;

public class Rectangle extends Shape {
    //Utwórz publiczną klasę Rectangle, która dziedziczy po Shape

    //Utwórz w nim publiczną metodę int getArea(), która zwraca obszar (szerokość * wysokość)
    public int getArea() {
        int obszar = wysokosc*szerokosc;
        System.out.println("getArea: "+ obszar);
        return obszar;
    }

}
