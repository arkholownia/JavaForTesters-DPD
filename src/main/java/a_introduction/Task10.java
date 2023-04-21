package a_introduction;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(bookDetails("Hobbit", "Tolkien", "David Wyatt"));
    }

    public static String bookDetails(String title, String author, String publisher) {
        return title + ", autorstwa "+author+", wydany przez "+publisher;


    }
}
