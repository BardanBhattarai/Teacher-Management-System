

/**
 * Write a description of class Lecturer here.
 *
 * @author (Bardan Bhattarai)
 * @version (a version number or a date)
 */

// Class Lecturer inherits from parent class Teacher
public class Lecturer extends Teacher 
{
    // Attributes of Lecturer class which also contains attributes from parent class
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    
    
    // constructor for Lecturer class which contains various attributes inside it's parameters
    public Lecturer(int teacherID, String teacherName, String address, String workingType, String employmentStatus, String department, 
    int yearsOfExperience, int workingHours)
    {
        
        // 'super' A reserved keyword to call the attributes/method from the parent class
        super(teacherID, teacherName, address, workingType, employmentStatus);
        super.setWorkingHours(workingHours);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0; 
        this.hasGraded=false;
    }
    
    // accessor method for department whose data type is String
    public String getDepartment()
    {
        return department;
    }
    // accessor method for yearsOfExperience whose data type is integer
    public int getYearsOfExperience()
    {
        return yearsOfExperience;
    }
    // accessor method for gradedScore whose data type is integer
    public int getGradedScore()
    {
        return gradedScore;
    }
    // accessor method for hasGraded whose data type is boolean
    public boolean getHasGraded()
    {
        return hasGraded;
    }
    // mutator method for gradedScore which contains gradedScore inside it's parameter 
    public void setGradedScore(int gradedScore)
    {
        this.gradedScore = gradedScore;
    }
    
    // A method to grade the assignment which accepts gradedScore, department & yearsOfExperience in it's parameters
    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience)
    { 
        if(yearsOfExperience >= 5 && department.equals(this.department))
        {
            if(gradedScore > 70)
            {
                System.out.println("The student has got A grade.");
            }
            else if(gradedScore > 60)
            {
                System.out.println("The student has got B grade.");
            }
            else if(gradedScore > 50)
            {
                System.out.println("The student has got C grade.");
            }
            else if(gradedScore > 40)
            {
                System.out.println("The student has got D grade.");
            }
            else
            {
                System.out.println("The student has got E grade.");
            }
            hasGraded = true;
            this.gradedScore = gradedScore;
            
        }
        else
        {
            System.out.println("The lecturer has'nt graded the student yet.");
        }
    }
        // display method to show the attributes of Lecturer class
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Department: "+ department);
        System.out.println("Years of Experience: "+yearsOfExperience);
       
        if(hasGraded)
        {
            System.out.println("Graded Score: "+gradedScore);
        }
        else
        {
            System.out.println("Grades hasn't been given yet");
        }
    }
}


    
    
    
