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

    public String setName(String name){
        return this.name = name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
