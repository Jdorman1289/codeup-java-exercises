package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String input = this.scanner.nextLine().toLowerCase();
        return (input.equals("y") || input.equals("yes"));
    }

    public int getInt(int min, int max) {
        int input;
        do {
            System.out.println("Enter an integer between " + min + " and " + max + ": ");
            while (!this.scanner.hasNextInt()) {
                System.out.println("That's not a valid integer!");
                this.scanner.next();
            }
            input = this.scanner.nextInt();
        } while (input < min || input > max);
        return input;
    }

    public int getInt() {
        System.out.println("Enter an integer: ");
        while (!this.scanner.hasNextInt()) {
            System.out.println("That's not a valid integer!");
            this.scanner.next();
        }
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.println("Enter a decimal number between " + min + " and " + max + ": ");
            while (!this.scanner.hasNextDouble()) {
                System.out.println("That's not a valid decimal number!");
                this.scanner.next();
            }
            input = this.scanner.nextDouble();
        } while (input < min || input > max);
        return input;
    }

    public double getDouble() {
        System.out.println("Enter a decimal number: ");
        while (!this.scanner.hasNextDouble()) {
            System.out.println("That's not a valid decimal number!");
            this.scanner.next();
        }
        return this.scanner.nextDouble();
    }

}