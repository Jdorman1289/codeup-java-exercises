import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] ogArray, Person newPerson) {
        Person[] newArray = Arrays.copyOf(ogArray, ogArray.length + 1);
        newArray[newArray.length - 1] = newPerson;
        return newArray;
    }


    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person[] people = new Person[3];
        Person jesse = new Person("Jesse");
        Person john = new Person("John");
        Person jake = new Person("Jake");

        people[0] = john;
        people[1] = jesse;
        people[2] = jake;

        for (Person person : people) {
            System.out.println(person.getName());
        }

        people = addPerson(people, new Person("Bobby"));

        for (Person person : people) {
            System.out.println(person.getName());
        }


    }
}
