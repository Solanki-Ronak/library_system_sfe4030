/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.apt2080;


import java.awt.Component;
import java.awt.Image;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author ronak
 */
public class helloissuedbooks extends javax.swing.JFrame {

    /**
     * Creates new form AdminAllbookDetails
     */
    private int selectedRow;
    private String selectedImagePath;
    String filename=null;
    byte[] person_image=null;
    public helloissuedbooks() {
        initComponents();
        displayAllIssuedBooks();
       
      customizeComponents();
    }
private void customizeComponents() {
        
        jButton1.setBackground(java.awt.Color.WHITE);
         displayall.setBackground(java.awt.Color.WHITE);
          search.setBackground(java.awt.Color.WHITE);
        
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
        jLabel3 = new javax.swing.JLabel();
        newstudentid1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        newbookid1 = new javax.swing.JTextField();
        displayall = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
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
        jScrollPane1.setBounds(20, 170, 850, 380);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\3545435 (2).png")); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(880, 530, 100, 23);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("SEARCH BY:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 30, 130, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("STUDENT ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 80, 110, 30);
        getContentPane().add(newstudentid1);
        newstudentid1.setBounds(180, 82, 80, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("OR");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 86, 30, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("BOOK ID:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 70, 80, 50);
        getContentPane().add(newbookid1);
        newbookid1.setBounds(430, 80, 100, 30);

        displayall.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\display (2).png")); // NOI18N
        displayall.setText("DISPLAY ALL ISSUED BOOKS");
        displayall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayallActionPerformed(evt);
            }
        });
        getContentPane().add(displayall);
        displayall.setBounds(130, 128, 290, 30);

        search.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\search (2) (1).png")); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(570, 80, 120, 27);

        jLabel7.setFont(new java.awt.Font("Rockwell Nova Light", 0, 24)); // NOI18N
        jLabel7.setText("ALL ISSUED BOOKS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 0, 230, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\background (1).jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, -44, 1120, 710);

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

                ImageIcon imageIcon = new ImageIcon(imageData);
                Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon scaledImageIcon = new ImageIcon(image);
                String ISSUEDATE = rs.getString("issuedate");
                String RETURNDATE = rs.getString("returndate");

                model.addRow(new Object[]{bookID, bookName, courseCode, author, scaledImageIcon, studentID, sdn,ISSUEDATE,RETURNDATE});
            }

            rs.close();
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(helloissuedbooks.class.getName()).log(Level.SEVERE, null, ex);
        }

        selectedImagePath = null; // Reset the selected image path
        bookTable.getColumnModel().getColumn(4).setCellRenderer(new ImageTableCellRenderer());
    }

    




    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        // TODO add your handling code here:
   
    }//GEN-LAST:event_bookTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Adminfirstpageregister adminfirstpage=new Adminfirstpageregister();
        adminfirstpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void displayallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayallActionPerformed
        // TODO add your handling code here:
        displayAllIssuedBooks();
    }//GEN-LAST:event_displayallActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
String studentID = newstudentid1.getText();
        String bookID1 = newbookid1.getText();
        displayIssuedBooks(studentID, bookID1);
        newstudentid1.setText("");
        newbookid1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed
 private void displayIssuedBooks(String studentID, String bookID1) {
        DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
        model.setRowCount(0);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
            String query = "SELECT * FROM issued WHERE studentid = ? OR bookid = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, studentID);
            statement.setString(2, bookID1);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String bookID = rs.getString("bookid");
                String bookName = rs.getString("bookname");
                String courseCode = rs.getString("coursecode");
                String author = rs.getString("author");
                byte[] imageData = rs.getBytes("imageupload");
                String studentID1 = rs.getString("studentid");
                int sdn = rs.getInt("sdn");
                Date issueDate = rs.getDate("issuedate");
                Date returnDate = rs.getDate("returndate");

                ImageIcon imageIcon = new ImageIcon(imageData);
                Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon scaledImageIcon = new ImageIcon(image);

                model.addRow(new Object[]{bookID, bookName, courseCode, author, scaledImageIcon, studentID1, sdn, issueDate, returnDate});
            }

            rs.close();
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(helloissuedbooks.class.getName()).log(Level.SEVERE, null, ex);
        }

        selectedImagePath = null; // Reset the selected image path
        bookTable.getColumnModel().getColumn(4).setCellRenderer(new ImageTableCellRenderer());
    }
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new helloissuedbooks().setVisible(true);
            }
        });
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JButton displayall;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField newbookid1;
    private javax.swing.JTextField newstudentid1;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
