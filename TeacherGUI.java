import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class TeacherGUI
{
    // Main frame of the GUI
    private JFrame frame;

    // Label for Headings
    private JLabel teacherlbl, lecturerlbl, tutorlbl;

   
    // Lecturer Lable Items
    private JLabel lecturerTeacherIDlbl, lecturerTeacherNamelbl, lecturerAddresslbl, lecturerWorkingTypelbl, lecturerEmploymentStatuslbl, lecturerWorkingHourslbl, lecturerDepartmentlbl, lecturerYearsOfExperiencelbl;

    // Lecturer TextField Items
    private JTextField lecturerTeacherIDTxt, lecturerTeacherNameTxt, lecturerAddressTxt, lecturerWorkingTypeTxt, lecturerEmploymentStatusTxt, lecturerDepartmentTxt, lecturerYearsOfExperienceTxt, lecturerWorkingHoursTxt;

    // Lecturer Button Items
    private JButton addLecturerBtn;

    // Tutor Label Items
    private JLabel tutorTeacherIDlbl, tutorTeacherNamelbl, tutorAddresslbl, tutorWorkingTypelbl, tutorWorkingHourslbl, tutorEmploymentStatuslbl, tutorSalarylbl, tutorSpecializationlbl, tutorAcademicQualificationlbl, tutorPerformanceIndexlbl;

    // Tutor Textfield Items
    private JTextField tutorTeacherIDTxt, tutorTeacherNameTxt, tutorAddressTxt, tutorWorkingTypeTxt, tutorWorkingHoursTxt, tutorEmploymentStatusTxt, tutorSalaryTxt, tutorSpecializationTxt, tutorAcademicQualificationTxt, tutorPerformanceindexTxt;

    // Tutor ButtonItems
    private JButton addTutorBtn;

    // Label and TextField Items for GradeAssignemt 
    private JLabel gradeAssignmentlbl, gradedScorelbl, departmentlbl, yearsOfExperiencelbl, gaTeacherIDlbl;
    private JTextField gradedScoreTxt, departmentTxt, yearsOfExperienceTxt, gaTeacherIDTxt;

    // Label and TextField Items for Set Salary
    private JLabel salarylbl, performanceIndexLbl, ssTeacherIDlbl, setTheSalarylbl;
    private JTextField salaryTxt, performanceIndexTxt, ssTeacherIDTxt;
    
    // Other Button Items
    private JButton gradeAssignmentBtn, setSalaryBtn, displayBtn, clearBtn, removeTutorBtn;

    // Arraylist
    ArrayList<Teacher> teachers = new ArrayList<>();
    public TeacherGUI()
    {
        // Main Frame of the GUI

        frame = new JFrame("Teacher Manangement System");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 800);

        // For the heading of the GUI

        teacherlbl = new JLabel("Teacher GUI");
        teacherlbl.setBounds(300, 20, 300, 40);
        Font font = new Font("Josefin sans", Font.BOLD, 30);
        teacherlbl.setFont(font);
        frame.add(teacherlbl);

        // Lecturer Section
        lecturerlbl = new JLabel("Lecturer");
        lecturerlbl.setBounds(70, 70, 100, 20);
        Font font1 = new Font("Josefin sans", Font.BOLD, 15);
        lecturerlbl.setFont(font1);
        frame.add(lecturerlbl);

        // Teacher ID Label for lecturer
        lecturerTeacherIDlbl = new JLabel("Teacher ID: ");
        lecturerTeacherIDlbl.setBounds(20, 95, 100, 20);
        frame.add(lecturerTeacherIDlbl);

        // Teacher ID textfield for Lecturer
        lecturerTeacherIDTxt = new JTextField();
        lecturerTeacherIDTxt.setBounds(145, 95, 140, 20);
        frame.add(lecturerTeacherIDTxt);

        // Teacher name label for lecturer
        lecturerTeacherNamelbl = new JLabel("Teacher Name: ");
        lecturerTeacherNamelbl.setBounds(20, 120, 100, 20);
        frame.add(lecturerTeacherNamelbl);

        // Teacher name textfield for Lecturer
        lecturerTeacherNameTxt = new JTextField();
        lecturerTeacherNameTxt.setBounds(145, 120, 140, 20);
        frame.add(lecturerTeacherNameTxt);

        // Address label for lecturer
        lecturerAddresslbl = new JLabel("Address: ");
        lecturerAddresslbl.setBounds(20, 145, 100, 20);
        frame.add(lecturerAddresslbl);

        // Address textfield for lecturer
        lecturerAddressTxt = new JTextField();
        lecturerAddressTxt.setBounds(145, 145, 140, 20);
        frame.add(lecturerAddressTxt);
        
        // working type label for lecturer
        lecturerWorkingTypelbl = new JLabel("Working Type: ");
        lecturerWorkingTypelbl.setBounds(20, 170, 100, 20);
        frame.add(lecturerWorkingTypelbl);

        // working type textfield for lecturer
        lecturerWorkingTypeTxt = new JTextField();
        lecturerWorkingTypeTxt.setBounds(145, 170, 140, 20);
        frame.add(lecturerWorkingTypeTxt);

        // employment status label for lecturer
        lecturerEmploymentStatuslbl = new JLabel("Employment Status: ");
        lecturerEmploymentStatuslbl.setBounds(20, 195, 140, 20);
        frame.add(lecturerEmploymentStatuslbl);

        // employment status textfield for lecturer
        lecturerEmploymentStatusTxt = new JTextField();
        lecturerEmploymentStatusTxt.setBounds(145, 195, 140, 20);
        frame.add(lecturerEmploymentStatusTxt);

        // years of experience label for lecturer
        lecturerYearsOfExperiencelbl = new JLabel("Years Of Experience: ");
        lecturerYearsOfExperiencelbl.setBounds(20, 220, 140, 20);
        frame.add(lecturerYearsOfExperiencelbl);

        // years of experience textfield for lecturer
        lecturerYearsOfExperienceTxt = new JTextField();
        lecturerYearsOfExperienceTxt.setBounds(145, 220, 140, 20);
        frame.add(lecturerYearsOfExperienceTxt);

        // Department label for lecturer
        lecturerDepartmentlbl = new JLabel("Department: ");
        lecturerDepartmentlbl.setBounds(20, 245, 100, 20);
        frame.add(lecturerDepartmentlbl);

        // Department Textfield for lecturer
        lecturerDepartmentTxt = new JTextField();
        lecturerDepartmentTxt.setBounds(145, 245, 140, 20);
        frame.add(lecturerDepartmentTxt);

        // working hours label for lecturer
        lecturerWorkingHourslbl = new JLabel("Working Hours: ");
        lecturerWorkingHourslbl.setBounds(20, 270, 140, 20);
        frame.add(lecturerWorkingHourslbl);

        // working hours textfield for lecturer
        lecturerWorkingHoursTxt = new JTextField();
        lecturerWorkingHoursTxt.setBounds(145, 270 , 140, 20);
        frame.add(lecturerWorkingHoursTxt);

        // Button for add lecturer
        addLecturerBtn = new JButton("Add Lecturer");
        addLecturerBtn.setBounds(100, 340, 140, 40);
        addLecturerBtn.setBackground(Color.lightGray);
        addLecturerBtn.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent a)
            {
                addLecturer();
            }    
        });
        frame.add(addLecturerBtn);


        // Grade Assignment Section
        gradeAssignmentlbl = new JLabel("Grade The Assignment");
        gradeAssignmentlbl.setBounds(70, 420, 250, 40);
        Font font3 = new Font("Josefin sans", Font.BOLD, 15);
        gradeAssignmentlbl.setFont(font3);
        frame.add(gradeAssignmentlbl);

        // teacher id label for grade assignment
        gaTeacherIDlbl = new JLabel("Teacher ID: ");
        gaTeacherIDlbl.setBounds(20, 470, 100, 20);
        frame.add(gaTeacherIDlbl);

        // teacher id textfield for grade assignment
        gaTeacherIDTxt = new JTextField();
        gaTeacherIDTxt.setBounds(150, 470, 140, 20);
        frame.add(gaTeacherIDTxt);

        // department label for grade assignment
        departmentlbl = new JLabel("Department: ");
        departmentlbl.setBounds(20, 495, 100, 20);
        frame.add(departmentlbl);

        // department textfield for grade assignment
        departmentTxt = new JTextField();
        departmentTxt.setBounds(150, 495, 140, 20);
        frame.add(departmentTxt);


        // years of experience label for grade assignment
        yearsOfExperiencelbl = new JLabel("Years of Experience: ");
        yearsOfExperiencelbl.setBounds(20, 520, 150, 20);
        frame.add(yearsOfExperiencelbl);

        // years of experience textfield for grade assignment
        yearsOfExperienceTxt = new JTextField();
        yearsOfExperienceTxt.setBounds(150, 520, 140, 20);
        frame.add(yearsOfExperienceTxt);

        // graded Score label for grade the assignment
        gradedScorelbl = new JLabel("Graded Score: ");
        gradedScorelbl.setBounds(20, 545, 100, 20);
        frame.add(gradedScorelbl);

        // graded Score textfield for grade the assignment
        gradedScoreTxt = new JTextField();
        gradedScoreTxt.setBounds(150, 545, 140, 20);
        frame.add(gradedScoreTxt);

        // grade the assignment button for grade assignment
        gradeAssignmentBtn = new JButton("Grade the Assignment");
        gradeAssignmentBtn.setBounds(100, 580, 200, 40);
        gradeAssignmentBtn.setBackground(Color.lightGray);
        gradeAssignmentBtn.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gradeAssignment();
            }
        });
        frame.add(gradeAssignmentBtn);


        // Tutor Section
        tutorlbl = new JLabel("Tutor");
        tutorlbl.setBounds(520, 70, 100, 20);
        tutorlbl.setFont(font1);
        frame.add(tutorlbl);

        // tutor teacher ID label
        tutorTeacherIDlbl = new JLabel("Teacher ID: ");
        tutorTeacherIDlbl.setBounds(480, 95, 100, 20);
        frame.add(tutorTeacherIDlbl);

        // tutor teacher Id textfield
        tutorTeacherIDTxt = new JTextField();
        tutorTeacherIDTxt.setBounds(620, 95, 140, 20);
        frame.add(tutorTeacherIDTxt);

        // tutor teacher name label
        tutorTeacherNamelbl = new JLabel("Teacher Name: ");
        tutorTeacherNamelbl.setBounds(480, 120, 100, 20);
        frame.add(tutorTeacherNamelbl);

        // tutor teacher name textfield
        tutorTeacherNameTxt = new JTextField();
        tutorTeacherNameTxt.setBounds(620, 120, 140, 20);
        frame.add(tutorTeacherNameTxt);

        // tutor address label
        tutorAddresslbl = new JLabel("Address: ");
        tutorAddresslbl.setBounds(480, 145, 100, 20);
        frame.add(tutorAddresslbl);

        // tutor address textfield
        tutorAddressTxt = new JTextField();
        tutorAddressTxt.setBounds(620, 145, 140, 20);
        frame.add(tutorAddressTxt);

        // tutor working type label
        tutorWorkingTypelbl = new JLabel("Working Type: ");
        tutorWorkingTypelbl.setBounds(480, 170, 150, 20);
        frame.add(tutorWorkingTypelbl);

        // tutor working type textfield
        tutorWorkingTypeTxt = new JTextField();
        tutorWorkingTypeTxt.setBounds(620, 170, 140, 20);
        frame.add(tutorWorkingTypeTxt);

        // tutor employment status label
        tutorEmploymentStatuslbl = new JLabel("Employment Status: ");
        tutorEmploymentStatuslbl.setBounds(480, 195, 150, 20);
        frame.add(tutorEmploymentStatuslbl);

        // tutor employment status textfield
        tutorEmploymentStatusTxt = new JTextField();
        tutorEmploymentStatusTxt.setBounds(620, 195, 140, 20);
        frame.add(tutorEmploymentStatusTxt);

        // tutor working hours label
        tutorWorkingHourslbl = new JLabel("Working Hours: ");
        tutorWorkingHourslbl.setBounds(480, 220, 100, 20);
        frame.add(tutorWorkingHourslbl);

        // tutor working hours textfield
        tutorWorkingHoursTxt = new JTextField();
        tutorWorkingHoursTxt.setBounds(620, 220, 140, 20);
        frame.add(tutorWorkingHoursTxt);

        // tutor salary label
        tutorSalarylbl = new JLabel("Salary: ");
        tutorSalarylbl.setBounds(480, 245, 100, 20);
        frame.add(tutorSalarylbl);

        // tutor salary textfield
        tutorSalaryTxt = new JTextField();
        tutorSalaryTxt.setBounds(620, 245, 140, 20);
        frame.add(tutorSalaryTxt);

        // tutor specialization label
        tutorSpecializationlbl = new JLabel("Specialization: ");
        tutorSpecializationlbl.setBounds(480, 270, 100, 20);
        frame.add(tutorSpecializationlbl);

        // tutor specialization textfield
        tutorSpecializationTxt = new JTextField();
        tutorSpecializationTxt.setBounds(620, 270, 140, 20);
        frame.add(tutorSpecializationTxt);

        // tutor academic qualification label
        tutorAcademicQualificationlbl = new JLabel("Academic Qualification: ");
        tutorAcademicQualificationlbl.setBounds(480, 295, 150, 20);
        frame.add(tutorAcademicQualificationlbl);

        // tutor academic qualification textfield
        tutorAcademicQualificationTxt = new JTextField();
        tutorAcademicQualificationTxt.setBounds(620, 295, 140, 20);
        frame.add(tutorAcademicQualificationTxt);

        // tutor performance index label
        tutorPerformanceIndexlbl = new JLabel("Performance Index: ");
        tutorPerformanceIndexlbl.setBounds(480, 320, 150, 20);
        frame.add(tutorPerformanceIndexlbl);

        // tutor performance index textfield
        tutorPerformanceindexTxt = new JTextField();
        tutorPerformanceindexTxt.setBounds(620, 320, 140, 20);
        frame.add(tutorPerformanceindexTxt);

        // add tutor button
        addTutorBtn = new JButton("Add Tutor");
        addTutorBtn.setBounds(480, 360, 140, 40);
        addTutorBtn.setBackground(Color.lightGray);
        addTutorBtn.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                addTutor();
            }    
        });
        frame.add(addTutorBtn);

        // remove tutor button
        removeTutorBtn = new JButton("Remove Tutor");
        removeTutorBtn.setBounds(650, 360, 140, 40);
        removeTutorBtn.setBackground(Color.lightGray);
        removeTutorBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                removeTutor();
            }
        });
        frame.add(removeTutorBtn);


        // Set Salary Section
        setTheSalarylbl = new JLabel("Set salary for the Tutor");
        setTheSalarylbl.setBounds(460, 430, 180, 20);
        setTheSalarylbl.setFont(font3);
        frame.add(setTheSalarylbl);

        // teacher id label for set salary
        ssTeacherIDlbl = new JLabel("Teacher ID: ");
        ssTeacherIDlbl.setBounds(410, 470, 100, 40);
        frame.add(ssTeacherIDlbl);

        // teacher id textfield for set salary
        ssTeacherIDTxt = new JTextField();
        ssTeacherIDTxt.setBounds(530, 480, 140, 20);
        frame.add(ssTeacherIDTxt);

        // salary label for set salary
        salarylbl = new JLabel("Salary: ");
        salarylbl.setBounds(410, 500, 100, 20);
        frame.add(salarylbl);

        // salary textfield for set salary
        salaryTxt = new JTextField();
        salaryTxt.setBounds(530, 505, 140, 20);
        frame.add(salaryTxt);

        // performance index label for set salary
        performanceIndexLbl = new JLabel("Performance Index: ");
        performanceIndexLbl.setBounds(410, 525, 140, 20);
        frame.add(performanceIndexLbl);

        // performance index textfield for set salary
        performanceIndexTxt = new JTextField();
        performanceIndexTxt.setBounds(530, 530, 140, 20);
        frame.add(performanceIndexTxt);

        // set salary button
        setSalaryBtn = new JButton("Set Salary");
        setSalaryBtn.setBounds(470, 570, 160, 40);
        setSalaryBtn.setBackground(Color.lightGray);
        setSalaryBtn.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                setSalary();
            }    
        });
        frame.add(setSalaryBtn);
        
        // display button 
        displayBtn = new JButton("Display");
        displayBtn.setBounds(300, 680, 160, 40);
        displayBtn.setBackground(Color.lightGray);
        displayBtn.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                display();
            }
        });
        frame.add(displayBtn);

        // clear button
        clearBtn = new JButton("Clear");
        clearBtn.setBounds(470, 680, 160, 40);
        clearBtn.setBackground(Color.lightGray);
        clearBtn.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                clear();
            }   
        });
        frame.add(clearBtn);

    
        frame.setVisible(true);
    }

    private void addLecturer()
    {
        try{
            int id = Integer.parseInt(getTFText(lecturerTeacherIDTxt));
            String name = getTFText(lecturerTeacherNameTxt);
            String address = getTFText(lecturerAddressTxt);
            String workingType = getTFText(lecturerWorkingTypeTxt);
            String employmentStatus = getTFText(lecturerEmploymentStatusTxt);
            int workingHours = Integer.parseInt(getTFText(lecturerWorkingHoursTxt));
            String department = getTFText(lecturerDepartmentTxt);
            int yearsOfExperience = Integer.parseInt(getTFText(lecturerYearsOfExperienceTxt));

            if (!isIdUnique(id)) 
            {
                JOptionPane.showMessageDialog(frame, "ID already taken by another individual", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Lecturer lecturer = new Lecturer(id, name, address, workingType, employmentStatus, department, yearsOfExperience, workingHours);
            teachers.add(lecturer);
            JOptionPane.showMessageDialog(frame, "Lecturer information added successfully.", "Added", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException n)
        {
            JOptionPane.showMessageDialog(frame, "Enter valid number not some string value.", "Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(frame, "Enter all the fields", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addTutor()
    {
        try
        {
            int id = Integer.parseInt(getTFText(tutorTeacherIDTxt));
            String name = getTFText(tutorTeacherNameTxt);
            String address = getTFText(tutorAddressTxt);
            String workingType = getTFText(tutorWorkingTypeTxt);
            String employmentStatus = getTFText(tutorEmploymentStatusTxt);
            int workingHours = Integer.parseInt(getTFText(tutorWorkingHoursTxt));
            double salary = Double.parseDouble(getTFText(tutorSalaryTxt));
            String specialization = getTFText(tutorSpecializationTxt);
            String academicQualification = getTFText(tutorAcademicQualificationTxt);
            int performanceIndex = Integer.parseInt(getTFText(tutorPerformanceindexTxt));

            if(!isIdUnique(id))
            {
                JOptionPane.showMessageDialog(frame, "ID is already taken by another Individual.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Tutor tutor = new Tutor(id, name, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualification, performanceIndex);
            teachers.add(tutor);
            JOptionPane.showMessageDialog(frame, "Tutor Information added successfully.", "Added",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame, "Enter numeric values not string values", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(frame, "Please fill the fields for tutor", "Error", JOptionPane.ERROR_MESSAGE);
        }
       
    }

    private void removeTutor()
    {
       try
       {
            int teacherID = convertIntoInt(tutorTeacherIDTxt);
            Teacher teacher = getTeacher(teacherID);

            if(!(teachers.contains(teacher)))
            {
                JOptionPane.showMessageDialog(frame, "ID is invalid", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if(!(teacher instanceof Tutor))
            {
                JOptionPane.showMessageDialog(frame,"Not a Tutor", "Error", JOptionPane.ERROR_MESSAGE);
            }

            String message =  "Teacher ID : " + teacherID + "\n";
            int confirm = JOptionPane.showConfirmDialog(frame,message + "Remove tutor?","Confirm", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION)
            {
                Tutor tutor = (Tutor) teacher;
                tutor.removeTutor();
                JOptionPane.showMessageDialog(frame, "Tutor is removed", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
       }
       catch(NumberFormatException ne)
       {
            JOptionPane.showMessageDialog(frame, "Enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
       }
       catch(IllegalArgumentException ie)
       {
        JOptionPane.showMessageDialog(frame, "Fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }

    private void gradeAssignment()
    {
        try{
            int teacherID = convertIntoInt(gaTeacherIDTxt);
            int gradedScore = convertIntoInt(gradedScoreTxt);
            String department = getTFText(departmentTxt);
            int yearsOfExperience = convertIntoInt(yearsOfExperienceTxt);
            Teacher teacher = getTeacher(teacherID);

            if(!teachers.contains(teacher))
            {
                JOptionPane.showMessageDialog(frame, "Id is invalid.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(!(teacher instanceof Lecturer))
            {
                JOptionPane.showMessageDialog(frame, "Not a valid Lecturer", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // DownCasting
            Lecturer lecturer = (Lecturer) teacher; 

            if(yearsOfExperience >= 5 && department.equals(lecturer.getDepartment()))
            {
                String details = "Teacher ID : " + teacherID + "\n" +
                "Graded Score: " + gradedScore + "\n" +
                "Department: " + department + "\n" +
                "Years Of Experience: " + yearsOfExperience + "\n";

                int options = JOptionPane.showConfirmDialog(frame, details + "Are you sure to grade the assignment?", "Confirm", JOptionPane.YES_NO_OPTION);

                if(options == JOptionPane.YES_OPTION)
                {
                    lecturer.gradeAssignment(gradedScore, department, yearsOfExperience);
                    lecturer.setGradedScore(gradedScore);
                    JOptionPane.showMessageDialog(frame, "Graded Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(frame, "Lecturer's years of experience must be 5 or greater and of the same department", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame, "Please Enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(frame, "Fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setSalary()
    {
        try{
            int teacherID = convertIntoInt(ssTeacherIDTxt);
            double newSalary = Double.parseDouble(getTFText(salaryTxt));
            int newPerformanceIndex = convertIntoInt(performanceIndexTxt);
            Teacher teacher = getTeacher(teacherID);

            if(!(teachers.contains(teacher)))
            {
                JOptionPane.showMessageDialog(frame, "Invalid ID for Tutor", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if(!(teacher instanceof Tutor))
            {
                JOptionPane.showMessageDialog(frame, "Not a valid Tutor", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Downcasting
            Tutor tutor = (Tutor) teacher;

            if(newPerformanceIndex >= 5 && newPerformanceIndex <=10 && tutor.getWorkingHours() > 20)
            {
                String tutorDetails = "Teacher ID : " + teacherID + "\n" +"New Salary: " + newSalary + "\n" +
                "Performance Index: " + newPerformanceIndex + "\n";
                int option = JOptionPane.showConfirmDialog(frame, tutorDetails+"Set salary for Tutor?", "Confirm", JOptionPane.YES_NO_OPTION);

                 if(option == JOptionPane.YES_OPTION)
                 {
                    tutor.setSalary(newSalary, newPerformanceIndex);
                    JOptionPane.showMessageDialog(frame, "New salary is set for the tutor.", "Success", JOptionPane.INFORMATION_MESSAGE);
                 }
            }
            else
            {
                JOptionPane.showMessageDialog(frame, "Performance Index must be greater than or equal to 5 and less than equal to 10. Also working hours must be greater than 20.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame, "Enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(frame, "Fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void display()
    {
        if(teachers.isEmpty())
        {
            JOptionPane.showMessageDialog(frame, "Oops it is blank","Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            for(Teacher teacher : teachers)
            {
                if (teacher instanceof Lecturer)
                {
                    Lecturer lecturer = (Lecturer) teacher;
                    lecturer.displayInfo();
                }
                else
                {
                    Tutor tutor = (Tutor) teacher;
                    tutor.displayInfo();
                }
            }
        }
    }

    private void clear()
    {
        lecturerTeacherIDTxt.setText("");
        lecturerTeacherNameTxt.setText("");
        lecturerAddressTxt.setText("");
        lecturerWorkingTypeTxt.setText("");
        lecturerEmploymentStatusTxt.setText("");
        lecturerDepartmentTxt.setText("");
        lecturerYearsOfExperienceTxt.setText("");
        lecturerWorkingHoursTxt.setText("");

        tutorTeacherIDTxt.setText("");
        tutorTeacherNameTxt.setText("");
        tutorAddressTxt.setText("");
        tutorWorkingTypeTxt.setText("");
        tutorEmploymentStatusTxt.setText("");
        tutorAcademicQualificationTxt.setText("");
        tutorPerformanceindexTxt.setText("");
        tutorSalaryTxt.setText("");
        tutorSpecializationTxt.setText("");
        tutorWorkingHoursTxt.setText("");

        gaTeacherIDTxt.setText("");
        departmentTxt.setText("");
        yearsOfExperienceTxt.setText("");
        gradedScoreTxt.setText("");

        ssTeacherIDTxt.setText("");
        performanceIndexTxt.setText("");
        salaryTxt.setText("");
    
    }


    public String getTFText(JTextField tf)
    {
    String text = tf.getText().trim();
        if(text.isEmpty())
    {
        throw new IllegalArgumentException();
    }
        return text;
    }

    private boolean isIdUnique(int id)
    {
        for(Teacher teacher: teachers)
        {
            if(teacher.getTeacherID() == id)
            {
                return false;
            }
        }
        return true;
    }

    private int convertIntoInt(JTextField Tf) throws IllegalArgumentException 
    {
        String text = Tf.getText().trim();
        if (text.isEmpty()) 
        {
            throw new IllegalArgumentException("Fill all the fields.");
        }
        int intText = Integer.parseInt(text);
        if (intText < 0) 
        {
            throw new NumberFormatException("Enter a numeric value");
        }
        return intText;
    }

    private Teacher getTeacher(int teacherID)
    {
        for(Teacher teacher: teachers)
        {
            if(teacher.getTeacherID() == teacherID)
            {
                return teacher;
            }
        }
        return null;
    }

    public static void main(String[] args) 
    {
        new TeacherGUI();
    }
}
