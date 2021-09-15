
package parkingmanagmentsystem2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminMenu extends javax.swing.JFrame {
    //array to save number of cars reseved
    public int[] nums = new int[20];
    //for passing admin name
    static String admin;
    
    public AdminMenu() {
        initComponents();
    }
    public static void setAdminName(String name){
        admin = name;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AddOpeBtn = new javax.swing.JButton();
        ViewOpeData = new javax.swing.JButton();
        ViewReservedSlots = new javax.swing.JButton();
        ViewAllReservation = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));

        AddOpeBtn.setBackground(new java.awt.Color(255, 255, 255));
        AddOpeBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        AddOpeBtn.setForeground(new java.awt.Color(51, 0, 102));
        AddOpeBtn.setText("Add Operator");
        AddOpeBtn.setBorder(null);
        AddOpeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOpeBtnActionPerformed(evt);
            }
        });

        ViewOpeData.setBackground(new java.awt.Color(255, 255, 255));
        ViewOpeData.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ViewOpeData.setForeground(new java.awt.Color(51, 0, 102));
        ViewOpeData.setText("View Operators Data");
        ViewOpeData.setBorder(null);
        ViewOpeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewOpeDataActionPerformed(evt);
            }
        });

        ViewReservedSlots.setBackground(new java.awt.Color(255, 255, 255));
        ViewReservedSlots.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ViewReservedSlots.setForeground(new java.awt.Color(51, 0, 102));
        ViewReservedSlots.setText("View reserved slots");
        ViewReservedSlots.setBorder(null);
        ViewReservedSlots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewReservedSlotsActionPerformed(evt);
            }
        });

        ViewAllReservation.setBackground(new java.awt.Color(255, 255, 255));
        ViewAllReservation.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ViewAllReservation.setForeground(new java.awt.Color(51, 0, 102));
        ViewAllReservation.setText("View all reservations");
        ViewAllReservation.setBorder(null);
        ViewAllReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllReservationActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(255, 0, 51));
        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.setBorder(null);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Welcome");

        name1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 204, 0));
        name1.setText(admin);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddOpeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ViewOpeData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ViewReservedSlots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ViewAllReservation, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(name))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(name1)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddOpeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(ViewOpeData, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(ViewReservedSlots, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(ViewAllReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure to logout? ", "Concirmation Message",JOptionPane.YES_NO_OPTION);
        if(choice == 0){
            LoginScreen ls = new LoginScreen();
            ls.show();
            this.dispose();
        }     
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void ViewReservedSlotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewReservedSlotsActionPerformed
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
    }//GEN-LAST:event_ViewReservedSlotsActionPerformed

    private void AddOpeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOpeBtnActionPerformed
        AddOperator ao = new AddOperator();
        ao.show();
    }//GEN-LAST:event_AddOpeBtnActionPerformed

    private void ViewOpeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewOpeDataActionPerformed
        try {
            ViewOperatorsData vod = new ViewOperatorsData();
            vod.show();
            Class.forName("com.mysql.jdbc.Driver");
            Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkingSystem", "root", "");
            Statement s = cc.createStatement();
            String sql = "select * from operators";
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                String id = String.valueOf(r.getInt("id"));
                String username = r.getString("username");
                String password = r.getString("password");
                String mobile = r.getString("mobile");
                String address = r.getString("address");
                String tbData[] = {id,username,password,mobile,address};
                DefaultTableModel tbModel = (DefaultTableModel)ViewOperatorsData.opeTable.getModel();
                tbModel.addRow(tbData);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ViewOpeDataActionPerformed

    private void ViewAllReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllReservationActionPerformed
        try {
            ViewResrvationsData vrd = new ViewResrvationsData();
            vrd.show();
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkingSystem", "root", "");
            Statement ss = c.createStatement();
            String sql = "select * from parkingreservation";
            ResultSet r = ss.executeQuery(sql);
            while(r.next()){
                String id = String.valueOf(r.getInt("id"));
                String customerId = String.valueOf(r.getInt("customer_Id"));
                String hours = String.valueOf(r.getInt("hours"));
                String totalPrice = String.valueOf(r.getDouble("totalPrice"));
                String customerSSN = r.getString("customer_ssn");
                String tbData[] = {id,customerId,hours,totalPrice,customerSSN};
                DefaultTableModel tbModel = (DefaultTableModel)ViewResrvationsData.resTable.getModel();
                tbModel.addRow(tbData);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ViewAllReservationActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOpeBtn;
    private javax.swing.JButton ViewAllReservation;
    private javax.swing.JButton ViewOpeData;
    private javax.swing.JButton ViewReservedSlots;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel name;
    public javax.swing.JLabel name1;
    // End of variables declaration//GEN-END:variables
}
