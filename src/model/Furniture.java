package model;

import enums.KindOfProduct;

public class Furniture extends Product {
    private String nameManufacturer;

    public Furniture(Integer stock, String name, Double price, KindOfProduct kindOfProduct) {
        super(stock, name, price, kindOfProduct);
    }

    @Override
    public String toString() {
        return "TechProduct{" +
                "nameManufacturer='" + nameManufacturer + '\'' +
                "} " + super.toString();
    }
}
