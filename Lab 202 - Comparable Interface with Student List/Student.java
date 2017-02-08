/**
 * Student class
 * 
 * @Kara Herson 
 * @11/9/16 
 * @2/2/17
 */
public class Student implements Comparable<Student>
{
    private String firstName = "";
    private String middleName = "";
    private String lastName = "";
    private int stuNumber;
    private double gpa;

    public Student(String name, int number, double GPA)
    {
        parseUserInput(name);
        stuNumber = number;
        gpa = GPA;
    }
    
    public String getStudentFullName()
    {
        return lastName + ", " + firstName + " " + middleName;
    }
    
    public String getStudentLastName()
    {
        return lastName;
    }
    
    public int getStudentNumber()
    {
        return stuNumber;
    }
    
    /* returns the student ID as a string*/
    public String getStudentNumberString()
    {
        String r = stuNumber + ">";
        return r.substring(0, r.indexOf(">"));
    }
    
    public double getStudentGPA()
    {
        return gpa;
    }
    
    public void setStudentFullName (String name)
    {
         parseUserInput(name);
    }
    
    public void setStudentFirstName(String name)
    {
        firstName = name;
    }
    
    public void setStudentMiddleName(String name)
    {
        middleName = name;
    }
    
    public void setStudentLastName(String name)
    {
        lastName = name;
    }
    
    public void setStudentNumber (int number)
    {
        stuNumber = number;
    }
    
    public void setStudentGPA(double GPA)
    {
        gpa = GPA;
    }
    
    public void parseUserInput(String str)
    {
        if (str.indexOf(",") > -1)
        {
            lastName = str.substring(0, str.indexOf(","));
            if (str.indexOf(" ", str.indexOf(",") + 2) > -1)//checks for middle name
            {
                firstName = str.substring(str.indexOf(",") +2, str.indexOf(" ", str.indexOf(",") +2));
                middleName = str.substring(str.indexOf(" ", str.indexOf(",") + 2));
            } else {
                firstName = str.substring(str.indexOf(",")+1);
            }
        } else {
            firstName = str.substring(0, str.indexOf (" "));
            if (str.indexOf(" ", str.indexOf(" ") +1) > -1) // checks for middle name
            {
                int indexOfSecondSpace = str.indexOf(" ", str.indexOf (" ") +1) ; //finds the index of the space after the middle name
                middleName = str.substring (str.indexOf(" ") + 1, indexOfSecondSpace);
                lastName = str.substring (indexOfSecondSpace +1);
            } else{
                lastName = str.substring(str.indexOf(" ") +1);
            }
        }
    }
    
    public int compareTo(Student s)
    {
        if(this.getStudentNumber() > s.getStudentNumber())
        {
            return 1;
        }else if(this.getStudentNumber() < s.getStudentNumber())
        {
            return -1;
        }
        return 0;
    }
}
