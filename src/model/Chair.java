package model;

import enums.KindOfProduct;

public class Chair extends Furniture {
    private Boolean hasWails;

    public Chair(Integer stock, String name, Double price, KindOfProduct kindOfProduct, Boolean hasWails) {
        super(stock, name, price, kindOfProduct);
        this.hasWails = hasWails;
    }

    public Boolean getHasWails() {
        return hasWails;
    }

    public void setHasWails(Boolean hasWails) {
        this.hasWails = hasWails;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "hasWails=" + hasWails +
                "} " + super.toString();
    }
}
