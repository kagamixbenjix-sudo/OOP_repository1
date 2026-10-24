public class VariableTypesPrac {

    String coursename;
    int studentcount;
    static int Totalstudent = 0;

    public VariableTypesPrac(String coursename, int studentcount) {
        this.coursename = coursename;
        this.studentcount = studentcount;
        Totalstudent = Totalstudent + studentcount;
    }
    public double Passpercentage(double passedStudents) {
        return (passedStudents / studentcount) * 100.0;
    }
}