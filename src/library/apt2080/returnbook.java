/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.apt2080;


import java.awt.Component;
import javax.swing.JButton;

import java.awt.Image;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
public class returnbook extends javax.swing.JFrame {

    /**
     * Creates new form AdminAllbookDetails
     */
    private int selectedRow;
    private String selectedImagePath;
    String filename=null;
    byte[] person_image=null;
    public returnbook() {
        initComponents();
        displayAllIssuedBooks();
       
    customizeComponents();
    }
    
    // Add these getter methods in the returnbook class

public JButton getJButton1() {
    return jButton1;
}

public JButton getReturnb() {
    return returnb;
}

public JButton getSearch() {
    return search;
}

public JButton getDisplayall() {
    return displayall;
}

private void customizeComponents() {
        
        jButton1.setBackground(java.awt.Color.WHITE);
         search.setBackground(java.awt.Color.WHITE);
         displayall.setBackground(java.awt.Color.WHITE);
         returnb.setBackground(java.awt.Color.WHITE);
          
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        newstudentid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        newbookid = new javax.swing.JTextField();
        newsdn = new javax.swing.JTextField();
        returnb = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        newstudentid1 = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        displayall = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BOOK ID", "BOOK NAME", "COURSE CODE", "AUTHOR", "IMAGE", "STUDENT ID", "SDN", "ISSUE DATE", "RETURN DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Byte.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setBounds(13, 255, 850, 270);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\3545435 (2).png")); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(870, 500, 90, 23);

        jLabel2.setText("STUDENT ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 50, 110, 30);
        getContentPane().add(newstudentid);
        newstudentid.setBounds(680, 50, 110, 40);

        jLabel3.setText("BOOK ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 100, 80, 20);

        jLabel5.setText("SDN:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(560, 140, 60, 20);
        getContentPane().add(newbookid);
        newbookid.setBounds(680, 100, 110, 40);

        newsdn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsdnActionPerformed(evt);
            }
        });
        getContentPane().add(newsdn);
        newsdn.setBounds(680, 150, 110, 30);

        returnb.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\return book (1).png")); // NOI18N
        returnb.setText("RETURN");
        returnb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbActionPerformed(evt);
            }
        });
        getContentPane().add(returnb);
        returnb.setBounds(830, 170, 150, 70);

        jLabel6.setText("DATE RETURNED:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 190, 120, 30);
        getContentPane().add(date1);
        date1.setBounds(680, 190, 130, 30);

        jLabel7.setText("SEARCH BY:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(137, 40, 160, 38);

        jLabel8.setText("STUDENT ID:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 100, 100, 29);
        getContentPane().add(newstudentid1);
        newstudentid1.setBounds(160, 100, 71, 22);

        search.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\search (2) (1).png")); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(250, 100, 150, 29);

        displayall.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\display (2).png")); // NOI18N
        displayall.setText("DISPLAY ALL ISSUED BOOKS");
        displayall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayallActionPerformed(evt);
            }
        });
        getContentPane().add(displayall);
        displayall.setBounds(88, 169, 262, 29);

        jLabel9.setText("OR");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(184, 141, 40, 16);

        jLabel10.setFont(new java.awt.Font("Rockwell Nova Light", 0, 24)); // NOI18N
        jLabel10.setText("RETURN A BOOK");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(310, 10, 350, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\background (1).jpg")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-13, -24, 1270, 720);

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



private void displayAllIssuedBooks() {
        DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
        model.setRowCount(0);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
            String query = "SELECT * FROM issued";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String bookID = rs.getString("bookid");
                String bookName = rs.getString("bookname");
                String courseCode = rs.getString("coursecode");
                String author = rs.getString("author");
                byte[] imageData = rs.getBytes("imageupload");
                String studentID = rs.getString("studentid");
                int sdn = rs.getInt("sdn");
                Date issueDate = rs.getDate("issuedate");
            Date returnDate = rs.getDate("returndate");

                ImageIcon imageIcon = new ImageIcon(imageData);
                Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon scaledImageIcon = new ImageIcon(image);

                model.addRow(new Object[]{bookID, bookName, courseCode, author, scaledImageIcon, studentID, sdn,issueDate, returnDate});
            }

            rs.close();
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(returnbook.class.getName()).log(Level.SEVERE, null, ex);
        }

        selectedImagePath = null; // Reset the selected image path
        bookTable.getColumnModel().getColumn(4).setCellRenderer(new ImageTableCellRenderer());
    }

    




    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = bookTable.getSelectedRow();
    if (selectedRowIndex >= 0) {
        DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
        newstudentid.setText(model.getValueAt(selectedRowIndex, 5).toString());
        newbookid.setText(model.getValueAt(selectedRowIndex, 0).toString());
        newsdn.setText(model.getValueAt(selectedRowIndex, 6).toString());
    }
   
    }//GEN-LAST:event_bookTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Adminfirstpageregister adminfirstpage=new Adminfirstpageregister();
        adminfirstpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void returnbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbActionPerformed
        // TODO add your handling code here:
      String studentID = newstudentid.getText();
        String bookID = newbookid.getText();
        int sdn = Integer.parseInt(newsdn.getText());
        java.util.Date selectedDate = date1.getDate();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");

            // Check if the issued book exists with the provided details
            String checkQuery = "SELECT * FROM issued WHERE studentid = ? AND bookid = ? AND sdn = ?";
            PreparedStatement checkStatement = conn.prepareStatement(checkQuery);
            checkStatement.setString(1, studentID);
            checkStatement.setString(2, bookID);
            checkStatement.setInt(3, sdn);
            ResultSet checkResult = checkStatement.executeQuery();

            if (checkResult.next()) {
                // Book found, update the unreserved table and delete the entry from the issued table

                // Update the available column in the unreserved table
                String updateQuery = "UPDATE unreserved SET available = available + 1 WHERE bookid = ?";
                PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
                updateStatement.setString(1, bookID);
                updateStatement.executeUpdate();
                updateStatement.close();

                // Delete the entry from the issued table
                String deleteQuery = "DELETE FROM issued WHERE studentid = ? AND bookid = ? AND sdn = ?";
                PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);
                deleteStatement.setString(1, studentID);
                deleteStatement.setString(2, bookID);
                deleteStatement.setInt(3, sdn);
                int rowsAffected = deleteStatement.executeUpdate();
                deleteStatement.close();

                if (rowsAffected > 0) {
                    // Book returned successfully
                    JOptionPane.showMessageDialog(this, "Book successfully returned!");

                    // Insert the returned book details into the "returned" table
                    String insertQuery = "INSERT INTO returned (bookid, bookname, coursecode, author, imageupload, studentid, sdn, issuedate, returndate, datereturned) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
                    insertStatement.setString(1, bookID);
                    insertStatement.setString(2, checkResult.getString("bookname"));
                    insertStatement.setString(3, checkResult.getString("coursecode"));
                    insertStatement.setString(4, checkResult.getString("author"));
                    insertStatement.setBytes(5, checkResult.getBytes("imageupload"));
                    insertStatement.setString(6, studentID);
                    insertStatement.setInt(7, sdn);
                    insertStatement.setDate(8, checkResult.getDate("issuedate"));
                    insertStatement.setDate(9, checkResult.getDate("returndate"));
                    insertStatement.setDate(10, new java.sql.Date(selectedDate.getTime()));
                    insertStatement.executeUpdate();
                    insertStatement.close();
                    
                    
                    // Insert the returned book details into the "returnednew" table
    String insertQueryNew = "INSERT INTO returnednew (bookid, bookname, coursecode, author, imageupload, sdn) VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement insertStatementNew = conn.prepareStatement(insertQueryNew);
    insertStatementNew.setString(1, bookID);
    insertStatementNew.setString(2, checkResult.getString("bookname"));
    insertStatementNew.setString(3, checkResult.getString("coursecode"));
    insertStatementNew.setString(4, checkResult.getString("author"));
    insertStatementNew.setBytes(5, checkResult.getBytes("imageupload"));
    insertStatementNew.setInt(6, sdn);
    insertStatementNew.executeUpdate();
    insertStatementNew.close();
     displayAllIssuedBooks();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to return the book. Please check the student ID, book ID, and SDN.");
                }
            } else {
                // Book not found with the provided details
                JOptionPane.showMessageDialog(this, "There is no issued book with the provided details.");
            }

            // Check if the returned date is after the return date
            java.sql.Date returnDate = checkResult.getDate("returndate");
            if (selectedDate.after(returnDate)) {
                // Fine needs to be paid
                JOptionPane.showMessageDialog(this, "Fine needs to be paid.");
            }

            checkResult.close();
            checkStatement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(returnbook.class.getName()).log(Level.SEVERE, null, ex);
        }

        newstudentid.setText("");
        newbookid.setText("");
        newsdn.setText("");
        date1.setDate(null);
    }//GEN-LAST:event_returnbActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String studentID = newstudentid1.getText();
    displayIssuedBooksByStudentID(studentID);
    newstudentid1.setText("");
    }//GEN-LAST:event_searchActionPerformed

    private void displayallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayallActionPerformed
        // TODO add your handling code here:
         displayAllIssuedBooks();
    }//GEN-LAST:event_displayallActionPerformed

    private void newsdnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newsdnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newsdnActionPerformed
