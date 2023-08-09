public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student("Alice");
        student1.addGrade(90);
        student1.addGrade(85);
        student1.addGrade(88);


        Student student2 = new Student("Bob");
        student2.addGrade(78);
        student2.addGrade(82);
        student2.addGrade(95);


        System.out.println(student1.getName() + "'s Grade Average: " + student1.getGradeAverage());
        System.out.println(student2.getName() + "'s Grade Average: " + student2.getGradeAverage());

    }
}
