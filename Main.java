import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Main {
    private String Teacher;

    public Main(String Teacher) {
        this.Teacher = Teacher;
    }

    public static void main(String[] args) {
        String teachername = "ram prasad spkota";
        List<student> studentlist = new ArrayList<>();
        Random newrandom = new Random();
        Main main = new Main(teachername);
        System.out.println("Teacher:" + main.Teacher);

        for (int i = 1; i <= 10; i++) {
            int newmarks = newrandom.nextInt(100) + 1;
            int age = newrandom.nextInt(3) + 18;
            student newstudent = new student(10, "male", age, newmarks);
            studentlist.add(newstudent);
        }

        Classroom classroom = new Classroom("classA", studentlist);
        System.out.println(classroom);

        for (int exam = 1; exam <= 10; exam++) {
            int marks = 0;
            for (student student : studentlist) {
                marks += student.getmarks();
            }
            System.out.println("Exam " + exam + ": " + marks);
        }
        for (student student : studentlist) {
            int grandTotal = 0;
            for (int exam = 1; exam <= 1000; exam++) {
                if (exam == 100 || exam == 200 || exam == 300 || exam == 400 || exam == 500 || exam == 600
                        || exam == 700 || exam == 800 || exam == 900 || exam == 1000) {
                    int examMarks = newrandom.nextInt(100) + 1;
                    student.getmarks();
                    grandTotal += examMarks;
                }
            }
            System.out.println(student + " Grand Total Marks: " + grandTotal);
        }

    }
}