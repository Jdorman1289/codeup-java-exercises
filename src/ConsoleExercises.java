import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);

//        System.out.print("Enter three words: ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//
//        System.out.printf("%s%n%s%n%s", firstWord, secondWord, thirdWord);
//        System.out.println("Enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Width: ");
        long widthValue = scanner.nextLong();
        System.out.print("Enter the Length: ");
        long lengthValue = scanner.nextLong();
        long area = widthValue * lengthValue;
        long para = (lengthValue * 2) + (widthValue * 2);
        System.out.printf("The Area of the room is: %s%nThe Perimeter is %s",area,para);

    }
}
