/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package library.apt2080;

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
public class AdminsignuppageIT {
    
    public AdminsignuppageIT() {
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
     * Test of main method, of class Adminsignuppage.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Adminsignuppage.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    @Test
    public void testFormValidationEmptyFields() {
        Adminsignuppage adminSignupPage = new Adminsignuppage();
        adminSignupPage.getTxtadfirstname().setText("");
        adminSignupPage.getTxtadlastname().setText("");
        adminSignupPage.getTxtademail().setText("");
        adminSignupPage.getTxtadminid().setText("");
        adminSignupPage.getTxtpassword().setText("");
        adminSignupPage.getTxtcopassword().setText("");
        
        adminSignupPage.getJButton1().doClick(); // Click the signup button
        
        // Check if an error message is displayed for empty fields
        // Add your assertions here
    }
    
    @Test
    public void testFormValidationPasswordMismatch() {
        Adminsignuppage adminSignupPage = new Adminsignuppage();
        adminSignupPage.getTxtadfirstname().setText("John");
        adminSignupPage.getTxtadlastname().setText("Doe");
        adminSignupPage.getTxtademail().setText("john@example.com");
        adminSignupPage.getTxtadminid().setText("john123");
        adminSignupPage.getTxtpassword().setText("password");
        adminSignupPage.getTxtcopassword().setText("differentpassword");
        
        adminSignupPage.getJButton1().doClick(); // Click the signup button
        
        // Check if an error message is displayed for password mismatch
        // Add your assertions here
    }
    
    @Test
    public void testDatabaseInteraction() {
        // Simulate interaction with the database
        // Add your assertions here to verify database operations
    }

    
}
