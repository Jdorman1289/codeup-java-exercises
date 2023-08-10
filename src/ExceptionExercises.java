public class ExceptionExercises {

    public static int divideNums(int num1, int num2) throws Exception {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Cannot divide be 0!");
        }

    }

    public static void delayedHello(int miliDelay) throws InterruptedException {
        Thread.sleep(miliDelay);
        System.out.println("Hello, World!");
    }

    public static void TypeWriter() {
        String text = "Hello, World!";
        for (char letter : text.toCharArray()) {
            try {
                Thread.sleep(250);
                System.out.print(letter);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }


    public static void main(String[] args) {

//        try {
//            System.out.println(divideNums(1, 3));
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            delayedHello(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        TypeWriter();


    }
}
