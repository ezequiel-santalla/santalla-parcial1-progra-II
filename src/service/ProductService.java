package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> productList = new ArrayList<>();

    public void addProductToTheList(Product p) {
        productList.add(p);
    }

    public void showProductList() {
        for (Product p : productList) {
            if (p instanceof Chair) {
                System.out.println("The product " + p + " is an instance of: " + p.getClass().getSimpleName());
            }

            if (p instanceof Desk) {
                System.out.println("The product " + p + " is an instance of: " + p.getClass().getSimpleName());
            }

            if (p instanceof Notebook) {
                System.out.println("The product " + p + " is an instance of: " + p.getClass().getSimpleName());
            }

            if (p instanceof Printer) {
                System.out.println("The product " + p + " is an instance of: " + p.getClass().getSimpleName());
            }
        }
    }

    public Double applyDiscount(Product p, Double discount) {
        Double newPrice = 0.0;

        if (p instanceof Printer || p instanceof Chair) {
            if (discount >= 0 && discount <= 1) {
                newPrice = p.getPrice() * (1 - discount);
            } else {
                System.out.println("Invalid Discount");
            }
        }
        return newPrice;
    }

    public void updatePrices() {
        for (Product p : productList) {
            if (p instanceof Chair) {
                p.setPrice(p.getPrice() * (1 - 0.05));
            }

            if (p instanceof Desk) {
                p.setPrice(p.getPrice() * (1 - 0.1));
            }

            if (p instanceof Notebook) {
                p.setPrice(p.getPrice() * (1 - 0.2));
            }

            if (p instanceof Printer) {
                p.setPrice(p.getPrice() * (1 - 0.15));
            }
        }
    }

    public void showList() {
        for (Product p : productList) {
            System.out.println("The product: " + p.getName() + " costs $" + p.getPrice());
        }
    }
}
