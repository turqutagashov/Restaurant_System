package com.company;

public class MenuItem {

    private String name;
    private String productCode;
    private double price;
    private int quantity;

    public MenuItem(String name, double price, String productCode){
        this.name = name;
        this.price = price;
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        price = Math.floor(price * 100) / 100;
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void information(){
        System.out.printf("PRODUCT CODE: %s\n", getProductCode());
        System.out.printf("NAME: %s\n", getName());
        System.out.printf("PRICE: $%f\n", getPrice());
    }
}
