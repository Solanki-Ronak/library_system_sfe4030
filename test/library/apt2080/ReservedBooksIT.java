package library.apt2080;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class ReservedBooksIT {
    
    private ReservedBooks reservedBooks;
    
    public ReservedBooksIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        reservedBooks = new ReservedBooks();
        reservedBooks.setVisible(true);
    }
    
    @After
    public void tearDown() {
        reservedBooks.dispose();
    }

    /**
     * Test of initComponents method, of class ReservedBooks.
     */
    @Test
    public void testInitComponents() {
        assertNotNull(reservedBooks.getJButton1());
        assertNotNull(reservedBooks.getJButton2());
        assertNotNull(reservedBooks.getJTable1());
        assertNotNull(reservedBooks.getJScrollPane1());
        assertNotNull(reservedBooks.getJLabel1());
        assertNotNull(reservedBooks.getJLabel2());
    }

    /**
     * Test of jButton1ActionPerformed method, of class ReservedBooks.
     */
//    @Test
//    public void testJButton1ActionPerformed() {
//        reservedBooks.getJButton1().doClick();
//        assertTrue(reservedBooks.isVisible());
//        reservedBooks.dispose();
//        assertFalse(reservedBooks.isVisible());
//    }

    /**
     * Test of jButton2ActionPerformed method, of class ReservedBooks.
     */
//    @Test
//    public void testJButton2ActionPerformed() {
//        reservedBooks.getJButton2().doClick();
//        assertTrue(reservedBooks.isVisible());
//        reservedBooks.dispose();
//        assertFalse(reservedBooks.isVisible());
//    }
    
}
