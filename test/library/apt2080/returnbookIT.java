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
public class returnbookIT {
    
    public returnbookIT() {
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
    public void testJButton1ActionPerformed() {
        System.out.println("jButton1ActionPerformed");
        java.awt.event.ActionEvent evt = null; // Provide a valid ActionEvent
        returnbook instance = new returnbook();
        instance.getJButton1().doClick();
        // No assertion because it's void
    }

 

    @Test
    public void testSearchActionPerformed() {
        System.out.println("searchActionPerformed");
        java.awt.event.ActionEvent evt = null; // Provide a valid ActionEvent
        returnbook instance = new returnbook();
        instance.getSearch().doClick();
        // No assertion because it's void
    }

    @Test
    public void testDisplayallActionPerformed() {
        System.out.println("displayallActionPerformed");
        java.awt.event.ActionEvent evt = null; // Provide a valid ActionEvent
        returnbook instance = new returnbook();
        instance.getDisplayall().doClick();
        // No assertion because it's void
    }
    
}
