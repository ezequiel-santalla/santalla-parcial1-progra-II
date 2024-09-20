package model;

import enums.KindOfProduct;

public class TechProduct extends Product {
    private String nameManufacturer;

    public TechProduct(Integer stock, String name, Double price, KindOfProduct kindOfProduct, String nameManufacturer) {
        super(stock, name, price, kindOfProduct);
        this.nameManufacturer = nameManufacturer;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    @Override
    public String toString() {
        return "TechProduct{" +
                "nameManufacturer='" + nameManufacturer + '\'' +
                "} " + super.toString();
    }
}
