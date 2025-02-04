/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.apt2080;

import java.awt.Component;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;



/**
 *
 * @author ronak
 */
public class Studentreserveee extends javax.swing.JFrame {

    /**
     * Creates new form AdminAllbookDetails
     */
    private int selectedRow;
    private String selectedImagePath;
    String filename=null;
    byte[] person_image=null;
    private String studentIdnew1;
    
    public Studentreserveee(String studentIdnew1) {
        initComponents();
       this.studentidnew1.setText(studentIdnew1);
        
       
    customizeComponents();
        
        
       
     }
private void customizeComponents() {
        
        reserve.setBackground(java.awt.Color.WHITE);
        jButton2.setBackground(java.awt.Color.WHITE);
         displaybutton.setBackground(java.awt.Color.WHITE);
         searchbooknamebutton.setBackground(java.awt.Color.WHITE);
         searchcoursecodebutton.setBackground(java.awt.Color.WHITE);
         
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtbookname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        searchcoursecodebutton = new javax.swing.JButton();
        displaybutton = new javax.swing.JButton();
        searchbooknamebutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bookidtoreserve = new javax.swing.JTextField();
        reserve = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        studentidnew1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtcoursecode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        jLabel2.setText("SEARCH A BOOK BY:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 50, 110, 16);

        jLabel3.setText("COURSE CODE:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(42, 89, 120, 30);

        jLabel5.setText("BOOK NAME:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 160, 100, 30);
        getContentPane().add(txtbookname);
        txtbookname.setBounds(191, 170, 100, 30);

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "BOOK ID", "BOOK NAME", "COURSE CODE", "AUTHOR", "AVAILABILITY", "IMAGE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        bookTable.setRowHeight(120);
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 290, 813, 240);

        searchcoursecodebutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\search (2) (1).png")); // NOI18N
        searchcoursecodebutton.setText("SEARCH");
        searchcoursecodebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcoursecodebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(searchcoursecodebutton);
        searchcoursecodebutton.setBounds(320, 90, 130, 27);

        displaybutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\display (2).png")); // NOI18N
        displaybutton.setText("DISPLAY ALL BOOKS");
        displaybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaybuttonActionPerformed(evt);
            }
        });
        getContentPane().add(displaybutton);
        displaybutton.setBounds(39, 228, 190, 40);

        searchbooknamebutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\search (2) (1).png")); // NOI18N
        searchbooknamebutton.setText("SEARCH");
        searchbooknamebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbooknamebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(searchbooknamebutton);
        searchbooknamebutton.setBounds(320, 170, 130, 27);

        jLabel6.setText("OR");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(107, 127, 40, 16);
        getContentPane().add(bookidtoreserve);
        bookidtoreserve.setBounds(600, 220, 151, 46);

        reserve.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\issuebook (1).png")); // NOI18N
        reserve.setText("RESERVE");
        reserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveActionPerformed(evt);
            }
        });
        getContentPane().add(reserve);
        reserve.setBounds(800, 220, 140, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Enter the book id here to reserve the book:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(530, 180, 290, 30);

        jLabel8.setText("USER ID:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(640, 20, 80, 16);

        studentidnew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentidnew1ActionPerformed(evt);
            }
        });
        getContentPane().add(studentidnew1);
        studentidnew1.setBounds(750, 20, 71, 22);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\3545435 (2).png")); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(870, 500, 100, 23);
        getContentPane().add(txtcoursecode);
        txtcoursecode.setBounds(191, 90, 100, 30);

        jLabel9.setFont(new java.awt.Font("Rockwell Nova Light", 0, 24)); // NOI18N
        jLabel9.setText("RESERVE A BOOK");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(250, 0, 230, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\background (1).jpg")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, 6, 1200, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public class ImageTableCellRenderer extends DefaultTableCellRenderer {
    @Override
     public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (value instanceof ImageIcon) {
            ImageIcon imageIcon = (ImageIcon) value;
            setIcon(imageIcon);
            setText("");  // Set the text to an empty string for ImageIcon values
        } else {
            setIcon(null);
        }
        return cellComponent;
    }
}

    


    private void searchcoursecodebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcoursecodebuttonActionPerformed
        String courseCode = (String) txtcoursecode.getText();
    DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
    model.setRowCount(0);

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
        String query = "SELECT * FROM unreserved WHERE coursecode = ?";
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setString(1, courseCode);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            String bookID = rs.getString("bookid");
            String bookName = rs.getString("bookname");
            String author = rs.getString("author");
            String availability = rs.getString("available");
            byte[] imageData = rs.getBytes("imageupload");

            ImageIcon imageIcon = new ImageIcon(imageData);
            Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon scaledImageIcon = new ImageIcon(image);

            model.addRow(new Object[]{bookID, bookName, courseCode, author, availability, scaledImageIcon});
        }

        rs.close();
        statement.close();
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(Studentreserveee.class.getName()).log(Level.SEVERE, null, ex);
    }
    bookTable.getColumnModel().getColumn(5).setCellRenderer(new ImageTableCellRenderer());

    }//GEN-LAST:event_searchcoursecodebuttonActionPerformed


    private void displaybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaybuttonActionPerformed
   DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
        model.setRowCount(0);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
            String query = "SELECT * FROM unreserved";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String bookID = rs.getString("bookid");
                String bookName = rs.getString("bookname");
                String courseCode = rs.getString("coursecode");
                String author = rs.getString("author");
                String availability = rs.getString("available");
                byte[] imageData = rs.getBytes("imageupload");

                ImageIcon imageIcon = new ImageIcon(imageData);
                Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon scaledImageIcon = new ImageIcon(image);

                model.addRow(new Object[]{bookID, bookName, courseCode, author, availability, scaledImageIcon});
            }

            rs.close();
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Studentreserveee.class.getName()).log(Level.SEVERE, null, ex);
        }

        selectedImagePath = null; // Reset the selected image path
        txtbookname.setText("");
        bookTable.getColumnModel().getColumn(5).setCellRenderer(new ImageTableCellRenderer());

    }//GEN-LAST:event_displaybuttonActionPerformed
