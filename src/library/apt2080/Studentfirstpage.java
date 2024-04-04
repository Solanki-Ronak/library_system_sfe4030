/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


package library.apt2080;
import javax.swing.ImageIcon;

import java.awt.Component;
import java.awt.Image;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author ronak
 */
public class Studentfirstpage extends javax.swing.JFrame {

    /**
     
     */
    private String selectedImagePath;
    public Studentfirstpage(String studentId) {
        initComponents();
        
        studentidnew.setText(studentId); 
        studentidnew.setEditable(false);
        studentidnew.setOpaque(false);
        displayReservedBooks();
        displayIssuedBooks();
        customizeComponents();
        
        
       
     }
private void customizeComponents() {
        
        jButton1.setBackground(java.awt.Color.WHITE);
        jButton2.setBackground(java.awt.Color.WHITE);
         delete.setBackground(java.awt.Color.WHITE);
         
        
        
    }

    private void displayIssuedBooks() {
    DefaultTableModel model = (DefaultTableModel) bookstaken.getModel();
    model.setRowCount(0);

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");

         String query = "SELECT * FROM issued WHERE studentid = ?";
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setString(1, studentidnew.getText());
        ResultSet rs = statement.executeQuery();

        boolean showMessage = true;
        StringBuilder message = new StringBuilder();

        while (rs.next()) {
            String bookID = rs.getString("bookid");
            String bookName = rs.getString("bookname");
            String courseCode = rs.getString("coursecode");
            String author = rs.getString("author");
            String SDN = rs.getString("sdn");
            String issueDate = rs.getString("issuedate");
            String returnDate = rs.getString("returndate");
            byte[] imageData = rs.getBytes("imageupload");

            ImageIcon imageIcon = new ImageIcon(imageData);
            Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon scaledImageIcon = new ImageIcon(image);
            long daysLeft = calculateDaysLeft(returnDate);
            int daysLeft1 = (int) (daysLeft + 1);

            if (daysLeft1 < 11) {
                message.append("Book ID: ").append(bookID).append(" and SDN: ").append(SDN)
                        .append(" needs to be returned. Days Left: ").append(daysLeft1).append("\n");
                showMessage = false;
            }

            model.addRow(new Object[]{bookID, bookName, courseCode, author, SDN, issueDate, returnDate, scaledImageIcon, daysLeft1});
        }
        
        // Sort the table based on daysleft1 column in ascending order
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        sorter.setComparator(8, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        bookstaken.setRowSorter(sorter);
        bookstaken.getRowSorter().toggleSortOrder(8);

        rs.close();
        statement.close();
        conn.close();

        if (!showMessage) {
            JOptionPane.showMessageDialog(null, message.toString());
        }

    } catch (SQLException ex) {
        Logger.getLogger(Studentfirstpage.class.getName()).log(Level.SEVERE, null, ex);
    }

    selectedImagePath = null; // Reset the selected image path
    bookstaken.getColumnModel().getColumn(7).setCellRenderer(new Studentfirstpage.ImageTableCellRenderer());
}


    public class ImageTableCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (value instanceof ImageIcon) {
            ImageIcon imageIcon = (ImageIcon) value;
            Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon scaledImageIcon = new ImageIcon(image);
            setIcon(scaledImageIcon);
            setText("");  // Set the text to an empty string for ImageIcon values
        } else {
            setIcon(null);
        }
        return cellComponent;
    }
}
    
    
    private void displayReservedBooks() {
     DefaultTableModel model = (DefaultTableModel) reservetable.getModel();
    model.setRowCount(0);

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");

         String query = "SELECT * FROM reserved WHERE studentid = ?";
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setString(1, studentidnew.getText());
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            String bookID = rs.getString("bookid");
            String bookName = rs.getString("bookname");
            String courseCode = rs.getString("coursecode");
            String author = rs.getString("author");
            byte[] imageData = rs.getBytes("imageupload");

            ImageIcon imageIcon = new ImageIcon(imageData);
            Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon scaledImageIcon = new ImageIcon(image);

            model.addRow(new Object[]{bookID, bookName, courseCode, author, scaledImageIcon});
        }

        rs.close();
        statement.close();
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(Studentfirstpage.class.getName()).log(Level.SEVERE, null, ex);
    }
         selectedImagePath = null; // Reset the selected image path
        reservetable.getColumnModel().getColumn(4).setCellRenderer(new Studentfirstpage.ImageTableCellRenderer());
    }

