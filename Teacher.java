
/**
 * Write a description of class Teacher here.
 *
 * @author (Bardan Bhattarai)
 * @version (a version number or a date)
 */

// A class named Teacher
public class Teacher  
{
    // Attributes of teacher and following encapsulation
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int teacherID;
    private int workingHours;
    
    // constructor of teacher class
    public Teacher(int teacherID, String teacherName, String address, String workingType, String employmentStatus)
    {
        this.teacherID = teacherID;               
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }
    
    // mutator method for workingHours
    public void setWorkingHours(int workingHours)
    {
        this.workingHours = workingHours;
    }
    
    // accessor method for teacherID whose data type is integer
    public int getTeacherID()
    {
        return teacherID;
    }
    // accessor method for teacherName whose data type is String
    public String getTeacherName()
    {
        return teacherName;
    }
    // accessor method for address whose data type is String
    public String getAddress()
    {
        return address;
    }
    // accessor method for workingType whose data type is String
    public String getWorkingType()
    {
        return workingType;
    }
    // accessor method for employmentStatus whose data type is String
    public String getEmploymentStatus()
    {
        return employmentStatus;
    }
    // accessor method for workingHours whose data type is int
    public int getWorkingHours()
    {
        return workingHours;
    }
    
    // display method to show the attributes of Teacher class
    public void displayInfo()
    {
         System.out.println("Teacher ID: " + teacherID);
         System.out.println("Teacher Name: " + teacherName);
         System.out.println("Address: "+ address);
         System.out.println("Working Type: " + workingType);
         System.out.println("Employment Status: " + employmentStatus);
         
         // Using if else statement to verify whether working hour is assigned or not
         if(workingHours == 0)
         {
            System.out.println("Working Hour isn't assigned");
         }
         else
         {
             System.out.println("Working Hour is : "+ workingHours);
         }
         
    }
    
}

