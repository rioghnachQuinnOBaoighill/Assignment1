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
        ArrayList<Modules> allModules = new ArrayList<Modules>();
        allModules = this.getModules();
        for (Modules mod : allModules)
        {
            System.out.println("Module Name: " + mod.getName());
            ArrayList<Student> modStudents = mod.getStudents();
            for (Student student : modStudents){
                System.out.println("Student Name: " + student.getName() + "\t Username: " + student.getUsername(student) + "\t Course: " + student.getCourse());
            }
            System.out.println();
        }
    }
}