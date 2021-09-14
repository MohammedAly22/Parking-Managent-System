
package parkingmanagmentsystem2;

import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Slider;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class parkingReservationForm extends javax.swing.JFrame {
    //customer id
    public static int cId;
    //ticket id
    public static int ticketId = 0;
    public static void setCustomerId(int i){
        cId = i;
    }
    
    public parkingReservationForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sliderBar = new javax.swing.JSlider();
        CloseBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        totalPay = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ssn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book a ticket");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please fill out all of the details");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hours");

        sliderBar.setBackground(new java.awt.Color(255, 255, 255));
        sliderBar.setForeground(new java.awt.Color(255, 255, 255));
        sliderBar.setMajorTickSpacing(1);
        sliderBar.setMaximum(10);
        sliderBar.setMinimum(1);
        sliderBar.setMinorTickSpacing(1);
        sliderBar.setPaintLabels(true);
        sliderBar.setPaintTicks(true);
        sliderBar.setValue(1);
        sliderBar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBarStateChanged(evt);
            }
        });

        CloseBtn.setBackground(new java.awt.Color(255, 0, 51));
        CloseBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        CloseBtn.setForeground(new java.awt.Color(255, 255, 255));
        CloseBtn.setText("X");
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("total Pay");

        totalPay.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        totalPay.setForeground(new java.awt.Color(255, 204, 0));
        totalPay.setText("100");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("EGP");

        SubmitBtn.setBackground(new java.awt.Color(0, 153, 0));
        SubmitBtn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(255, 0, 51));
        ClearBtn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setText("Clear");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SSN");

        ssn.setBackground(new java.awt.Color(102, 0, 102));
        ssn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ssn.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(84, 84, 84)
                        .addComponent(CloseBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(92, 92, 92))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sliderBar, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ssn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(totalPay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel3)))
                .addGap(0, 74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sliderBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPay)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseBtnActionPerformed

    private void sliderBarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBarStateChanged
        totalPay.setText(Integer.toString(sliderBar.getValue() * 100));
    }//GEN-LAST:event_sliderBarStateChanged

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        sliderBar.setValue(1);
        totalPay.setText(Integer.toString(sliderBar.getValue() * 100));
        ssn.setText("");
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        //this for execute query for ticket reservation
        int result = 0;
        //this for execute query for cars not avalible for another customer
        int result2 = 0;
        //this for get selected car from a customer menu to reserve this place for a current customer
        int selectedcar = 0;
        int hours = sliderBar.getValue();
        double price = Double.parseDouble(totalPay.getText());
        String ssnNum = ssn.getText();
        //ssn number should be 14-digit number
        if(ssnNum.length() != 14)
            JOptionPane.showMessageDialog(null, "SSN number should be 14-digit number" , "Error Message" , JOptionPane.ERROR_MESSAGE);
        else{
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkingSystem" , "root" , "");
                Statement ste = c.createStatement();//insert into parking reservation
                Statement s = c.createStatement();//insert into cars available
                Statement ss = c.createStatement();//select ticket id
                String sql = "insert into parkingreservation (hours , totalPrice , customer_Id , customer_ssn) values ('"+hours+"' , '"+price+"' , '"+cId+"' , '"+ssnNum+"' )";
                result = ste.executeUpdate(sql);
                String sql2 = "select * from parkingreservation where customer_id = '"+cId+"' ";
                ResultSet r =  ss.executeQuery(sql2);
                while(r.next()){
                    ticketId = r.getInt("id");
                }
                if(result == 1){
                    ImageIcon i = new ImageIcon(getClass().getResource("ch.png"));
                    JOptionPane.showMessageDialog(null, "Ticket Reserved succesfully your ticket id is " + ticketId, "Success Message",JOptionPane.INFORMATION_MESSAGE , i);
                    this.setVisible(false);
                    selectedcar = CustomerMenu.selectedCar;
                    switch(selectedcar){
                        case 1:
                            CustomerMenu.car1.setBackground(Color.green);break;
                        case 2:
                            CustomerMenu.Car2.setBackground(Color.green);break;
                        case 3:
                            CustomerMenu.car3.setBackground(Color.green);break;
                        case 4:
                            CustomerMenu.car4.setBackground(Color.green);break;
                        case 5:
                            CustomerMenu.car5.setBackground(Color.green);break;
                        case 6:
                            CustomerMenu.car6.setBackground(Color.green);break;
                        case 7:
                            CustomerMenu.car7.setBackground(Color.green);break;
                        case 8:
                            CustomerMenu.car8.setBackground(Color.green);break;
                        case 9:
                            CustomerMenu.car9.setBackground(Color.green);break;
                        case 10:
                            CustomerMenu.car10.setBackground(Color.green);break;
                        case 11:
                            CustomerMenu.car11.setBackground(Color.green);break;
                        case 12:
                            CustomerMenu.car12.setBackground(Color.green);break;
                        case 13:
                            CustomerMenu.car13.setBackground(Color.green);break;
                        case 14:
                            CustomerMenu.car14.setBackground(Color.green);break;
                        case 15:
                            CustomerMenu.car15.setBackground(Color.green);break;
                        case 16:
                            CustomerMenu.car16.setBackground(Color.green);break;
                        case 17:
                            CustomerMenu.car17.setBackground(Color.green);break;
                        case 18:
                            CustomerMenu.car18.setBackground(Color.green);break;
                        case 19:
                            CustomerMenu.car19.setBackground(Color.green);break;
                        case 20:
                            CustomerMenu.car20.setBackground(Color.green);break;      
                    }
                    String q = "insert into reservedcars (carNum , customer_id) values ('"+CustomerMenu.selectedCar+"' , '"+cId+"')";
                    result2 = s.executeUpdate(q);
                    if(result2 == 1){
                        System.out.println("ok");
                    }else{
                        System.out.println("no");
                    }
                }else
                    JOptionPane.showMessageDialog(null, "Something went wrong" , "Error Message" , JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(parkingReservationForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(parkingReservationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(parkingReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(parkingReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(parkingReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(parkingReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parkingReservationForm().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton CloseBtn;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider sliderBar;
    private javax.swing.JTextField ssn;
    private javax.swing.JLabel totalPay;
    // End of variables declaration//GEN-END:variables
}
