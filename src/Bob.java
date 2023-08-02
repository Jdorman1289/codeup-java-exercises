import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Talk to Bob:");

        String contextCheck = "";
        contextCheck = sc.nextLine();

        if(contextCheck.isEmpty()) {
            System.out.println("\nBob: Fine. Be that way!");
        } else {
            char mark = contextCheck.charAt(contextCheck.length()-1);

            if (mark == '!') {
                System.out.println("\nBob: Whoa, chill out!");
            } else if (mark == '?') {
                System.out.println("Bob: Sure");
            } else {
                System.out.println("Bob: Whatever.");
            }
        }

    }
}
