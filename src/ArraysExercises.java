import java.util.Arrays;

public class ArraysExercises {

    public static String[] addPerson(String[] ogArray, String newPerson) {
        String[] newArray = Arrays.copyOf(ogArray, ogArray.length + 1);
        newArray[newArray.length - 1] = newPerson;
        return newArray;
    }


    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        String[] people = new String[3];
        Person jesse = new Person("Jesse");
        Person john = new Person("John");
        Person jake = new Person("Jake");

        people[0] = john.getName();
        people[1] = jesse.getName();
        people[2] = jake.getName();

        System.out.println(Arrays.toString(people));

        people = addPerson(people, "Bobby");

        System.out.println(Arrays.toString(people));


    }
}
