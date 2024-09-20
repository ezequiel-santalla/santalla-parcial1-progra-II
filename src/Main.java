import enums.KindOfProduct;
import model.*;
import service.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();

        Product chair = new Chair(10, "Gaming Chair", 15000.0, KindOfProduct.FORNITURE, true);
        Product desk = new Desk(12, "Oak Desk", 18000.0, KindOfProduct.FORNITURE, 1.05, 2.3);
        Product notebook = new Notebook(10, "Notebook Lenovo", 26000.0, KindOfProduct.TECH_PRODUCT, "Iturria", 256);
        Product printer = new Printer(10, "Printer HP", 15000.0, KindOfProduct.TECH_PRODUCT, "Printers SA", 25);

        productService.addProductToTheList(chair);
        productService.addProductToTheList(desk);
        productService.addProductToTheList(notebook);
        productService.addProductToTheList(printer);

        System.out.println("Product list showing its instance of...");
        System.out.println();
        productService.showProductList();
        System.out.println();

        System.out.println("Product list with normal prices");
        System.out.println();
        productService.showList();

        System.out.println();
        System.out.println("Product list with updated prices");
        System.out.println();
        productService.updatePrices();
        productService.showList();

        System.out.println();
        System.out.println("Chair price before the discount: " + chair.getPrice());
        chair.setPrice(productService.applyDiscount(chair, 0.5));
        System.out.println("Chair price after the discount: " + chair.getPrice());
        System.out.println();

        System.out.println("Printer price before the discount: " + printer.getPrice());
        printer.setPrice(productService.applyDiscount(printer, 0.3));
        System.out.println("Printer price after the discount: " + printer.getPrice());
    }
}