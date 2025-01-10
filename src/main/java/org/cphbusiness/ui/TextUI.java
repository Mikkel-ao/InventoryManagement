package org.cphbusiness.ui;

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
}
