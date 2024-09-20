package model;


import enums.KindOfProduct;

public class Printer extends TechProduct {
    private Integer impressionsPerMinute;

    public Printer(Integer stock, String name, Double price, KindOfProduct kindOfProduct, String nameManufacturer, Integer impressionsPerMinute) {
        super(stock, name, price, kindOfProduct, nameManufacturer);
        this.impressionsPerMinute = impressionsPerMinute;
    }

    public Integer getImpressionsPerMinute() {
        return impressionsPerMinute;
    }

    public void setImpressionsPerMinute(Integer impressionsPerMinute) {
        this.impressionsPerMinute = impressionsPerMinute;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "impressionsPerMinute=" + impressionsPerMinute +
                "} " + super.toString();
    }
}
