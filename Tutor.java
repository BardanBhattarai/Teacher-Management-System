

/**
 * Write a description of class Tutor here.
 *
 * @author (Bardan Bhattarai)
 * @version (a version number or a date)
 */

// class Tutor inherits from parent class Teacher
public class Tutor extends Teacher
{
    // attributes of tutor class
    private double salary;
    private String specialization;
    private String academicQualification;
    private int performanceIndex;
    private boolean isCertified;
    
    
    // contructor of Tutor class which accepts values in it's parameters
    public Tutor(int teacherID,String teacherName,String address,String workingType,String employmentStatus,int workingHours,double salary,
        String specialization,String academicQualification,int performanceIndex)
    { 
        // 'super' A reserved keyword to call attributes/methods from parent class
        super(teacherID,teacherName,address,workingType,employmentStatus);
        super.setWorkingHours(workingHours);
        
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualification = academicQualification;
        this.performanceIndex = performanceIndex;
    }
    // accessor method for salary whose data type is double
    public double getSalary()
    {
        return salary;
    }
    // accessor method for specialization whose data type is String
    public String getSpecilization()
    {
        return specialization;
    }
    // accessor method for academicQualification whose data type is String
    public String getAcademicQualification()
    {
        return academicQualification;
    }
    // accessor method for performanceIndex whose data type is integer
    public int getPerformanceIndex()
    {
        return performanceIndex;
    }
    // accessor method for isCertified whose data type is boolean
    public boolean getIsCertified()
    {
        return isCertified;
    }
    
    // Setter method for salary 
    public void setSalary(double newSalary,int newPerformanceIndex)
    {
        if (!isCertified) 
        {
        if (newPerformanceIndex > 5 && getWorkingHours() > 20) 
        {
        double appraisalPercentage;
        if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) 
        {
            appraisalPercentage = 0.05;
        } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) 
        {
            appraisalPercentage = 0.10;
        } else 
        {
            appraisalPercentage = 0.20;
        }
        this.salary = newSalary + (appraisalPercentage * newSalary);
        this.isCertified = true;
        this.performanceIndex = newPerformanceIndex;
        } 
        else 
        {
        removeTutor();
        System.out.println("Salary can't be given.");
        System.out.println("Performance Index must be more than 5 & working hours more than 20hrs");
        }
      }
    }
    // a method to remove the tutor
    public void removeTutor()
    {
        this.salary=0;
        this.specialization="";
        this.academicQualification="";
        this.performanceIndex=0;
    }
    
    // display method to show the attributes of Tutor 
    public void displayInfo()
    {
         
        if(!isCertified)
        {
            super.displayInfo();
        }
        else
        {
            super.displayInfo();
            System.out.println("Salary: " +salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualification: " + academicQualification);
            System.out.println("Performance Index: " + performanceIndex);
        }
    }
}