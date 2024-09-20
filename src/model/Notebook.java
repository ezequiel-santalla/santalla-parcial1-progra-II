package model;

import enums.KindOfProduct;

public class Notebook extends TechProduct {
    private Integer memory;

    public Notebook(Integer stock, String name, Double price, KindOfProduct kindOfProduct, String nameManufacturer, Integer memory) {
        super(stock, name, price, kindOfProduct, nameManufacturer);
        this.memory = memory;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "memory=" + memory +
                "} " + super.toString();
    }
}
