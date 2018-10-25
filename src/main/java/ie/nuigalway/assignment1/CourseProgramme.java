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
    
}