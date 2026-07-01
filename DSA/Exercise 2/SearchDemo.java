import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    // Linear Search
    public static SearchProduct linearSearch(SearchProduct[] products, int id) {

        for (SearchProduct p : products) {
            if (p.productId == id) {
                return p;
            }
        }

        return null;
    }

    // Binary Search
    public static SearchProduct binarySearch(SearchProduct[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == id) {
                return products[mid];
            }

            if (products[mid].productId < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        SearchProduct[] products = {

                new SearchProduct(105, "Laptop", "Electronics"),
                new SearchProduct(101, "Mouse", "Electronics"),
                new SearchProduct(104, "Shoes", "Fashion"),
                new SearchProduct(102, "Book", "Education"),
                new SearchProduct(103, "Watch", "Accessories")

        };

        // Linear Search
        System.out.println("Linear Search:");

        SearchProduct result = linearSearch(products, 104);

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Product Not Found");

        // Sort array before Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        // Binary Search
        System.out.println("\nBinary Search:");

        result = binarySearch(products, 104);

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Product Not Found");
    }
}