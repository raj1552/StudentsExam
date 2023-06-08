public class Student {
    private int Class;
    private Gender gender;
    private int age;
    private int marks;
    private int rollno;
    private Name name;

    public Student(int Class, int gender, int age, int marks, int rollno, int name) {
        this.Class = Class;
        this.gender = Gender.fromValue(gender);
        this.age = age;
        this.marks = marks;
        this.rollno = rollno;
        this.name = Name.getName(name);

    }

    public int getclass() {
        return Class;
    }

    public Gender getgender() {
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

    public Name getname() {
        return name;
    }

    public void addMarks(int marks) {
        this.marks = this.marks + marks;
    }

    public void resetMarks() {
        this.marks = 0;
    }

    @Override
    public String toString() {
        return "Class: " + Class + " " + "Name:" + name +" "+ "Roll.no: " + rollno + " " + "gender: " + gender.toString()
                + " " + "age: " + age + " "
                + "marks: " + marks + "\n";
    }

}
