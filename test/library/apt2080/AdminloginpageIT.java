/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package library.apt2080;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
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
public class AdminloginpageIT {
    
    public AdminloginpageIT() {
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
     * Test of getTxtadminpassword method, of class Adminloginpage.
     */


    /**
     * Test of main method, of class Adminloginpage.
     */
//    @Test
//public void testMain() {
//    System.out.println("main");
//    String[] args = null;
//    Adminloginpage.main(args);
//    // TODO review the generated test code and remove the default call to fail.
//    fail("The test case is a prototype.");
//}

@Test
public void testCorrectLogin() {
    Adminloginpage adminLoginPage = new Adminloginpage();
    adminLoginPage.getTxtadminid().setText("1212");
    adminLoginPage.getTxtadminpassword().setText("hello");
    adminLoginPage.getJButton1().doClick();
    // Add your assertions here to check if the correct behavior occurred after clicking the button.
}

@Test
public void testIncorrectLogin() {
    Adminloginpage adminLoginPage = new Adminloginpage();
    adminLoginPage.getTxtadminid().setText("invalidAdminID");
    adminLoginPage.getTxtadminpassword().setText("invalidPassword");
    adminLoginPage.getJButton1().doClick();
    // Add your assertions here to check if the correct behavior occurred after clicking the button.
}

@Test
public void testEmptyLogin() {
    Adminloginpage adminLoginPage = new Adminloginpage();
    adminLoginPage.getTxtadminid().setText("");
    adminLoginPage.getTxtadminpassword().setText("");
    adminLoginPage.getJButton1().doClick();
    // Add your assertions here to check if the correct behavior occurred after clicking the button.
}

    
}
