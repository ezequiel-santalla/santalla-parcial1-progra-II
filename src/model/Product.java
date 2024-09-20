package model;

import enums.KindOfProduct;

import java.util.UUID;

public abstract class Product {
    private UUID ID;
    private Integer stock;
    private String name;
    private Double price;
    private KindOfProduct kindOfProduct;

    public Product(Integer stock, String name, Double price, KindOfProduct kindOfProduct) {
        this.ID = UUID.randomUUID();
        this.stock = stock;
        this.name = name;
        this.price = price;
        this.kindOfProduct = kindOfProduct;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public KindOfProduct getKindOfProduct() {
        return kindOfProduct;
    }

    public void setKindOfProduct(KindOfProduct kindOfProduct) {
        this.kindOfProduct = kindOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", stock=" + stock +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
