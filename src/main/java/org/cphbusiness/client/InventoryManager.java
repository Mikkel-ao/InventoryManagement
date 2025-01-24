package org.cphbusiness.client;
import org.cphbusiness.components.Part;

import java.util.ArrayList;

// TODO: How should this class interact with the program? What about util mapper class?
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

    public void checkInventory() {
        for (Part part : parts) {
            System.out.println(part.getName() + "\n Quantity: " + part.getQuantity());
        }
    }
}
