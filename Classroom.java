import java.util.List;

public class Classroom {

    private String Classroom;
    private List<student> students;

    public Classroom(String Classroom,List<student> students) {
        this.Classroom = Classroom;
        this.students=students;

    }

    public String getClassroom() {
        return Classroom;
    }

  public List<student> getstudents(){
    return students;
  }

  @Override
  public String toString(){
      return "classroom: "+Classroom  +"\nstudent: "+students+"\n";
  }
}
