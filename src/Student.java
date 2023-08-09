
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public String getName() {
        return name;
    }
    public String getGrades() {
        return grades.toString();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }


    public double getGradeAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

}
