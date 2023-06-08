public class student {
    private int Class;
    private String gender;
    private int age;
    private int marks;
    private int rollno;

    public student(int Class, String gender, int age, int marks, int rollno) {
        this.Class = Class;
        this.gender = gender;
        this.age = age;
        this.marks = marks;
        this.rollno = rollno;

    }

    public int getclass() {
        return Class;
    }

    public String getgender() {
        return gender;
    }

    public int getage() {
        return age;
    }

    public int getmarks() {
        return marks;
    }

    public int getrollno() {
        return rollno;
    }

    @Override
    public String toString() {
        return "Class: " + Class + " " + "Roll.no: " + rollno + " " + "gender: " + gender + " " + "age: " + age + " "
                + "marks: " + marks + "\n";
    }

}
