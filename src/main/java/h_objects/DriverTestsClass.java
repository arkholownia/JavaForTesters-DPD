package h_objects;

public class DriverTestsClass {



    public static void main(String[] args) {
        WebDriver driver = new DriverFF();
//        WebDriver driver = new DriverCh();
        driver.get();
        driver.close();

    }
}
