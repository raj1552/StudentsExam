public class Marks2 {
    private int examMarks2;

    public Marks2(int examMarks2){
        this.examMarks2=examMarks2;
    }

    public int getexamMarks2(){
        return examMarks2;

    }
    
    public void addexamMarks2(int examMarks2){
        this.examMarks2=this.examMarks2+examMarks2;
    }

    @Override

    public String toString(){
        return "Exam"+examMarks2;

    }
}