private void displayUnreservedBooks() {
    DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
    model.setRowCount(0);

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
        String query = "SELECT * FROM unreserved";
        PreparedStatement statement = conn.prepareStatement(query);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            String bookID = rs.getString("bookid");
            String bookName = rs.getString("bookname");
            String courseCode = rs.getString("coursecode");
            String author = rs.getString("author");
            String availability = rs.getString("available");
            byte[] imageData = rs.getBytes("imageupload");

            ImageIcon imageIcon = new ImageIcon(imageData);
            Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon scaledImageIcon = new ImageIcon(image);

            model.addRow(new Object[]{bookID, bookName, courseCode, author, availability, scaledImageIcon});
        }

        rs.close();
        statement.close();
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(Studentreserveee.class.getName()).log(Level.SEVERE, null, ex);
    }

    selectedImagePath = null; // Reset the selected image path
    txtbookname.setText("");
    bookTable.getColumnModel().getColumn(5).setCellRenderer(new ImageTableCellRenderer());
}


    private void searchbooknamebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbooknamebuttonActionPerformed
 String bookName = txtbookname.getText();
    DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
    model.setRowCount(0);

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
        String query = "SELECT * FROM unreserved WHERE bookname LIKE ?";
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setString(1, "%" + bookName + "%");
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            String bookID = rs.getString("bookid");
            String courseCode = rs.getString("coursecode");
            String author = rs.getString("author");
            String availability = rs.getString("available");
            byte[] imageData = rs.getBytes("imageupload");

            ImageIcon imageIcon = new ImageIcon(imageData);
            Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon scaledImageIcon = new ImageIcon(image);

            model.addRow(new Object[]{bookID, bookName, courseCode, author, availability, scaledImageIcon});
        }

        rs.close();
        statement.close();
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(Studentreserveee.class.getName()).log(Level.SEVERE, null, ex);
    }

    txtbookname.setText("");
    bookTable.getColumnModel().getColumn(5).setCellRenderer(new ImageTableCellRenderer());

    }//GEN-LAST:event_searchbooknamebuttonActionPerformed

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = bookTable.getSelectedRow();
    if (selectedRowIndex >= 0) {
        DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
        bookidtoreserve.setText(model.getValueAt(selectedRowIndex, 0).toString());
        
    }
   
    }//GEN-LAST:event_bookTableMouseClicked

    private void studentidnew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentidnew1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentidnew1ActionPerformed

    private void reserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveActionPerformed

        
     String bookIDToReserve = bookidtoreserve.getText();
    String studentID = studentidnew1.getText();

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");

        // Check if the user has already reserved the book
        String checkReservationQuery = "SELECT * FROM reserved WHERE bookid = ? AND studentid = ?";
        PreparedStatement checkReservationStatement = conn.prepareStatement(checkReservationQuery);
        checkReservationStatement.setString(1, bookIDToReserve);
        checkReservationStatement.setString(2, studentID);
        ResultSet reservationResult = checkReservationStatement.executeQuery();

        if (reservationResult.next()) {
            JOptionPane.showMessageDialog(null, "You have already reserved this book.You can not reserve it again");
            return; // Exit the method if the user has already reserved the book
        }
        
         String checkReservationQuery1 = "SELECT * FROM issued WHERE bookid = ? AND studentid = ?";
        PreparedStatement checkReservationStatement1 = conn.prepareStatement(checkReservationQuery1);
        checkReservationStatement1.setString(1, bookIDToReserve);
        checkReservationStatement1.setString(2, studentID);
        ResultSet reservationResult1 = checkReservationStatement1.executeQuery();

        if (reservationResult1.next()) {
            JOptionPane.showMessageDialog(null, "You already have this book.You can not reserve it again");
            return; // Exit the method if the user has already reserved the book
        }

        // Check if the book is available
        String checkAvailabilityQuery = "SELECT * FROM unreserved WHERE bookid = ?";
        PreparedStatement checkAvailabilityStatement = conn.prepareStatement(checkAvailabilityQuery);
        checkAvailabilityStatement.setString(1, bookIDToReserve);
        ResultSet availabilityResult = checkAvailabilityStatement.executeQuery();

        if (availabilityResult.next()) {
            int availableInUnreserved = availabilityResult.getInt("available");

            // Check if available books are not zero
            if (availableInUnreserved != 0) {
                // Fetch the availability from the addbook table
                String fetchAvailabilityQuery = "SELECT available FROM addbook WHERE bookid = ?";
                PreparedStatement fetchAvailabilityStatement = conn.prepareStatement(fetchAvailabilityQuery);
                fetchAvailabilityStatement.setString(1, bookIDToReserve);
                ResultSet availabilityFetchResult = fetchAvailabilityStatement.executeQuery();

                if (availabilityFetchResult.next()) {
                    int availableInAddBook = availabilityFetchResult.getInt("available");

                    // Book is available, fetch the details
                    String bookName = availabilityResult.getString("bookname");
                    String courseCode = availabilityResult.getString("coursecode");
                    String author = availabilityResult.getString("author");
                    byte[] imageData = availabilityResult.getBytes("imageupload");

                    // Store the details in the reserved table
                    String reserveBookQuery = "INSERT INTO reserved (bookid, bookname, coursecode, author, imageupload, studentid) VALUES (?, ?, ?, ?, ?, ?)";
                    PreparedStatement reserveBookStatement = conn.prepareStatement(reserveBookQuery);
                    reserveBookStatement.setString(1, bookIDToReserve);
                    reserveBookStatement.setString(2, bookName);
                    reserveBookStatement.setString(3, courseCode);
                    reserveBookStatement.setString(4, author);
                    reserveBookStatement.setBytes(5, imageData);
                    reserveBookStatement.setString(6, studentID);

                    int rowsAffected = reserveBookStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Book reserved successfully!");
                        // Reduce the availability of the book in the unreserved table
                        String reduceAvailabilityQuery = "UPDATE unreserved SET available = ? WHERE bookid = ?";
                        PreparedStatement reduceAvailabilityStatement = conn.prepareStatement(reduceAvailabilityQuery);
                        reduceAvailabilityStatement.setInt(1, availableInUnreserved - 1);
                        reduceAvailabilityStatement.setString(2, bookIDToReserve);
                        reduceAvailabilityStatement.executeUpdate();
                        reduceAvailabilityStatement.close();
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to reserve the book.");
                    }

                    reserveBookStatement.close();
                }

                availabilityFetchResult.close();
                fetchAvailabilityStatement.close();
            } else {
                JOptionPane.showMessageDialog(null, "Book is not available for reservation.");
            }
        }

        reservationResult.close();
        checkReservationStatement.close();
        availabilityResult.close();
        checkAvailabilityStatement.close();
        conn.close();
        displayUnreservedBooks();
    } catch (SQLException ex) {
        Logger.getLogger(Studentreserveee.class.getName()).log(Level.SEVERE, null, ex);
    }

    clearFields();

    }//GEN-LAST:event_reserveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String studentId = studentidnew1.getText(); // Get the student ID from the text field
    Studentfirstpage firstpage = new Studentfirstpage(studentId);
    firstpage.setVisible(true);
    dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 String studentIdnew1 = ""; // Set a default value if needed
                new Studentreserveee(studentIdnew1).setVisible(true);
            }
        });
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JTextField bookidtoreserve;
    private javax.swing.JButton displaybutton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reserve;
    private javax.swing.JButton searchbooknamebutton;
    private javax.swing.JButton searchcoursecodebutton;
    private javax.swing.JTextField studentidnew1;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtcoursecode;
    // End of variables declaration//GEN-END:variables

private void clearFields() {bookidtoreserve.setText("");
    }}
