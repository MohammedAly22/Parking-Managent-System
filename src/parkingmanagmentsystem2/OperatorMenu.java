
package parkingmanagmentsystem2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class OperatorMenu extends javax.swing.JFrame {

    static String n;//represents operator name
    public int[] nums = new int[20];//array to save number of cars reseved
    
    public OperatorMenu() {
        initComponents();
    }
    
    public static void setOperatorName(String name){
        n = name;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ViewReservedSlotsBtn = new javax.swing.JButton();
        CalcMoneyBtn = new javax.swing.JButton();
        Logoutbtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));

        ViewReservedSlotsBtn.setBackground(new java.awt.Color(51, 0, 102));
        ViewReservedSlotsBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ViewReservedSlotsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ViewReservedSlotsBtn.setText("View Reserved Slots");
        ViewReservedSlotsBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ViewReservedSlotsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewReservedSlotsBtnActionPerformed(evt);
            }
        });

        CalcMoneyBtn.setBackground(new java.awt.Color(255, 204, 0));
        CalcMoneyBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CalcMoneyBtn.setForeground(new java.awt.Color(255, 255, 255));
        CalcMoneyBtn.setText("Calculate Money");
        CalcMoneyBtn.setBorder(null);
        CalcMoneyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcMoneyBtnActionPerformed(evt);
            }
        });

        Logoutbtn.setBackground(new java.awt.Color(255, 0, 51));
        Logoutbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        Logoutbtn.setText("Logout");
        Logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutbtnActionPerformed(evt);
            }
        });

        ExitBtn.setBackground(new java.awt.Color(255, 255, 255));
        ExitBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ExitBtn.setForeground(new java.awt.Color(255, 0, 51));
        ExitBtn.setText("Exit");
        ExitBtn.setBorder(null);
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome,");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText(n);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CalcMoneyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewReservedSlotsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addComponent(ViewReservedSlotsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(CalcMoneyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure to close application? ", "Confirmation Message", JOptionPane.YES_NO_OPTION);
        if(choice == 0)
            System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void LogoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutbtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure to logout? " , "Confirmation Message" , JOptionPane.YES_NO_OPTION);
        if(choice == 0){
            LoginScreen ls = new LoginScreen();
            ls.show();
            this.dispose();
        }
    }//GEN-LAST:event_LogoutbtnActionPerformed

    private void ViewReservedSlotsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewReservedSlotsBtnActionPerformed
        try {
            int i = 0;
            int num = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkingSystem", "root", "");
            Statement stt = c.createStatement();
            String sql = "select * from reservedcars";
            ResultSet r = stt.executeQuery(sql);
            while(r.next()){
                num = r.getInt("carNum");
                nums[i] = num;
                ++i;
            }
            ReservedSlots rs = new ReservedSlots();
            rs.show();
            ReservedSlots.getCarsNumbers(nums ,20);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OperatorMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OperatorMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ViewReservedSlotsBtnActionPerformed

    private void CalcMoneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcMoneyBtnActionPerformed
        MoneyForm mf = new MoneyForm();
        mf.show();
    }//GEN-LAST:event_CalcMoneyBtnActionPerformed

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
            java.util.logging.Logger.getLogger(OperatorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperatorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperatorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperatorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperatorMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcMoneyBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton Logoutbtn;
    private javax.swing.JButton ViewReservedSlotsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
