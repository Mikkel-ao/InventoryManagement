package org.cphbusiness.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner = new Scanner(System.in);

    public void print(String text) {
        System.out.println(text);
    }

    public int promptNumeric(String text) {
        System.out.println(text);
        String input = scanner.nextLine();
        int number;

        try {
            number = Integer.parseInt(input);
        }
        catch(NumberFormatException e){
            print("Only numbers are allowed.");
            number = promptNumeric(text);
        }
        return number;
    }

    public String promptString(String text) {
        System.out.println(text);
        String input = scanner.nextLine();
        return input;
    }

    public void displayMenu(){
        List<String> options = new ArrayList<>();
        System.out.println("What would you like to do?");

        options.add("1. Display all parts");
        options.add("2. Search for a part");
        options.add("3. Add a new part");
        options.add("4. Exit");

        for(String option : options){
            System.out.println(option);
        }

        int choice = promptNumeric("Choose an option by entering a number: ");

        // TODO: Dummy souts. Revisit when methods are implemented
        switch(choice) {
            case 1:
                System.out.println("Display all parts");
                break;
            case 2:
                System.out.println("Search for a part");
                break;
            case 3:
                System.out.println("Add a new part");
                break;
                // TODO: Option to save or discard changes?
            case 4:
                System.out.println("Exiting program...");
                System.exit(0);
                break;
            default:
                System.out.println("Please enter a valid option. Pick a number from 1 to 4");

        }
    }
}
