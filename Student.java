
package assignment2_2;
public class Student 
{
    public String StudentName;
    private int studentID;
    public double StudentGPA;
    Subject subject;
    address Address;

    public Student(String StudentName, int studentID, double StudentGPA, Subject subject, address Address) {
        this.StudentName = StudentName;
        this.studentID = studentID;
        this.StudentGPA = StudentGPA;
        this.subject = subject;
        this.Address = Address;
    }
    
    public void display()
    {
        System.out.println("Student name : "+StudentName+"\nID : "+studentID+"\nGPA : "+StudentGPA);
        System.out.println("____________________________________________________________");
        System.out.println("The Subject of Student : "+subject.Subjectname+"\nID of Suject : "+subject.SubjectID+"\nThe hours : "+subject.Subjecthours);
        System.out.println("The Address of Student : "+Address.streetNo+" :  "+Address.city+" : "+Address.country);
    }
}
