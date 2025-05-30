/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProductReports;

import billing.DbCon;
import billing.Demo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


/**
 *
 * @author HP
 */
public class ProductReports extends javax.swing.JFrame {

    /**
     * Creates new form ProductReports
     */
    public ProductReports() {
        initComponents();
        //showData("", "");
    }
    
    public void showData(String d1, String d2){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billingsys", "root", "Password@123");
            PreparedStatement pst;
           
              if(d1.equals("") || d2.equals(""))
            {
                 pst=con.prepareStatement("Select * from `billingsys`.`product1` ");
                 
            }
                else if(d1.equals(d2)){
                     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billingsys", "root", "Password@123");
                     pst = con.prepareStatement("SELECT * FROM `billingsys`.`product1` WHERE Time = ?");
                     pst.setString(1, d1);
                     
                }
                else{
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billingsys", "root", "Password@123");
              pst = con.prepareStatement("SELECT * FROM `billingsys`.`product1` WHERE Time BETWEEN ? AND ?");
                   pst.setString(1, d1);
                pst.setString(2, d2); 
            }
            
             
              ResultSet rs=pst.executeQuery();  
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                 Object[] row;
               while(rs.next()){
                   row = new Object[8];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                  

//                String tbData[]={ProdID,Modelno,Productname,Companyname,ProductRate,ProductDesc,Stock,date};
//                DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
                model.addRow(row);
               }
              
            
     
        }catch(Exception e){System.out.print(e);}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Electronic Device Billing System");
        jLabel1.setAlignmentX(100.0F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 46, 691, -1));

        jLabel20.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Product Reports");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 123, 235, 45));

        jButton1.setText("Genrate Reports");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 151, 45));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Model Number", "Product Name", "Company Name", "Product Rate", "Product Description", "Product Stock", "Date "
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 941, 354));

        jButton2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 750, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 140, 40));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 140, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg-form.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//       java.util.Date fromDateUtil = jDateChooser1.getDate();
//      java.util.Date toDateUtil = jDateChooser2.getDate();
//       DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String fromDate = dateFormat.format(fromDateUtil);
//        String toDate = dateFormat.format(toDateUtil);
//   
//        try{
//            
//            String q = "SELECT * FROM `billingsys`.`product1` WHERE Time BETWEEN ? AND ?";
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billingsys", "root", "Password@123");
//              PreparedStatement pst = con.prepareStatement(q);
//              pst.setString(1, fromDate);
//              pst.setString(2, toDate);
//              ResultSet rs = pst.executeQuery();
//               DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//               model.setRowCount(0); // Clear existing rows
//
//            while(rs.next()){
//                String ProdID = rs.getString(1);
//                String Modelno = rs.getString(2);
//                String Productname = rs.getString(3);
//                String Companyname = rs.getString(4);
//                String ProductRate = rs.getString(5);
//                String ProductDesc = rs.getString(6);
//                String Stock = rs.getString(7);
//                String date = rs.getString(8);
//                  
//
//                String tbData[]={ProdID,Modelno,Productname,Companyname,ProductRate,ProductDesc,Stock,date};
//                DefaultTableModel tbm=(DefaultTableModel)jTable1.getModel();
//                tbm.addRow(tbData);
//                
//
//            }
//             
//        }catch (SQLException e) { // Print the stack trace to identify the issue
//         // Print the stack trace to identify the issue
//    JOptionPane.showMessageDialog(null, "SQL Exception: " + e.getMessage());
//} catch (Exception e) { // Print the stack trace to identify the issue
//         // Print the stack trace to identify the issue
//    JOptionPane.showMessageDialog(null, "Exception: " + e.getMessage());
//}
//

        try{
            
            jTable1.setModel(new DefaultTableModel(null, new Object[]{"ProdID","Modelno","Productname","Companyname","ProductRate","ProductDesc","Stock","date"}));
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String date1 = df.format(jDateChooser1.getDate());
            String date2 = df.format(jDateChooser2.getDate());
            
            showData(date1, date2);
            
        }catch(Exception e){
            
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Demo().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
