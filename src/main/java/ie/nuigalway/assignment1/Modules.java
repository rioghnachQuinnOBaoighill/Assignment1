/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.assignment1;
import java.util.ArrayList;
/**
 *
 * @author riogh_000
 */
public class Modules {
    private String name;
    private String ID;
    private ArrayList students;
    
    public Modules(String name, String ID, ArrayList students)
    {
        this.name = name;
        this.ID = ID;
        this.students = students;
    }
    
}
