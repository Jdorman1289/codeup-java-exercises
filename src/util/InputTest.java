package util;

public class InputTest {


    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter a string: ");
        System.out.println("You entered: " + input.getString());

        System.out.println("Enter y or yes (case doesn't matter): ");
        System.out.println("You went with: " + (input.yesNo() ? "The happy path" : "The sad path"));

        System.out.println("You entered: " + input.getInt());

        System.out.println("You entered: " + input.getInt(1, 10));

        System.out.println("You entered: " + input.getDouble());

        System.out.println("You entered: " + input.getDouble(1.0, 10.0));

    }
}