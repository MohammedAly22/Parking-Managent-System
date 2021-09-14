
package parkingmanagmentsystem2;

import java.awt.Color;

public class ReservedSlots extends javax.swing.JFrame {

    public ReservedSlots() {
        initComponents();
    }
    public static void getCarsNumbers(int[] arr , int length){
        for(int j = 0 ; j < length ; j++){
            switch(arr[j]){
                case 0:
                    break;
                case 1:
                    car1.setBackground(Color.green);
                    break;
                case 2:
                    car2.setBackground(Color.green);
                    break;
                case 3:
                    car3.setBackground(Color.green);
                    break;
                case 4:
                    car4.setBackground(Color.green);
                    break;
                case 5:
                    car5.setBackground(Color.green);
                    break;
                case 6:
                    car6.setBackground(Color.green);
                    break;
                case 7:
                    car7.setBackground(Color.green);
                    break;
                case 8:
                    car8.setBackground(Color.green);
                    break;
                case 9:
                    car9.setBackground(Color.green);
                    break;
                case 10:
                    car10.setBackground(Color.green);
                    break;
                case 11:
                    car11.setBackground(Color.green);
                    break;
                case 12:
                    car12.setBackground(Color.green);
                    break;
                case 13:
                    car13.setBackground(Color.green);
                    break;
                case 14:
                    car14.setBackground(Color.green);
                    break;
                case 15:
                    car15.setBackground(Color.green);
                    break;
                case 16:
                    car16.setBackground(Color.green);
                    break;
                case 17:
                    car17.setBackground(Color.green);
                    break;
                case 18:
                    car18.setBackground(Color.green);
                    break;
                case 19:
                    car19.setBackground(Color.green);
                    break;
                case 20:
                    car20.setBackground(Color.green);
                    break;
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        car1 = new javax.swing.JButton();
        car2 = new javax.swing.JButton();
        car3 = new javax.swing.JButton();
        car4 = new javax.swing.JButton();
        car5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        car10 = new javax.swing.JButton();
        car9 = new javax.swing.JButton();
        car8 = new javax.swing.JButton();
        car7 = new javax.swing.JButton();
        car6 = new javax.swing.JButton();
        car14 = new javax.swing.JButton();
        car13 = new javax.swing.JButton();
        car11 = new javax.swing.JButton();
        car12 = new javax.swing.JButton();
        car15 = new javax.swing.JButton();
        car17 = new javax.swing.JButton();
        car16 = new javax.swing.JButton();
        car19 = new javax.swing.JButton();
        car18 = new javax.swing.JButton();
        car20 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));

        car1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car1ActionPerformed(evt);
            }
        });

        car2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Reserved Slots");

        car10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car19ActionPerformed(evt);
            }
        });

        car18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        car20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("2");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("3");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("4");

        ExitBtn.setBackground(new java.awt.Color(255, 51, 51));
        ExitBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExitBtn.setText("X");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(car1)
                                .addGap(40, 40, 40)
                                .addComponent(car2)
                                .addGap(36, 36, 36)
                                .addComponent(car3)
                                .addGap(39, 39, 39)
                                .addComponent(car4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(car6)
                                .addGap(40, 40, 40)
                                .addComponent(car7)
                                .addGap(36, 36, 36)
                                .addComponent(car8)
                                .addGap(39, 39, 39)
                                .addComponent(car9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(car11)
                                .addGap(40, 40, 40)
                                .addComponent(car12)
                                .addGap(36, 36, 36)
                                .addComponent(car13)
                                .addGap(39, 39, 39)
                                .addComponent(car14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(car16)
                                .addGap(40, 40, 40)
                                .addComponent(car17)
                                .addGap(36, 36, 36)
                                .addComponent(car18)
                                .addGap(39, 39, 39)
                                .addComponent(car19)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(car5)
                            .addComponent(car10)
                            .addComponent(car15)
                            .addComponent(car20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(423, 423, 423)))
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel1)
                            .addGap(59, 59, 59)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(car5)
                                .addComponent(car4)
                                .addComponent(car3)
                                .addComponent(car1)
                                .addComponent(car2))
                            .addGap(36, 36, 36)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(car10)
                                .addComponent(car9)
                                .addComponent(car8)
                                .addComponent(car6)
                                .addComponent(car7))
                            .addGap(36, 36, 36)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(car15)
                                .addComponent(car14)
                                .addComponent(car13)
                                .addComponent(car11)
                                .addComponent(car12))
                            .addGap(36, 36, 36)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(car20)
                                .addComponent(car19)
                                .addComponent(car18)
                                .addComponent(car16)
                                .addComponent(car17)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(178, 178, 178)
                            .addComponent(jLabel2)
                            .addGap(119, 119, 119)
                            .addComponent(jLabel3)
                            .addGap(129, 129, 129)
                            .addComponent(jLabel4)
                            .addGap(92, 92, 92)
                            .addComponent(jLabel5)
                            .addGap(42, 42, 42))))
                .addContainerGap(81, Short.MAX_VALUE))
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
        this.dispose();
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void car1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_car1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_car1ActionPerformed

    private void car19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_car19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_car19ActionPerformed

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
            java.util.logging.Logger.getLogger(ReservedSlots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservedSlots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservedSlots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservedSlots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservedSlots().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBtn;
    public static javax.swing.JButton car1;
    public static javax.swing.JButton car10;
    public static javax.swing.JButton car11;
    public static javax.swing.JButton car12;
    public static javax.swing.JButton car13;
    public static javax.swing.JButton car14;
    public static javax.swing.JButton car15;
    public static javax.swing.JButton car16;
    public static javax.swing.JButton car17;
    public static javax.swing.JButton car18;
    public static javax.swing.JButton car19;
    public static javax.swing.JButton car2;
    public static javax.swing.JButton car20;
    public static javax.swing.JButton car3;
    public static javax.swing.JButton car4;
    public static javax.swing.JButton car5;
    public static javax.swing.JButton car6;
    public static javax.swing.JButton car7;
    public static javax.swing.JButton car8;
    public static javax.swing.JButton car9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