private long calculateDaysLeft(String returnDate) {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try {
        java.util.Date currentDate = new java.util.Date();
        java.util.Date dateToCompare = dateFormat.parse(returnDate);
        
        // Convert the util Dates to sql Dates
        java.sql.Date sqlCurrentDate = new java.sql.Date(currentDate.getTime());
        java.sql.Date sqlDateToCompare = new java.sql.Date(dateToCompare.getTime());

        // Calculate the difference in milliseconds between the two dates
        long differenceMillis = sqlDateToCompare.getTime() - sqlCurrentDate.getTime();
        
        // Convert the difference to days
        long daysLeft = TimeUnit.DAYS.convert(differenceMillis, TimeUnit.MILLISECONDS);
        
        return daysLeft;
    } catch (ParseException ex) {
        // Handle the parse exception if needed
        ex.printStackTrace();
        return 0;
    }
}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookstaken = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        reservetable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        studentidnew = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        bookstaken.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BOOK ID", "BOOK NAME", "COURSE CODE", "AUTHOR", "SDN", "ISSUE DATE", "RETURN DATE", "IMAGE", "DAYS LEFT"
            }
        ));
        bookstaken.setRowHeight(120);
        jScrollPane1.setViewportView(bookstaken);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 56, 941, 195);

        reservetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "BOOK ID", "BOOK NAME", "COURSE CODE", "AUTHOR", "IMAGE"
            }
        ));
        reservetable.setRowHeight(130);
        jScrollPane3.setViewportView(reservetable);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(6, 303, 935, 199);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\booksissued (1).png")); // NOI18N
        jButton1.setText("RESERVE A BOOK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(98, 508, 220, 51);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\log (2).jpg")); // NOI18N
        jButton2.setText("SIGN OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(810, 530, 110, 27);

        jLabel1.setFont(new java.awt.Font("Rockwell Nova Light", 0, 14)); // NOI18N
        jLabel1.setText("BOOKS TAKEN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 30, 120, 20);

        jLabel2.setFont(new java.awt.Font("Rockwell Nova Light", 0, 14)); // NOI18N
        jLabel2.setText("BOOKS RESERVED");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(363, 269, 130, 20);

        jLabel3.setText("STUDENT ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(572, 3, 100, 20);

        studentidnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentidnewActionPerformed(evt);
            }
        });
        getContentPane().add(studentidnew);
        studentidnew.setBounds(704, 0, 71, 22);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(805, 0, 0, 0);

        delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\delete (1).png")); // NOI18N
        delete.setText("DELETE A RESERVED BOOK");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(438, 508, 250, 51);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(896, 15, 0, 0);
        getContentPane().add(pic);
        pic.setBounds(890, 15, 0, 0);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\OneDrive\\Desktop\\2.3\\APT2080\\images\\background (1).jpg")); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-3, -4, 1050, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Firstpage firstpage=new Firstpage();
        firstpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Studentreserveee studentreservebook = new Studentreserveee(studentidnew.getText());
    studentreservebook.setVisible(true);
    dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void studentidnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentidnewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentidnewActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
Studentdeletereserved studentreservebook = new Studentdeletereserved(studentidnew.getText());
    studentreservebook.setVisible(true);
    dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Studentfirstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studentfirstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studentfirstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studentfirstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String studentId = ""; // Set a default value if needed
                Studentfirstpage studentFirstPage = new Studentfirstpage(studentId);
                studentFirstPage.setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookstaken;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel pic;
    private javax.swing.JTable reservetable;
    private javax.swing.JTextField studentidnew;
    // End of variables declaration//GEN-END:variables
}
