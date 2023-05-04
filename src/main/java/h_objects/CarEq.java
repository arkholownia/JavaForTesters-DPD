package h_objects;

public class CarEq {


    public static void main(String[] args) {
        Car car1 = new Car(10, 20.0);
        Car car2 = new Car(10, 20.0);

        Car car3 = new Car();
        car3.setHorsePower(-1);

        System.out.println("so: "+car3.getHorsePower());

//        if (car1.equals(car2)){
//            System.out.println("sa rowne");
//
//        } else {
//            System.out.println("nie sa rowne");
//        }
    }

}
