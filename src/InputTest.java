import util.Input;

public class InputTest {


    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter a string: ");
        System.out.println("You entered: " + input.getString());

        System.out.println("Enter y or yes (case doesn't matter): ");
        System.out.println("You entered: " + (input.yesNo() ? "yes" : "no"));

        System.out.println("You entered: " + input.getInt(1, 10));

        System.out.println("You entered: " + input.getInt());

        System.out.println("You entered: " + input.getDouble(1.0, 10.0));

        System.out.println("You entered: " + input.getDouble());
    }
}