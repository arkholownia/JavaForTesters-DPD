package h_objects;

public class App {
    public static void main(String[] args) {
        Paint p1 = new Paint(); //utworz obiekt klasy Paint
        p1.wysokosc = 2; //ustaw jego szerokosc i wysokosc
        p1.szerokosc = 2;
        System.out.println("Zadanie 4.3: "+ p1.getArea()); // wyswietl jego cene


        Paint p2 = new Paint(3,3);
        System.out.println("Zadanie 5 po porawieniu 4.: "+ p2.getArea());
//        System.out.println("Zadanie 5 <- 4: : "+p2.getPrice());


        // 7.1. Utwórz instancję klasy Paint
        Paint paint = new Paint(5,5);
        System.out.println("paint: "+paint.getPrice());
        // 7.2. Utwórz instancję interfejsu IPriceable
        IPriceable iPriceable = new IPriceable() {
            @Override
            public int getPrice() {

                return paint.getPrice();

            }
        };

        System.out.println("iPriceable: "+iPriceable.getPrice());
        }

    }

