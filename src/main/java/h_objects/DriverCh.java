package h_objects;

public class DriverCh implements WebDriver {
    @Override
    public void get() {
        System.out.println("Chrome. Get");
    }

    @Override
    public void close() {
        System.out.println("Chrome. Close");
    }
}
