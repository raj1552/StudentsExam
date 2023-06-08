import java.util.List;

public class Classroom {

    private String classroom;
    private List<Student> students;
    private String teacher;

    public Classroom(String classroom,List<Student> students,String teacher) {
        this.classroom = classroom;
        this.students=students;
        this.teacher=teacher;

    }

    public String getClassroom() {
        return classroom;
    }

  public List<Student> getstudents(){
    return students;
  }
  public String getteachername(){
    return teacher;
  }

  @Override
  public String toString(){
      return "classroom: "+classroom  +"\nstudent: "+students+"\n";
  }
}
