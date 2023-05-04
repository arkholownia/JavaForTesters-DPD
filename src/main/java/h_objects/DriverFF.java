package h_objects;

public class DriverFF implements WebDriver {
    @Override
    public void get() {
        System.out.println("FF. GetMethod");
    }

    @Override
    public void close() {
        System.out.println("FF. CLoseMethod");
    }
}
