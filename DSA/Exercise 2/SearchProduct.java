public class SearchProduct {

    int productId;
    String productName;
    String category;

    public SearchProduct(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " " + productName + " " + category;
    }
}