

public class Marks1 {
    private int examMarks1;

    public Marks1(int examMarks1){
        this.examMarks1=examMarks1;

    }

    public int getexamMarks1(){
        return examMarks1;
    }
    public void addexamMarks1(int examMarks1){
        this.examMarks1=this.examMarks1+examMarks1;

    }

    @Override

    public String toString(){
        return ""+examMarks1;
    }
}
