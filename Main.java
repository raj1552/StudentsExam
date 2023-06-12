import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Main {

    public static void main(String[] args) throws IOException {
        List<Student> studentlist = new ArrayList<>();
        Random newrandom = new Random();

        Student newstudent = new Student(10, 1, 20, 0, 1, 1);
        studentlist.add(newstudent);

        Student newstudent2 = new Student(10, 2, 19, 0, 2, 2);
        studentlist.add(newstudent2);
        Student newstudent3 = new Student(10, 1, 20, 0, 3, 3);
        studentlist.add(newstudent3);
        Student newstudent4 = new Student(10, 1, 19, 0, 4, 4);
        studentlist.add(newstudent4);
        Student newstudent5 = new Student(10, 2, 20, 0, 5, 5);
        studentlist.add(newstudent5);
        Student newstudent6 = new Student(10, 1, 18, 0, 6, 6);
        studentlist.add(newstudent6);
        Student newstudent7 = new Student(10, 1, 19, 0, 7, 7);
        studentlist.add(newstudent7);
        Student newstudent8 = new Student(10, 2, 20, 0, 8, 8);
        studentlist.add(newstudent8);
        Student newstudent9 = new Student(10, 1, 19, 0, 9, 9);
        studentlist.add(newstudent9);
        Student newstudent10 = new Student(10, 2, 18, 0, 10, 10);
        studentlist.add(newstudent10);

        Classroom classroom = new Classroom("classA", studentlist, "Gan pattey budo");
        System.out.println("Inital marks of the student");
        System.out.println(classroom);

        for (int exam = 1; exam <= 10; exam++) {

            if (exam % 10 == 0) {
                PrintWriter finalresult = new PrintWriter("FinalResult.xlsx");
                finalresult.println("Name \tRoll.no\tResult\tMarks");
                for (Student student : studentlist) {
                    System.out.println(student.toString());
                    if (student.getmarks() > 50) {
                        finalresult.println(student.getname() + "\t" +student.getrollno() + "\tpassed"
                                        + "\t" + student.getmarks());

                    } else {
                        finalresult.println(student.getname() + "\t" + student.getrollno() +"\tfailed"
                                        + "\t" + student.getmarks());
                    }
                    student.resetMarks();
                }
                finalresult.close();
                continue;

            }
            PrintWriter ExamMarks = new PrintWriter("Exam" + exam + ".xlsx");
            ExamMarks.println("Name\tRoll.no\tMarks");
            for (Student student : studentlist) {
                Marks examMarks = new Marks(0);
                int studentMarks = newrandom.nextInt(10) + 1;
                examMarks.addexamMarks(studentMarks);
                student.addMarks(studentMarks);
                ExamMarks.println(student.getname() + "\t" +student.getrollno() + "\t" + examMarks.getexamMarks());

            }
            ExamMarks.close();
        }

    }

}
