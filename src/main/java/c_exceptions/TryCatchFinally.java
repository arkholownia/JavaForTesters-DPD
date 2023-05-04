package c_exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {
        String a = null;
        try {
            System.out.println(a.length());
        } catch(IllegalArgumentException ex) {
            System.out.println("Exception has been caught");
        } catch ( NullPointerException npe){
            System.out.println("NPE: string is null");
        }

        finally {
            System.out.println("This should always be printed.");
        }
    }
}
