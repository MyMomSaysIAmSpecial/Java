import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Book fairytale = new Book("Harry Potter and the Philosopher's Stone", 1997);

        System.out.println("First book is: " + fairytale.getName());

        Book secondPart = new Book("Harry Potter and the Chamber of Secrets", 1997);

        /* 1997 year is wrong, second part was written in 1998, so we set right one here */
        secondPart.setYear(1998);

        System.out.println("Second book is: " + secondPart.getName() + " and was written in " + secondPart.getYear());
    }
}
