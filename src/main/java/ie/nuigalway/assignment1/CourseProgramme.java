/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.assignment1;

import org.joda.time.DateTime;
import java.util.ArrayList;
/**
 *
 * @author riogh_000
 */
public class CourseProgramme {
    
    private String courseName;
    private ArrayList courseModules;
    private DateTime startDate;
    private DateTime endDate;
    
    public CourseProgramme(String courseName, ArrayList courseModules, DateTime startDate, DateTime endDate)
    {
        this.courseName = courseName;
        this.courseModules = courseModules;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
}