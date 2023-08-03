import java.util.Scanner;

public class MethodsExercises {

    public static double addThem(double num1, double num2) {
        return num1 + num2;
    }

    public static int addThem(int num1, int num2) {
        return num1 + num2;
    }

    public static double minusThem(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplyThem(double num1, double num2) {
        return num1 * num2;
    }

    public static double divideThem(double num1, double num2) {
        return num1 / num2;
    }

    public static int getInteger(int num) {
        int answer = 0;
        if (num >= 1 && num <= 10) {
            answer = num;
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 10: ");
            int userNum = sc.nextInt();
            getInteger(userNum);
        }
        
        return answer;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");

        int userNum = sc.nextInt();

        System.out.println(getInteger(userNum));


    }
}
