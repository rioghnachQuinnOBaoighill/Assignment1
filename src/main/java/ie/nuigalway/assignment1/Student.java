/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.assignment1;

import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author riogh_000
 */
public class Student {
    
    private DateTime dt = new DateTime();
    private Date dob = dt.toDate();
    
    private String name;
    private int age;
    private String DOB;
    private int ID;
    private String username;
    private String course;
    
    public Student(String name, int age, int ID, String DOB, String course)
    {
        this.name = name;
        this.ID = ID;
        this.DOB = DOB;
        this.course = course;
    }

    public String getUsername(Student student)
    {
        return username = name + ID;
    }
}

