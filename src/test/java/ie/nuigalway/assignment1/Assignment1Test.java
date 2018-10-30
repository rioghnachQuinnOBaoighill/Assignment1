/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.assignment1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author riogh_000
 */
public class Assignment1Test {
    
    public Assignment1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void test1() 
    {
        Student stu1 = new Student("RQuinnOBaoighill", 21, 1552991, "14/3/97", "4BP1");
        String stuUsername = stu1.getUsername(stu1);
        
        System.out.print("\n" + stuUsername + "\n");
    }
}
