import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagement {

    // Linear Search
    public static Book linearSearch(Book[] books, String title) {

        for (Book book : books) {

            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }

        }

        return null;
    }

    // Binary Search
    public static Book binarySearch(Book[] books, String title) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = books[mid].title.compareToIgnoreCase(title);

            if (compare == 0) {
                return books[mid];
            }

            if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return null;
    }

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Operating Systems", "Abraham Silberschatz"),
                new Book(104, "Computer Networks", "Andrew Tanenbaum"),
                new Book(105, "Database Systems", "Elmasri")

        };

        // Linear Search
        System.out.println("Linear Search:");

        Book result = linearSearch(books, "Operating Systems");

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Book Not Found");

        // Sort array before Binary Search
        Arrays.sort(books, Comparator.comparing(book -> book.title));

        // Binary Search
        System.out.println("\nBinary Search:");

        result = binarySearch(books, "Operating Systems");

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Book Not Found");
    }
}
