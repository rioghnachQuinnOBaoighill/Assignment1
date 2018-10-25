/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.assignment1;

import org.joda.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author riogh_000
 */
public class CourseProgramme {
    
    private String courseName;
    private ArrayList courseModules;
    private LocalDate startDate;
    private LocalDate endDate;
    
    public CourseProgramme(String courseName, ArrayList courseModules, LocalDate startDate, LocalDate endDate)
    {
        this.courseName = courseName;
        this.courseModules = courseModules;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    public ArrayList getModules() 
    {
        return courseModules;
    }
    
    public void ToString()
    {
        ArrayList<Student> allStudents = new ArrayList<Student>();
        ArrayList<Modules> allModules = new ArrayList<Modules>();
        allModules = this.getModules();
        for (int i=0; i<allModules.size(); i++)
        {
            Modules mod = allModules.get(i);
            
            ArrayList<Student> modStudents = new ArrayList<Student>();
            
            modStudents = mod.getStudents();
            
            for (int j = 0; j<modStudents.size();j++)
            {
                Student stu = modStudents.get(j);
                
                if (stu.getCourse().equals(this.getCourseName()) &&! (allStudents.contains(stu)))
                {
                    allStudents.add(stu);
                    System.out.println(stu.getName() + "\t Course Title: " + stu.getCourse());
                    System.out.println("\t Course Modules: ");
                    for(int m=0; m<allModules.size(); m++)
                    {
                        System.out.print(allModules.get(m).getName());
                    }
                    System.out.println();
                }
            }
        }
    }
}