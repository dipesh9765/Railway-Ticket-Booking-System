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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Railway.Login_info;
import java.util.Map;

/**
 *
 * @author HP
 */
public final class Main extends javax.swing.JFrame {

    static String an;
    public int dist = 0;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        Connect();
        LoadStart();
        LoadEnd();
    }

    Main(String Admin) {
        System.out.println(Admin);
        this.an = Admin;
        initComponents();
        Connect();
        LoadStart();
        LoadEnd();
        UserName.removeAll();
        UserName.setText(String.valueOf(an));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        insertV = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        trainName = new javax.swing.JLabel();
        trainNo = new javax.swing.JTextField();
        classS = new javax.swing.JComboBox<>();
        fromCombo = new javax.swing.JComboBox<>();
        endC = new javax.swing.JComboBox<>();
        total = new javax.swing.JLabel();
        NoP = new javax.swing.JTextField();
        price = new javax.swing.JLabel();
        dateC = new com.toedter.calendar.JDateChooser();
        UserName = new javax.swing.JLabel();
        UserName1 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel1.setText("Railway Reservation System");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel2.setText("Train No. ");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel3.setText("Train Name ");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel4.setText("From");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel5.setText("To");

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel6.setText("Class");

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel7.setText("Date");

        insertV.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        insertV.setText("INSERT");
        insertV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertVActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel8.setText("Price");

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel9.setText("No. of Passenger");

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel10.setText("TotalAmount ");

        trainName.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        trainName.setText(" ");

        trainNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                trainNoFocusLost(evt);
            }
        });
        trainNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainNoActionPerformed(evt);
            }
        });

        classS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "2S", "SL", "3AC", "1AC" }));
        classS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                classSFocusLost(evt);
            }
        });
        classS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classSActionPerformed(evt);
            }
        });

        total.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        total.setText("Total Amount");

        price.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        price.setText("Price");

        dateC.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trainNo)
                    .addComponent(dateC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NoP)
                    .addComponent(fromCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(endC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(insertV, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NoP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(trainNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(trainName)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fromCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(endC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(classS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total)
                    .addComponent(jLabel10))
                .addGap(48, 48, 48)
                .addComponent(insertV)
                .addGap(29, 29, 29))
        );

        UserName.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        UserName.setText("::");

        UserName1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        UserName1.setText("Username :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserName1)
                    .addComponent(UserName))
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertVActionPerformed
        // TODO add your handling code here:
        int pnr = 0;
        String noOfPass = NoP.getText();
        String train_no = trainNo.getText();
        String date = ((JTextField) dateC.getDateEditor().getUiComponent()).getText();
        String totalPrice = total.getText();
        try {
            pat = con.prepareStatement("INSERT INTO `passenger` (`PNR`, `train_name`, "
                    + "`train_no`, `startPlace`, `destination`, `NoPassenger`, `Date`, `TotalPrice`) "
                    + "VALUES (NULL, '', ?, '', '', ?, ?, ?);");
            pat.setString(1, train_no);
            pat.setString(2, noOfPass);
            pat.setString(3, date);
            pat.setString(4, totalPrice);

            pat.execute();

            pat = con.prepareStatement("SELECT PNR FROM passenger ORDER BY PNR DESC LIMIT 1");
            rs = pat.executeQuery();
            while (rs.next()) {
                pnr = rs.getInt(1);
            }

            System.out.println(pnr);

            this.hide();
            new Ticket(an, pnr).setVisible(true);

        } catch (SQLException ex) {

            Logger.getLogger(Cancel.class.getName()).log(Level.SEVERE, null, ex);
            //  JOptionPane.showMessageDialog(null, "Enter proper Values");
        }
    }//GEN-LAST:event_insertVActionPerformed

    private void trainNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_trainNoFocusLost
        // TODO add your handling code here:
        //        String train_no = trainNo.getSelectedText();
        String train_no = trainNo.getText();
        try {
            trainName.removeAll();
            pat = con.prepareStatement("Select * from trains Where train_no = ? ");
            pat.setString(1, train_no);
            rs = pat.executeQuery();

            System.out.println("This is Output");
            while (rs.next()) {
                trainName.setText(rs.getString(2));
                fromCombo.getModel().setSelectedItem(rs.getString(3));
                endC.getModel().setSelectedItem(rs.getString(4));
                dist = Integer.parseInt(rs.getString(5));
                System.out.println("Distance : " + dist);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_trainNoFocusLost

    private void trainNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trainNoActionPerformed

    private void classSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_classSFocusLost
        // TODO add your handling code here:
        price.removeAll();
        total.removeAll();
        String s = (String) classS.getSelectedItem();
        int pass = Integer.parseInt(NoP.getText());
        int Price = getPrice(s, dist);

        price.setText(Integer.toString(Price));
        int totalP = Price * pass;
        System.out.println(totalP);
        total.setText(Integer.toString(totalP));
    }//GEN-LAST:event_classSFocusLost

    private void classSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classSActionPerformed

    private int getPrice(String s, int d) {
        double calcPrice = d;
        double _2s = 0.35, sl = 0.60, _3ac = 1.58, _1ac = 3.73;
        if (null != s) {
            switch (s) {
                case "2S" ->
                    calcPrice = d * _2s;
                case "SL" ->
                    calcPrice = d * sl;
                case "3AC" ->
                    calcPrice = d * _3ac;
                case "1AC" ->
                    calcPrice = d * _1ac;
                default ->
                    JOptionPane.showMessageDialog(this, "Please Select the class ");
            }
        } else {
            //        Select Class, 2S, SL, 3AC, 1AC
            JOptionPane.showMessageDialog(this, "Please Select the class ");
        }

        return (int) calcPrice;
    }
    /**
     * @param args the command line arguments
     */
//    Connecting SQL Database;
    Connection con;
    PreparedStatement pat;
    ResultSet rs, ps, ds;

    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "Royal@9765");
            System.out.println("Connected securely");

//            getUsername.setText(getUser.get());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void LoadStart() {
        try {
            pat = con.prepareStatement("Select startPlace  from trains");
            rs = pat.executeQuery();
            fromCombo.removeAll();

            while (rs.next()) {
                fromCombo.addItem(rs.getString(1));
            }

        } catch (SQLException e) {
        }

    }

    public void LoadEnd() {
        try {

            pat = con.prepareStatement("Select destination  from trains");
            rs = pat.executeQuery();
            endC.removeAll();
            while (rs.next()) {
                endC.addItem(rs.getString(1));
            }

        } catch (SQLException e) {
        }

    }

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
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NoP;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel UserName1;
    private javax.swing.JComboBox<String> classS;
    private com.toedter.calendar.JDateChooser dateC;
    private javax.swing.JComboBox<String> endC;
    private javax.swing.JComboBox<String> fromCombo;
    private javax.swing.JButton insertV;
    private com.toedter.calendar.JCalendar jCalendar1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel price;
    private javax.swing.JLabel total;
    private javax.swing.JLabel trainName;
    private javax.swing.JTextField trainNo;
    // End of variables declaration//GEN-END:variables
}
