import java.util.HashMap;

public class InventoryManagement {

    static HashMap<Integer, Product> inventory = new HashMap<>();


    public static void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully.");
    }


    public static void updateProduct(int id, String name, int quantity, double price) {

        if (inventory.containsKey(id)) {

            Product p = inventory.get(id);

            p.setProductName(name);
            p.setQuantity(quantity);
            p.setPrice(price);

            System.out.println("Product Updated Successfully.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    // Delete Product
    public static void deleteProduct(int id) {

        if (inventory.containsKey(id)) {

            inventory.remove(id);
            System.out.println("Product Deleted Successfully.");

        } else {
            System.out.println("Product Not Found.");
        }
    }

    // Display Inventory
    public static void displayInventory() {

        System.out.println("\nInventory:");

        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        addProduct(new Product(101, "Laptop", 15, 65000));
        addProduct(new Product(102, "Mouse", 50, 500));
        addProduct(new Product(103, "Keyboard", 30, 1200));

        displayInventory();

        updateProduct(102, "Wireless Mouse", 40, 700);

        displayInventory();

        deleteProduct(103);

        displayInventory();
    }
}