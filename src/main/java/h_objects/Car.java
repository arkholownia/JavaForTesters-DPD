package h_objects;

public class Car  {
    private int door;
    private double horsePower;

    private String color;

    public Car(){

    }

    public Car(int i, double v) {
        this.door = i;
        this.horsePower = v;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {

        if (horsePower <= 0){
            System.out.println("nie pojedzie..");
        } else {
            this.horsePower = horsePower;
        }

    }
}
