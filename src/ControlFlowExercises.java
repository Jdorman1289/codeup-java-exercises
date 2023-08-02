import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        for (int i = 5; i <= 15; i += 1) {
//            System.out.print(i);
//        }

//        int i = 2;
//        do {
//            System.out.println(i);
//            i += 2;
//        }while(i <= 100);

//        long l = 100;
//        do {
//            System.out.println(l);
//            l -= 5;
//        }while(l >= -10);

//        long l = 2;
//        do {
//            System.out.println(l);
//            l = l * l;
//        }while(l < 100000);

//        for(int i = 0; i <= 100; i += 1 ) {
//            if(i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else System.out.println(i);
//        }

        Scanner scanner = new Scanner(System.in);
        String continueOption;

        do {
            System.out.print("What number would you like to go up to? ");
            int num = scanner.nextInt();

            System.out.println("\nHere is your table!\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for(int i = 1; i <= num; i++) {
                System.out.printf("%-7d| %-8d| %-5d%n", i, i*i, i*i*i);
            }

            System.out.print("\nDo you want to continue? (yes/no): ");
            continueOption = scanner.next();

        } while (continueOption.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
