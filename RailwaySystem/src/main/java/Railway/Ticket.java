/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Railway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public final class Ticket extends javax.swing.JFrame {

    String admin;
    int F_pnr;

    /**
     * Creates new form Ticket
     */
    public Ticket() {
        initComponents();

        Connect();
        setValues();
    }

    Ticket(String an, int pnr) {
        this.admin = an;
        this.F_pnr = pnr;
        initComponents();
        Connect();
        setValues();
        UName.removeAll();
        UName.setText(an);
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
        jLabel2 = new javax.swing.JLabel();
        T_PNR = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        T_from = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        T_to = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        T_Date = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        T_NoP = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        T_Price = new javax.swing.JLabel();
        T_cancel = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        T_trainName = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        T_trainNO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel1.setText("Ticket");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel2.setText("PNR No.");

        T_PNR.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        T_PNR.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel4.setText("From");

        T_from.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        T_from.setText("jLabel3");

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel6.setText("To");

        T_to.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        T_to.setText("jLabel3");

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel8.setText("No of Passenger");

        T_Date.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        T_Date.setText("jLabel3");

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel10.setText("Date");

        T_NoP.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        T_NoP.setText("jLabel3");

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel12.setText("Total Price");

        T_Price.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        T_Price.setText("jLabel3");

        T_cancel.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        T_cancel.setText("Cancel");
        T_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_cancelActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jButton2.setText("Continue");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel14.setText("Train Name");

        T_trainName.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        T_trainName.setText("jLabel3");

        jLabel16.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel16.setText("Train No");

        T_trainNO.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        T_trainNO.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel3.setText("Username: ");

        UName.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        UName.setText(" ::");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(T_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T_from, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T_NoP, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T_PNR, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T_trainNO, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T_to, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T_trainName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(T_NoP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(T_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(T_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_cancel)
                            .addComponent(jButton2))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(T_trainNO)
                        .addGap(18, 18, 18)
                        .addComponent(T_trainName)
                        .addGap(18, 18, 18)
                        .addComponent(T_PNR)
                        .addGap(18, 18, 18)
                        .addComponent(T_from, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_to, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_cancelActionPerformed
        // TODO add your handling code here:
        this.hide();
        new Cancel(admin).setVisible(true);

    }//GEN-LAST:event_T_cancelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
        new Main(admin).setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

//    set Values
    private void setValues() {
        String s = String.valueOf(F_pnr);
        try {
            pat = con.prepareStatement("Select * from passenger where PNR =  " + s);
            rs = pat.executeQuery();
            T_PNR.removeAll();
            T_trainNO.removeAll();
            T_trainName.removeAll();
            T_from.removeAll();
            T_to.removeAll();
            T_NoP.removeAll();
            T_Date.removeAll();
            T_Price.removeAll();

            while (rs.next()) {
                T_PNR.setText(rs.getString(1));
                T_trainName.setText(rs.getString(2));
                T_trainNO.setText(rs.getString(3));
                T_from.setText(rs.getString(4));
                T_to.setText(rs.getString(5));
                T_NoP.setText(rs.getString(6));
                T_Date.setText(rs.getString(7));
                T_Price.setText(rs.getString(8));

            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    Connection con;
    PreparedStatement pat;
    ResultSet rs;

    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "Royal@9765");
            System.out.println("Connected securely");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel T_Date;
    private javax.swing.JLabel T_NoP;
    private javax.swing.JLabel T_PNR;
    private javax.swing.JLabel T_Price;
    private javax.swing.JButton T_cancel;
    private javax.swing.JLabel T_from;
    private javax.swing.JLabel T_to;
    private javax.swing.JLabel T_trainNO;
    private javax.swing.JLabel T_trainName;
    private javax.swing.JLabel UName;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
