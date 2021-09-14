
package parkingmanagmentsystem2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SignupScreen extends javax.swing.JFrame {

    public SignupScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        userTypeBtn10 = new javax.swing.JComboBox<>();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        signUp = new javax.swing.JButton();
        jLabel95 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        namee = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(51, 0, 102));
        jLabel101.setText("PARKING GUIDANCE");

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(51, 0, 102));
        jLabel100.setText("SYSTEM");

        jPanel13.setBackground(new java.awt.Color(51, 0, 102));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Username");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Password");

        username.setBackground(new java.awt.Color(51, 0, 102));
        username.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        password.setBackground(new java.awt.Color(51, 0, 102));
        password.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        userTypeBtn10.setForeground(new java.awt.Color(51, 0, 102));
        userTypeBtn10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer" }));
        userTypeBtn10.setBorder(null);

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/users.png"))); // NOI18N

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/pass.png"))); // NOI18N

        signUp.setBackground(new java.awt.Color(51, 0, 102));
        signUp.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        signUp.setForeground(new java.awt.Color(255, 255, 255));
        signUp.setText("SignUp");
        signUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpsignUpBtnActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("User Type");

        Exit.setBackground(new java.awt.Color(255, 0, 102));
        Exit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.setBorder(null);
        Exit.setBorderPainted(false);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitExitBtnActionPerformed(evt);
            }
        });

        namee.setBackground(new java.awt.Color(51, 0, 102));
        namee.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        namee.setForeground(new java.awt.Color(255, 255, 255));
        namee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("Name");

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/name.png"))); // NOI18N

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("Confirm Password");

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/pass.png"))); // NOI18N

        confirmPassword.setBackground(new java.awt.Color(51, 0, 102));
        confirmPassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        confirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        confirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel97, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel99, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namee)
                            .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userTypeBtn10, 0, 250, Short.MAX_VALUE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel95))
                            .addComponent(password)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(confirmPassword)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel29))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel28))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel96))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel98)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTypeBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97))
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94))
                .addGap(24, 24, 24)
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel99)
                    .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel100)
                        .addGap(117, 117, 117))
                    .addComponent(jLabel101, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(62, 62, 62))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100)
                .addGap(221, 221, 221))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signUpsignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpsignUpBtnActionPerformed
        int id = 0;
        int result = 0;
        String userName = username.getText();
        String pass = password.getText();
        String conPass = confirmPassword.getText();
        String name = namee.getText();
        if(!userName.equals("") && !name.equals("") && !pass.equals("") && !conPass.equals("")){
            if(pass.equals(conPass)){
                try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkingSystem", "root", "");
                Statement st = c.createStatement();
                String sql = "insert into customers (name , username , password) values ('"+name+"' , '"+userName+"' , '"+pass+"') ";
                result = st.executeUpdate(sql);
                if(result == 1){
                    ImageIcon i = new ImageIcon(getClass().getResource("ch.png"));
                    JOptionPane.showMessageDialog(null, "Signed up Successfully, go to login" , "Success Message" , JOptionPane.INFORMATION_MESSAGE , i);
                    LoginScreen ls = new LoginScreen();
                    ls.show();
                    this.dispose();
                }
                else
                    JOptionPane.showMessageDialog(null, "Somesthing went wrong" , "Error Message" , JOptionPane.ERROR_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SignupScreen.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(SignupScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else
                JOptionPane.showMessageDialog(null, "Password doesnot match" , "Error Message" , JOptionPane.ERROR_MESSAGE);   
        }else
            JOptionPane.showMessageDialog(null, "Please fill out all fields" , "Error Message" , JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_signUpsignUpBtnActionPerformed

    private void ExitExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitExitBtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure to close application?", "Warning Message", JOptionPane.YES_NO_OPTION);
        if(choice == 0)
        System.exit(0);
    }//GEN-LAST:event_ExitExitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton ExitBtn1;
    private javax.swing.JButton ExitBtn2;
    private javax.swing.JButton ExitBtn3;
    private javax.swing.JButton ExitBtn4;
    private javax.swing.JButton ExitBtn5;
    private javax.swing.JButton ExitBtn6;
    private javax.swing.JButton ExitBtn7;
    private javax.swing.JButton ExitBtn8;
    private javax.swing.JButton ExitBtn9;
    private javax.swing.JPasswordField conPass;
    private javax.swing.JPasswordField conPass1;
    private javax.swing.JPasswordField conPass2;
    private javax.swing.JPasswordField conPass3;
    private javax.swing.JPasswordField conPass4;
    private javax.swing.JPasswordField conPass5;
    private javax.swing.JPasswordField conPass6;
    private javax.swing.JPasswordField conPass7;
    private javax.swing.JPasswordField conPass8;
    private javax.swing.JPasswordField conPass9;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField name3;
    private javax.swing.JTextField name4;
    private javax.swing.JTextField name5;
    private javax.swing.JTextField name6;
    private javax.swing.JTextField name7;
    private javax.swing.JTextField name8;
    private javax.swing.JTextField name9;
    private javax.swing.JTextField namee;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JPasswordField pass3;
    private javax.swing.JPasswordField pass4;
    private javax.swing.JPasswordField pass5;
    private javax.swing.JPasswordField pass6;
    private javax.swing.JPasswordField pass7;
    private javax.swing.JPasswordField pass8;
    private javax.swing.JPasswordField pass9;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signUp;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JButton signUpBtn1;
    private javax.swing.JButton signUpBtn2;
    private javax.swing.JButton signUpBtn3;
    private javax.swing.JButton signUpBtn4;
    private javax.swing.JButton signUpBtn5;
    private javax.swing.JButton signUpBtn6;
    private javax.swing.JButton signUpBtn7;
    private javax.swing.JButton signUpBtn8;
    private javax.swing.JButton signUpBtn9;
    private javax.swing.JTextField uname;
    private javax.swing.JTextField uname1;
    private javax.swing.JTextField uname2;
    private javax.swing.JTextField uname3;
    private javax.swing.JTextField uname4;
    private javax.swing.JTextField uname5;
    private javax.swing.JTextField uname6;
    private javax.swing.JTextField uname7;
    private javax.swing.JTextField uname8;
    private javax.swing.JTextField uname9;
    private javax.swing.JComboBox<String> userTypeBtn;
    private javax.swing.JComboBox<String> userTypeBtn1;
    private javax.swing.JComboBox<String> userTypeBtn10;
    private javax.swing.JComboBox<String> userTypeBtn2;
    private javax.swing.JComboBox<String> userTypeBtn3;
    private javax.swing.JComboBox<String> userTypeBtn4;
    private javax.swing.JComboBox<String> userTypeBtn5;
    private javax.swing.JComboBox<String> userTypeBtn6;
    private javax.swing.JComboBox<String> userTypeBtn7;
    private javax.swing.JComboBox<String> userTypeBtn8;
    private javax.swing.JComboBox<String> userTypeBtn9;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
