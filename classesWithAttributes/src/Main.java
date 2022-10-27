public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","Dell",5000,2,"Siyah");
        product.set_name("Laptop");
        product.setId(12);
        product.set_price(5334);;
        product.set_stockAmount(12);
        product.set_description("Zoert");

        product.getId();
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}