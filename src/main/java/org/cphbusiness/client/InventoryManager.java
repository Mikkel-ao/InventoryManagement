package org.cphbusiness.client;

import org.cphbusiness.components.Part;

import java.util.ArrayList;

// TODO: Figure out how I want this interact the program. Client class that class upon mapper class methods?
public class InventoryManager {
    private ArrayList<Part> parts;

    public InventoryManager() {
        parts = new ArrayList<>();
    }

    public void addProduct(Part part) {
        parts.add(part);
    }

    public void removeProduct(Part part) {
        parts.remove(part);
    }
}
