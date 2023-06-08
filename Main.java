import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Main {
    private String Teacher;

    public Main(String Teacher) {
        this.Teacher = Teacher;
    }

    public static void main(String[] args) {
        String teachername = "ram prasad sapkota";
        List<student> studentlist = new ArrayList<>();
        Random newrandom = new Random();
        Main main = new Main(teachername);
        System.out.println("Teacher:" + main.Teacher);

        student newstudent1 = new student(10, "male", 19, 0, 1);
        studentlist.add(newstudent1);
        student newstudent2 = new student(10, "male", 19, 0, 2);
        studentlist.add(newstudent2);
        student newstudent3 = new student(10, "male", 19, 0, 3);
        studentlist.add(newstudent3);
        student newstudent4 = new student(10, "female", 20, 0, 4);
        studentlist.add(newstudent4);
        student newstudent5 = new student(10, "male", 17, 0, 5);
        studentlist.add(newstudent5);
        student newstudent6 = new student(10, "female", 18, 0, 6);
        studentlist.add(newstudent6);
        student newstudent7 = new student(10, "female", 19, 0, 7);
        studentlist.add(newstudent7);
        student newstudent8 = new student(10, "male", 18, 0, 8);
        studentlist.add(newstudent8);
        student newstudent9 = new student(10, "female", 19, 0, 9);
        studentlist.add(newstudent9);
        student newstudent10 = new student(10, "male", 20, 0, 10);
        studentlist.add(newstudent10);

        Classroom classroom = new Classroom("classA", studentlist);
        System.out.println("Inital marks of the student");
        System.out.println(classroom);

        for (student student : studentlist) {
            int grandtotal = 0;
            for (int exam = 1; exam <= 1000; exam++) {
                if (exam == 100 || exam == 200 || exam == 300 || exam == 400 || exam == 500 || exam == 600
                        || exam == 700 || exam == 800 || exam == 900 || exam == 1000) {
                    System.out.println("displaying exam of day" + exam);
                    int examMarks = newrandom.nextInt(100) + 1;
                    grandtotal += examMarks;
                    System.out.println("Exammarks of day" + exam + " " + examMarks);
                }
            }
            System.out.println("Roll.no" + student.getrollno() + " Grand Total Marks: " + grandtotal + "\n");
            if (grandtotal < 400) {
                System.out.println(student.getrollno() + "has failed the exam");
            } else {
                System.out.println("Rollno:" + student.getrollno() + "has passed the exam" + "\n");
            }
        }

    }
}