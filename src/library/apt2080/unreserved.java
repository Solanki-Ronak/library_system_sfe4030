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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author ronak
 */
public class unreserved extends javax.swing.JFrame {

    /**
     * Creates new form AdminAllbookDetails
     */
 

    private int selectedRow;
    private String selectedImagePath;
    String filename=null;
    byte[] person_image=null;
    public unreserved() {
        initComponents();
        addTableSelectionListener();
       
     customizeComponents();
    }
private void customizeComponents() {
        
        jButton1.setBackground(java.awt.Color.WHITE);
         searchcoursecodebutton.setBackground(java.awt.Color.WHITE);
         searchbooknamebutton.setBackground(java.awt.Color.WHITE);
         issue.setBackground(java.awt.Color.WHITE);
          displaybutton.setBackground(java.awt.Color.WHITE);
          
        
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
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        studentid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bookidentered = new javax.swing.JTextField();
        issue = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcoursecode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();
        date2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        jLabel2.setText("SEARCH A BOOK BY:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(39, 49, 180, 30);

        jLabel3.setText("COURSE CODE:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(42, 86, 110, 30);

        jLabel5.setText("BOOK NAME:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 160, 90, 30);
        getContentPane().add(txtbookname);
        txtbookname.setBounds(170, 160, 100, 40);

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
        jScrollPane1.setBounds(20, 283, 813, 250);

        searchcoursecodebutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\search (2) (1).png")); // NOI18N
        searchcoursecodebutton.setText("SEARCH");
        searchcoursecodebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcoursecodebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(searchcoursecodebutton);
        searchcoursecodebutton.setBounds(290, 90, 120, 27);

        displaybutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\display (2).png")); // NOI18N
        displaybutton.setText("DISPLAY ALL BOOKS");
        displaybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaybuttonActionPerformed(evt);
            }
        });
        getContentPane().add(displaybutton);
        displaybutton.setBounds(70, 230, 230, 30);

        searchbooknamebutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\search (2) (1).png")); // NOI18N
        searchbooknamebutton.setText("SEARCH");
        searchbooknamebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbooknamebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(searchbooknamebutton);
        searchbooknamebutton.setBounds(290, 170, 120, 27);

        jLabel6.setText("OR");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(107, 124, 40, 30);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\3545435 (2).png")); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(870, 510, 110, 23);

        jLabel7.setText("STUDENT ID:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(510, 80, 110, 40);

        studentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentidActionPerformed(evt);
            }
        });
        getContentPane().add(studentid);
        studentid.setBounds(630, 90, 140, 22);

        jLabel8.setText("BOOK ID:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(510, 140, 70, 30);
        getContentPane().add(bookidentered);
        bookidentered.setBounds(630, 140, 140, 22);

        issue.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\issuebook (1).png")); // NOI18N
        issue.setText("ISSUE");
        issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueActionPerformed(evt);
            }
        });
        getContentPane().add(issue);
        issue.setBounds(820, 190, 150, 60);

        jLabel9.setText("ISSUE DATE:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(510, 190, 90, 30);

        jLabel10.setText("RETURN DATE:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(510, 240, 100, 30);

        txtcoursecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcoursecodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtcoursecode);
        txtcoursecode.setBounds(170, 90, 100, 40);

        jLabel11.setFont(new java.awt.Font("Rockwell Nova Light", 0, 24)); // NOI18N
        jLabel11.setText("ISSUE A BOOK");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(340, 0, 350, 50);
        getContentPane().add(date1);
        date1.setBounds(630, 192, 140, 30);
        getContentPane().add(date2);
        date2.setBounds(630, 240, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\background (1).jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-23, -54, 1040, 630);

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

 private void addTableSelectionListener() {
    bookTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        public void valueChanged(ListSelectionEvent event) {
            if (!event.getValueIsAdjusting()) {
                int selectedRow = bookTable.getSelectedRow();
                if (selectedRow != -1) {
                   
                    String selectedBookID = (String) bookTable.getValueAt(selectedRow, 0);
                    

                    
                    bookidentered.setText(selectedBookID);
                    
                }
            }
        }
    });
}   


    private void searchcoursecodebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcoursecodebuttonActionPerformed
        String courseCode = txtcoursecode.getText();
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
        Logger.getLogger(unreserved.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(unreserved.class.getName()).log(Level.SEVERE, null, ex);
        }

        selectedImagePath = null; // Reset the selected image path
        txtbookname.setText("");
        bookTable.getColumnModel().getColumn(5).setCellRenderer(new ImageTableCellRenderer());

    }//GEN-LAST:event_displaybuttonActionPerformed


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
        Logger.getLogger(unreserved.class.getName()).log(Level.SEVERE, null, ex);
    }

    txtbookname.setText("");
    bookTable.getColumnModel().getColumn(5).setCellRenderer(new ImageTableCellRenderer());

    }//GEN-LAST:event_searchbooknamebuttonActionPerformed

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        // TODO add your handling code here:
   
    }//GEN-LAST:event_bookTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         IssueBook adminfirstpage=new IssueBook();
        adminfirstpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void studentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentidActionPerformed

    private void issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueActionPerformed
    String studentID = studentid.getText();
    String bookID = bookidentered.getText();
    java.util.Date selectedDate1 = date1.getDate();
    java.util.Date selectedDate2 = date2.getDate();

    if (studentID.isEmpty() || bookID.isEmpty() || selectedDate1 == null || selectedDate2 == null) {
        JOptionPane.showMessageDialog(this, "Please fill in all the required details.");
        return;
    }
    
    
        

    // Convert the selected dates to SQL Date format
    java.sql.Date sqlDate1 = new java.sql.Date(selectedDate1.getTime());
    java.sql.Date sqlDate2 = new java.sql.Date(selectedDate2.getTime());

    try {
        // Connect to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
// Check if the student ID exists in the signup table
        String checkStudentQuery = "SELECT studentid FROM signup WHERE studentid = ?";
        PreparedStatement checkStudentStatement = conn.prepareStatement(checkStudentQuery);
        checkStudentStatement.setString(1, studentID);
        ResultSet checkStudentResult = checkStudentStatement.executeQuery();

        if (!checkStudentResult.next()) {
            // Display message that the student needs to register first
            JOptionPane.showMessageDialog(this, "Student needs to register first.");
            return;
        }
        
        // Check if the book is already issued to the student
        String checkIssuedQuery = "SELECT * FROM issued WHERE studentid = ? AND bookid = ?";
        PreparedStatement checkIssuedStatement = conn.prepareStatement(checkIssuedQuery);
        checkIssuedStatement.setString(1, studentID);
        checkIssuedStatement.setString(2, bookID);
        ResultSet checkIssuedResult = checkIssuedStatement.executeQuery();

        if (checkIssuedResult.next()) {
            // Display message that the book is already issued to the student
            JOptionPane.showMessageDialog(this, "Already issued the book to the student. Cannot issue again.");
            return;
        }
        // Check if there are any books in the returnednew table
        String checkNewQuery = "SELECT * FROM returnednew LIMIT 1";
        PreparedStatement checkNewStatement = conn.prepareStatement(checkNewQuery);
        ResultSet checkNewResult = checkNewStatement.executeQuery();

        if (checkNewResult.next()) {
            // If a book is found in the returnednew table, issue it and delete it from returnednew

            // Get the details of the book from the returnednew table
            String bookIDFromReturnedNew = checkNewResult.getString("bookid");
            String bookName = checkNewResult.getString("bookname");
            String courseCode = checkNewResult.getString("coursecode");
            String author = checkNewResult.getString("author");
            byte[] imageUpload = checkNewResult.getBytes("imageupload");
            int sdn = checkNewResult.getInt("sdn");

            // Insert the book into the issued table
            String insertQuery = "INSERT INTO issued (bookid, bookname, coursecode, author, imageupload, studentid, sdn, issuedate, returndate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
            insertStatement.setString(1, bookIDFromReturnedNew);
            insertStatement.setString(2, bookName);
            insertStatement.setString(3, courseCode);
            insertStatement.setString(4, author);
            insertStatement.setBytes(5, imageUpload);
            insertStatement.setString(6, studentID);
            insertStatement.setInt(7, sdn);
            insertStatement.setDate(8, sqlDate1);
            insertStatement.setDate(9, sqlDate2);
            insertStatement.executeUpdate();
            insertStatement.close();

            // Delete the book from the returnednew table
            String deleteQuery = "DELETE FROM returnednew WHERE bookid = ? AND sdn = ?";
            PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);
            deleteStatement.setString(1, bookIDFromReturnedNew);
            deleteStatement.setInt(2, sdn);
            deleteStatement.executeUpdate();
            deleteStatement.close();

            // Decrease the available column in the unreserved table by 1
            String decreaseQuery = "UPDATE unreserved SET available = available - 1 WHERE bookid = ?";
            PreparedStatement decreaseStatement = conn.prepareStatement(decreaseQuery);
            decreaseStatement.setString(1, bookIDFromReturnedNew);
            decreaseStatement.executeUpdate();
            decreaseStatement.close();

            // Display success message
            JOptionPane.showMessageDialog(this, "Book issued successfully!");

            // Refresh the book table with the current data from unreserved
            String selectQuery = "SELECT bookid, bookname, coursecode, author, available, imageupload FROM unreserved";
            PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
            ResultSet selectResult = selectStatement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
            model.setRowCount(0); // Clear the existing rows

            while (selectResult.next()) {
                String bookIDValue = selectResult.getString("bookid");
                String bookNameValue = selectResult.getString("bookname");
                String courseCodeValue = selectResult.getString("coursecode");
                String authorValue = selectResult.getString("author");
                int availableValue = selectResult.getInt("available");
                byte[] imageData = selectResult.getBytes("imageupload");

                ImageIcon imageIcon = new ImageIcon(imageData);
                Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon scaledImageIcon = new ImageIcon(image);

                model.addRow(new Object[]{bookIDValue, bookNameValue, courseCodeValue, authorValue, availableValue, scaledImageIcon});
            }

            selectResult.close();
            selectStatement.close();

            // Clear the student ID and book ID fields
            studentid.setText("");
            bookidentered.setText("");
            date1.setDate(null);
            date2.setDate(null);
        } else {
            // Retrieve available value from addbook table for the entered book ID
            String getXQuery = "SELECT available FROM addbook WHERE bookid = ?";
            PreparedStatement getXStatement = conn.prepareStatement(getXQuery);
            getXStatement.setString(1, bookID);
            ResultSet getXResult = getXStatement.executeQuery();
            int available = 0;
            if (getXResult.next()) {
                available = getXResult.getInt("available");
            }
            getXResult.close();
            getXStatement.close();

            if (available == 0) {
                // Display error message if book is not available
                JOptionPane.showMessageDialog(this, "There are no books available to be issued.");
            } else {
                // Retrieve available value from unreserved table for the entered book ID
                String getYQuery = "SELECT available FROM unreserved WHERE bookid = ?";
                PreparedStatement getYStatement = conn.prepareStatement(getYQuery);
                getYStatement.setString(1, bookID);
                ResultSet getYResult = getYStatement.executeQuery();
                int available1 = 0;
                if (getYResult.next()) {
                    available1 = getYResult.getInt("available");
                }
                getYResult.close();
                getYStatement.close();

                if (available1 == 0) {
                    // Display error message if book is not available in the unreserved table
                    JOptionPane.showMessageDialog(this, "There are no books available to be issued.");
                } else {
                    // Calculate sdn
                    int sdn = (available - available1) + 1;

                    // Insert the issued book into the issued table
                    String insertQuery = "INSERT INTO issued (bookid, bookname, coursecode, author, imageupload, studentid, sdn, issuedate, returndate) SELECT bookid, bookname, coursecode, author, imageupload, ?, ?, ?, ? FROM unreserved WHERE bookid = ?";
                    PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
                    insertStatement.setString(1, studentID);
                    insertStatement.setInt(2, sdn);
                    insertStatement.setDate(3, sqlDate1);
                    insertStatement.setDate(4, sqlDate2);
                    insertStatement.setString(5, bookID);
                    int rowsAffected = insertStatement.executeUpdate();
                    insertStatement.close();

                    if (rowsAffected > 0) {
                        // Update the available column in the unreserved table
                        String updateQuery = "UPDATE unreserved SET available = available - 1 WHERE bookid = ?";
                        PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
                        updateStatement.setString(1, bookID);
                        updateStatement.executeUpdate();
                        updateStatement.close();

                        // Display success message
                        JOptionPane.showMessageDialog(this, "Book issued successfully!");

                        // Refresh the book table with the current data from unreserved
                        String selectQuery = "SELECT bookid, bookname, coursecode, author, available, imageupload FROM unreserved";
                        PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
                        ResultSet selectResult = selectStatement.executeQuery();

                        DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
                        model.setRowCount(0); // Clear the existing rows

                        while (selectResult.next()) {
                            String bookIDValue = selectResult.getString("bookid");
                            String bookNameValue = selectResult.getString("bookname");
                            String courseCodeValue = selectResult.getString("coursecode");
                            String authorValue = selectResult.getString("author");
                            int availableValue = selectResult.getInt("available");
                            byte[] imageData = selectResult.getBytes("imageupload");

                            ImageIcon imageIcon = new ImageIcon(imageData);
                            Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                            ImageIcon scaledImageIcon = new ImageIcon(image);

                            model.addRow(new Object[]{bookIDValue, bookNameValue, courseCodeValue, authorValue, availableValue, scaledImageIcon});
                        }

                        selectResult.close();
                        selectStatement.close();

                        // Clear the student ID and book ID fields
                        studentid.setText("");
                        bookidentered.setText("");
                        date1.setDate(null);
                        date2.setDate(null);
                    } else {
                        // Display error message
                        JOptionPane.showMessageDialog(this, "Failed to issue the book. Please check the book ID and try again.");
                    }
                }
            }
        }

        checkNewResult.close();
        checkNewStatement.close();
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(unreserved.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_issueActionPerformed

    private void txtcoursecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcoursecodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcoursecodeActionPerformed

public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new unreserved().setVisible(true);
            }
        });
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JTextField bookidentered;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JButton displaybutton;
    private javax.swing.JButton issue;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchbooknamebutton;
    private javax.swing.JButton searchcoursecodebutton;
    private javax.swing.JTextField studentid;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtcoursecode;
    // End of variables declaration//GEN-END:variables
}
