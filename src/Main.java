public class Main {
    public static void main(String[] args) {
        Product product = new Product("Edam", 3.3, 120);
        System.out.println("Product value is " + product.countValue());
        product.printProduct();
    }
}
