import org.omg.CORBA.WStringSeqHelper;

public class Student {
    private int studentId;
    private String Name;
    private float qualifyingExamMarks;
    private char residentialStatus;
    private int yearOfEngg;
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int id)
    {
        this.studentId = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name)
    {
        this.Name = name;
    }
    public float getQualifyingExamMarks() {
        return qualifyingExamMarks;
    }
    public void setQualifyingExamMarks(float marks)
    {
        this.qualifyingExamMarks = marks;
    }
    public char getResidentialStatus() {
        return residentialStatus;
    }
    public void setResidentialStatus(char status)
    {
        this.residentialStatus = status;
    }
    public int getYearOfEngg() {
        return yearOfEngg;
    }
    public void setYearOfEngg(int year)
    {
        this.yearOfEngg = year;
    }
}

 class StudentTester
{
    public static void main(String[] args)
    {
        Student std = new Student();
        std.setName("Jacob");
        std.setStudentId(1001);
        std.setQualifyingExamMarks(80);
        std.setResidentialStatus('H');
        std.setYearOfEngg(3);

        System.out.println("Student Name :" + std.getName());
        System.out.println("Student ID :" + std.getStudentId());
        System.out.println  ("Qualifying Marks :" + std.getQualifyingExamMarks());
        System.out.println("Year Of  Engineering :" + std.getYearOfEngg());

        if(std.getResidentialStatus() == 'H')
        {
            System.out.println("Residential Status : Hostellers");
        }else {
            System.out.println("Residential Status : Day Scholors");
        }

    }
}
