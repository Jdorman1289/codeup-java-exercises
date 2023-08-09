import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Map<String, Student> students = new HashMap<>();


        Student alice = new Student("Alice");
        alice.addGrade(90);
        alice.addGrade(85);
        alice.addGrade(88);
        students.put("aliceGH", alice);

        Student bob = new Student("Bob");
        bob.addGrade(78);
        bob.addGrade(82);
        bob.addGrade(95);
        students.put("bobOnGitHub", bob);

        Student charlie = new Student("Charlie");
        charlie.addGrade(70);
        charlie.addGrade(92);
        charlie.addGrade(80);
        students.put("charlie_dev", charlie);

        Student dave = new Student("Dave");
        dave.addGrade(88);
        dave.addGrade(76);
        dave.addGrade(90);
        students.put("daveMaster", dave);


        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("Welcome!");
            System.out.printf("Here are the GitHub usernames of our students:%n%n");


            for (String username : students.keySet()) {
                System.out.print(" | " + username + " | ");
            }

            System.out.printf("%n%nWhich student would you like to see more information about?%n");
            String input = scanner.nextLine();

            if (students.containsKey(input)) {
                Student selectedStudent = students.get(input);
                System.out.println("Name: " + selectedStudent.getName() + " - GitHub Username: " + input);
                System.out.println("Current Grades: " + selectedStudent.getGrades());
                System.out.println("Grade Average: " + selectedStudent.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + input);
            }

            System.out.println("Would you like to see another student? (yes/no)");
            String response = scanner.nextLine();
            keepGoing = response.equalsIgnoreCase("yes");
        }

        System.out.println("Goodbye!");
    }
}

