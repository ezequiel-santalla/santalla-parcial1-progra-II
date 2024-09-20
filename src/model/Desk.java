package model;

import enums.KindOfProduct;

public class Desk extends Furniture {
    private Double height;
    private Double width;

    public Desk(Integer stock, String name, Double price, KindOfProduct kindOfProduct, Double height, Double width) {
        super(stock, name, price, kindOfProduct);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "height=" + height +
                ", width=" + width +
                "} " + super.toString();
    }
}
