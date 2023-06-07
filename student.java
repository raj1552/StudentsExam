public class student {
    private int Class;
    private String gender;
    private int age;
    private int marks;

    public student(int Class, String gender, int age, int marks) {
        this.Class = Class;
        this.gender = gender;
        this.age = age;
        this.marks = marks;

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

    @Override
    public String toString() {
        return "Class:" + Class +" " + "gender:" + gender + " " + "age: " + age + " "+"marks:" + marks+"\n";
    }

}
