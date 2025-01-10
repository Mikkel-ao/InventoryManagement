package org.cphbusiness.components;

public abstract class Part {
    private String name;
    private int quantity;


    public Part(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
