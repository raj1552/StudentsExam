

public class Marks {
    private int examMarks;

    public Marks(int examMarks){
        this.examMarks=examMarks;

    }

    public int getexamMarks(){
        return examMarks;
    }
    public void addexamMarks(int examMarks){
        this.examMarks=this.examMarks+examMarks;

    }

    @Override

    public String toString(){
        return ""+examMarks;
    }
}
