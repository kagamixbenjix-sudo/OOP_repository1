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
    public double attendancecalculation(double studentattendance) {
        double Averageattendance = (studentattendance / studentcount) * 100.0;
        return Averageattendance;
    }
    public void displaystat(double passed, double studentattendance) {

        double passpercentage = Passpercentage(passed);
        double Averageattendance = attendancecalculation(studentattendance);

        System.out.println("The coursename is " + coursename);
        System.out.println("The number of students in this course is " + studentcount);
        System.out.println("The passpercentage is " + passpercentage + "%");
        System.out.println("The Average attendance is " + Averageattendance + "%");
    }

    public static void main(String[] args) {
        VariableTypesPrac course1 = new VariableTypesPrac("BIT", 60);
        VariableTypesPrac course2 = new VariableTypesPrac("BSCS", 70);
        VariableTypesPrac course3 = new VariableTypesPrac("BSSE", 30);
    }
}