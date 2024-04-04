/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package library.apt2080;

import javax.swing.JLabel;
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
public class AdminaddbookIT {
    
    private Adminaddbook adminaddbook;
    
    public AdminaddbookIT() {
    }
    
   @Before
    public void setUp() {
        adminaddbook = new Adminaddbook();
    }

    @After
    public void tearDown() {
        adminaddbook = null;
    }

    /**
     * Test of getTxtbookid method, of class Adminaddbook.
     */
  @Test
    public void testAddBook() {
        // Test adding a book with valid input
        adminaddbook.getTxtbookid().setText("001");
        adminaddbook.getTxtbookname().setText("Test Book");
        adminaddbook.getTxtauthor().setText("Test Author");
        adminaddbook.getTxtavailable().setText("10");
        adminaddbook.getTxtcoursecode().setText("CSE101");
        adminaddbook.getAddButton().doClick();
       
    }
    
}