private void displayIssuedBooksByStudentID(String studentID) {
    DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
    model.setRowCount(0);

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
        String query = "SELECT * FROM issued WHERE studentid = ?";
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setString(1, studentID);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            String bookID = rs.getString("bookid");
            String bookName = rs.getString("bookname");
            String courseCode = rs.getString("coursecode");
            String author = rs.getString("author");
            byte[] imageData = rs.getBytes("imageupload");
            int sdn = rs.getInt("sdn");
            Date issueDate = rs.getDate("issuedate");
            Date returnDate = rs.getDate("returndate");

            ImageIcon imageIcon = new ImageIcon(imageData);
            Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon scaledImageIcon = new ImageIcon(image);

            model.addRow(new Object[]{bookID, bookName, courseCode, author, scaledImageIcon, studentID, sdn, issueDate, returnDate});
        }

        rs.close();
        statement.close();
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(returnbook.class.getName()).log(Level.SEVERE, null, ex);
    }

    selectedImagePath = null; // Reset the selected image path
    bookTable.getColumnModel().getColumn(4).setCellRenderer(new ImageTableCellRenderer());
}
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnbook().setVisible(true);
            }
        });
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private com.toedter.calendar.JDateChooser date1;
    private javax.swing.JButton displayall;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField newbookid;
    private javax.swing.JTextField newsdn;
    private javax.swing.JTextField newstudentid;
    private javax.swing.JTextField newstudentid1;
    private javax.swing.JButton returnb;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
