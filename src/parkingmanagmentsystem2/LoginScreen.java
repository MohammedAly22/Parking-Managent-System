
package parkingmanagmentsystem2;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LoginScreen extends javax.swing.JFrame {

    public String adminName;
    public String CustomerName;
    public String operatorName;
    
    public int customerId;
    
    public LoginScreen() {
        initComponents(); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        userTypeBtn = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        signUpBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        username.setBackground(new java.awt.Color(51, 0, 102));
        username.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        password.setBackground(new java.awt.Color(51, 0, 102));
        password.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        userTypeBtn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        userTypeBtn.setForeground(new java.awt.Color(51, 0, 102));
        userTypeBtn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Customer", "Operator" }));
        userTypeBtn.setBorder(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/users.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/pass.png"))); // NOI18N

        loginBtn.setBackground(new java.awt.Color(0, 153, 102));
        loginBtn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setBorder(null);
        loginBtn.setBorderPainted(false);
        loginBtn.setFocusPainted(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        signUpBtn.setBackground(new java.awt.Color(51, 0, 102));
        signUpBtn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        signUpBtn.setText("SignUp");
        signUpBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Type");

        ExitBtn.setBackground(new java.awt.Color(255, 0, 102));
        ExitBtn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExitBtn.setText("Exit");
        ExitBtn.setBorder(null);
        ExitBtn.setBorderPainted(false);
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userTypeBtn, 0, 250, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel5))
                            .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel2)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTypeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 102));
        jLabel6.setText("PARKING GUIDANCE");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setText("SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel7)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure to close application?", "Warning Message", JOptionPane.YES_NO_OPTION);
        if(choice == 0)
            System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        try {
            int count = 0;
            String uname = username.getText();
            String pass = password.getText();
            //0=>admin || 1=>customer || 2=>operator
            int user = userTypeBtn.getSelectedIndex();
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkingSystem", "root", "");
            // select from admins
            Statement st = c.createStatement();
            // select from customers
            Statement st2 = c.createStatement();
            Statement st4 = c.createStatement();
            // select from operators
            Statement st3 = c.createStatement();
            //select from admins table from database where username matches thr entered database and password matches the entered password
            String sql = "select count(1) from admins where username = '"+uname+"' and password = '"+pass+"' ";
            ResultSet rs =  st.executeQuery(sql);
            //select from customers table from database where username matches thr entered database and password matches the entered password
            String sql2 = "select count(1) from customers where username = '"+uname+"' and password = '"+pass+"' ";
            ResultSet rs2 = st2.executeQuery(sql2);
            //select from operators table from database where username matches thr entered database and password matches the entered password
            String sql3 = "select count(1) from operators where username = '"+uname+"' and password = '"+pass+"' ";
            ResultSet rs3 = st3.executeQuery(sql3);
            switch(user){
                //case 0 => admin
                case 0:
                    while(rs.next()){
                        count = rs.getInt("count(1)");
                    }
                    if(count == 1){   
                        adminName = uname;
                        AdminMenu.setAdminName(adminName);
                        AdminMenu am = new AdminMenu();
                        am.show();
                        this.dispose();
                    }else
                        JOptionPane.showMessageDialog(null, "Invalid username or password for an Admin" , "Error Message" , JOptionPane.ERROR_MESSAGE);
                    break;
                //case 1 => customer    
                case 1:
                    while(rs2.next()){
                        count = rs2.getInt("count(1)");
                    }
                    if(count == 1){
                        String query = "select * from customers where username = '"+uname+"'";
                        ResultSet rs4 = st4.executeQuery(query);
                        while(rs4.next()){
                            customerId = rs4.getInt("id");
                            parkingReservationForm.setCustomerId(customerId);
                        }
                        CustomerName = uname;
                        CustomerMenu.setCustomerName(CustomerName);
                        CustomerMenu cm = new CustomerMenu();
                        cm.show();
                        this.dispose();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Invalid username or password for a Customer" , "Error Message" , JOptionPane.ERROR_MESSAGE);
                    break;
                //case 2 => operator
                case 2:
                    while(rs3.next()){
                        count = rs3.getInt("count(1)");
                    }
                    if(count == 1){
                        operatorName = uname;
                        OperatorMenu.setOperatorName(operatorName);
                        OperatorMenu om = new OperatorMenu();
                        om.show();
                        this.dispose();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Invalid username or password for an Operator" , "Error Message" , JOptionPane.ERROR_MESSAGE);
                    break;  
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        SignupScreen sp = new SignupScreen();
        sp.show();
        this.dispose();
    }//GEN-LAST:event_signUpBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JComboBox<String> userTypeBtn;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
