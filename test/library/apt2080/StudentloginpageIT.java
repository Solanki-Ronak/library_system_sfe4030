/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package library.apt2080;

import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ronak
 */
public class StudentloginpageIT {
    
    public StudentloginpageIT() {
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

    /**
     * Test of main method, of class Studentloginpage.
     */
   @Test
    public void testSuccessfulLogin() {
        // Provide valid student ID and password
        String studentId = "100";
        String password = "100";

        // Create an instance of Studentloginpage
        Studentloginpage loginPage = new Studentloginpage();

        // Set the text fields with valid credentials
        loginPage.getTxtstudentid().setText(studentId);
        loginPage.getTxtpass().setText(password);

        // Simulate button click to perform login
        loginPage.getJButton1().doClick();

        // Check if the new page is opened upon successful login
        assertFalse(loginPage.isVisible());
    }

   


    
}
