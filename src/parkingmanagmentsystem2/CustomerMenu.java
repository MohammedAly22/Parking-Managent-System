
package parkingmanagmentsystem2;

import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class CustomerMenu extends javax.swing.JFrame {
    static String customerName;
    static int selectedCar = 0;
    static int id = 0;
    
    public CustomerMenu() {
        initComponents();
    }
    
    public static void setCustomerName(String name){
        customerName = name;
    }
    
    public static void setCustomerId(int i){
        id = i;
    }
    
    public static void getCarNumber(int[] arr , int length){
        for(int j = 0 ; j < length ; j++){
            switch(arr[j]){
                case 0:
                    break;
                case 1:
                    car1.setBackground(Color.red);
                    break;
                case 2:
                    Car2.setBackground(Color.red);
                    break;
                case 3:
                    car3.setBackground(Color.red);
                    break;
                case 4:
                    car4.setBackground(Color.red);
                    break;
                case 5:
                    car5.setBackground(Color.red);
                    break;
                case 6:
                    car6.setBackground(Color.red);
                    break;
                case 7:
                    car7.setBackground(Color.red);
                    break;
                case 8:
                    car8.setBackground(Color.red);
                    break;
                case 9:
                    car9.setBackground(Color.red);
                    break;
                case 10:
                    car10.setBackground(Color.red);
                    break;
                case 11:
                    car11.setBackground(Color.red);
                    break;
                case 12:
                    car12.setBackground(Color.red);
                    break;
                case 13:
                    car13.setBackground(Color.red);
                    break;
                case 14:
                    car14.setBackground(Color.red);
                    break;
                case 15:
                    car15.setBackground(Color.red);
                    break;
                case 16:
                    car16.setBackground(Color.red);
                    break;
                case 17:
                    car17.setBackground(Color.red);
                    break;
                case 18:
                    car18.setBackground(Color.red);
                    break;
                case 19:
                    car19.setBackground(Color.red);
                    break;
                case 20:
                    car20.setBackground(Color.red);
                    break;
            }
        }
    }
    public static int getSelectedCar(){
        if(car1.isSelected())
            return 1;
        else if(Car2.isSelected())
            return 2;
        else if(car3.isSelected())
            return 3;
        else if(car4.isSelected())
            return 4;
        else if(car5.isSelected())
            return 5;
        else if(car6.isSelected())
            return 6;
        else if(car7.isSelected())
            return 7;
        else if(car8.isSelected())
            return 8;
        else if(car9.isSelected())
            return 9;
        else if(car10.isSelected())
            return 10;
        else if(car11.isSelected())
            return 11;
        else if(car12.isSelected())
            return 12;
        else if(car13.isSelected())
            return 13;
        else if(car14.isSelected())
            return 14;
        else if(car15.isSelected())
            return 15;
        else if(car16.isSelected())
            return 16;
        else if(car17.isSelected())
            return 17;
        else if(car18.isSelected())
            return 18;
        else if(car19.isSelected())
            return 19 ;
        else if(car20.isSelected())
            return 20;
        return 0;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        car1 = new javax.swing.JButton();
        Car2 = new javax.swing.JButton();
        car3 = new javax.swing.JButton();
        car4 = new javax.swing.JButton();
        car5 = new javax.swing.JButton();
        car6 = new javax.swing.JButton();
        car7 = new javax.swing.JButton();
        car8 = new javax.swing.JButton();
        car9 = new javax.swing.JButton();
        car10 = new javax.swing.JButton();
        car15 = new javax.swing.JButton();
        car14 = new javax.swing.JButton();
        car13 = new javax.swing.JButton();
        car11 = new javax.swing.JButton();
        car12 = new javax.swing.JButton();
        car17 = new javax.swing.JButton();
        car18 = new javax.swing.JButton();
        car20 = new javax.swing.JButton();
        car16 = new javax.swing.JButton();
        car19 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Exitt = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome,");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText(customerName);

        car1.setBackground(new java.awt.Color(51, 0, 102));
        car1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                car1ComponentAdded(evt);
            }
        });
        car1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car1MouseClicked(evt);
            }
        });
        car1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car1ActionPerformed(evt);
            }
        });

        Car2.setBackground(new java.awt.Color(51, 0, 102));
        Car2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        Car2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Car2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Car2MouseClicked(evt);
            }
        });

        car3.setBackground(new java.awt.Color(51, 0, 102));
        car3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car3MouseClicked(evt);
            }
        });

        car4.setBackground(new java.awt.Color(51, 0, 102));
        car4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car4MouseClicked(evt);
            }
        });

        car5.setBackground(new java.awt.Color(51, 0, 102));
        car5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car5MouseClicked(evt);
            }
        });

        car6.setBackground(new java.awt.Color(51, 0, 102));
        car6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car6MouseClicked(evt);
            }
        });

        car7.setBackground(new java.awt.Color(51, 0, 102));
        car7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car7MouseClicked(evt);
            }
        });

        car8.setBackground(new java.awt.Color(51, 0, 102));
        car8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car8MouseClicked(evt);
            }
        });

        car9.setBackground(new java.awt.Color(51, 0, 102));
        car9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car9MouseClicked(evt);
            }
        });

        car10.setBackground(new java.awt.Color(51, 0, 102));
        car10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car10MouseClicked(evt);
            }
        });

        car15.setBackground(new java.awt.Color(51, 0, 102));
        car15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car15MouseClicked(evt);
            }
        });

        car14.setBackground(new java.awt.Color(51, 0, 102));
        car14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car14MouseClicked(evt);
            }
        });

        car13.setBackground(new java.awt.Color(51, 0, 102));
        car13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car13MouseClicked(evt);
            }
        });

        car11.setBackground(new java.awt.Color(51, 0, 102));
        car11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car11MouseClicked(evt);
            }
        });

        car12.setBackground(new java.awt.Color(51, 0, 102));
        car12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car12MouseClicked(evt);
            }
        });

        car17.setBackground(new java.awt.Color(51, 0, 102));
        car17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car17MouseClicked(evt);
            }
        });

        car18.setBackground(new java.awt.Color(51, 0, 102));
        car18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car18MouseClicked(evt);
            }
        });

        car20.setBackground(new java.awt.Color(51, 0, 102));
        car20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car20MouseClicked(evt);
            }
        });
        car20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car20ActionPerformed(evt);
            }
        });

        car16.setBackground(new java.awt.Color(51, 0, 102));
        car16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car16MouseClicked(evt);
            }
        });

        car19.setBackground(new java.awt.Color(51, 0, 102));
        car19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingmanagmentsystem2/car.png"))); // NOI18N
        car19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car19MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Please Choose the place you want to park");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("2");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("3");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("4");

        Exitt.setBackground(new java.awt.Color(255, 255, 255));
        Exitt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Exitt.setForeground(new java.awt.Color(255, 0, 51));
        Exitt.setText("Exit");
        Exitt.setBorder(null);
        Exitt.setBorderPainted(false);
        Exitt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExittActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(204, 0, 0));
        logoutBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("logout");
        logoutBtn.setBorder(null);
        logoutBtn.setBorderPainted(false);
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(car1)
                                    .addComponent(car6)
                                    .addComponent(car11))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Car2)
                                    .addComponent(car7)
                                    .addComponent(car12))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(car3)
                                    .addComponent(car8)
                                    .addComponent(car13))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(car4)
                                        .addGap(30, 30, 30)
                                        .addComponent(car5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(car9)
                                        .addGap(30, 30, 30)
                                        .addComponent(car10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(car14)
                                        .addGap(30, 30, 30)
                                        .addComponent(car15))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(car16)
                                        .addGap(30, 30, 30)
                                        .addComponent(car17)
                                        .addGap(28, 28, 28)
                                        .addComponent(car18)
                                        .addGap(28, 28, 28)
                                        .addComponent(car19))
                                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Exitt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(car20)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(car1)
                            .addComponent(Car2)
                            .addComponent(car3)
                            .addComponent(car4)
                            .addComponent(car5))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(car6)
                            .addComponent(car7)
                            .addComponent(car8)
                            .addComponent(car9)
                            .addComponent(car10))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(car11)
                            .addComponent(car12)
                            .addComponent(car13)
                            .addComponent(car14)
                            .addComponent(car15))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(car16)
                            .addComponent(car17)
                            .addComponent(car18)
                            .addComponent(car19)
                            .addComponent(car20)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel5)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel6)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel7)
                        .addGap(45, 45, 45)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Exitt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
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

    private void ExittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExittActionPerformed
    int choice = JOptionPane.showConfirmDialog(null, "are you sure to close the application? ", "Confirmation Message", JOptionPane.YES_NO_OPTION);
    if(choice == 0)
        System.exit(0);
    }//GEN-LAST:event_ExittActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure to logout?" , "Confirmation Message" , JOptionPane.YES_NO_OPTION);
        if(choice == 0){
            new CustomerMenu().setVisible(false);
            LoginScreen ls = new LoginScreen();
            ls.show();
            this.dispose();
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void car1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_car1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_car1ActionPerformed

    private void car1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_car1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_car1ComponentAdded

    private void car1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car1MouseClicked
        if(car1.getBackground() != Color.red){
            selectedCar = 1;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car1MouseClicked

    private void Car2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Car2MouseClicked
        if(Car2.getBackground() != Color.red){
            selectedCar = 2;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Car2MouseClicked

    private void car3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car3MouseClicked
        if(car3.getBackground() != Color.red){
            selectedCar = 3;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car3MouseClicked

    private void car4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car4MouseClicked
        if(car4.getBackground() != Color.red){
            selectedCar = 4;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car4MouseClicked

    private void car5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car5MouseClicked
        if(car5.getBackground() != Color.red){
            selectedCar = 5;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car5MouseClicked

    private void car6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car6MouseClicked
        if(car6.getBackground() != Color.red){
            selectedCar = 6;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car6MouseClicked

    private void car7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car7MouseClicked
        if(car7.getBackground() != Color.red){
            selectedCar = 7;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car7MouseClicked

    private void car8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car8MouseClicked
        if(car8.getBackground() != Color.red){
            selectedCar = 8;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car8MouseClicked

    private void car9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car9MouseClicked
        if(car9.getBackground() != Color.red){
            selectedCar = 9;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car9MouseClicked

    private void car10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car10MouseClicked
        if(car10.getBackground() != Color.red){
            selectedCar = 10;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car10MouseClicked

    private void car11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car11MouseClicked
        if(car11.getBackground() != Color.red){
            selectedCar = 11;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car11MouseClicked

    private void car12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car12MouseClicked
        if(car12.getBackground() != Color.red){
            selectedCar = 12;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car12MouseClicked

    private void car13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car13MouseClicked
        if(car13.getBackground() != Color.red){
            selectedCar = 13;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car13MouseClicked

    private void car14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car14MouseClicked
        if(car14.getBackground() != Color.red){
            selectedCar = 14;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car14MouseClicked

    private void car15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car15MouseClicked
        if(car15.getBackground() != Color.red){
            selectedCar = 15;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car15MouseClicked

    private void car16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car16MouseClicked
        if(car16.getBackground() != Color.red){
            selectedCar = 16;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car16MouseClicked

    private void car17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car17MouseClicked
        if(car17.getBackground() != Color.red){
            selectedCar = 17;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car17MouseClicked

    private void car18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car18MouseClicked
        if(car18.getBackground() != Color.red){
            selectedCar = 18;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car18MouseClicked

    private void car19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car19MouseClicked
        if(car19.getBackground() != Color.red){
            selectedCar = 19;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car19MouseClicked

    private void car20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_car20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_car20ActionPerformed

    private void car20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car20MouseClicked
        if(car20.getBackground() != Color.red){
            selectedCar = 20;
            parkingReservationForm pf = new parkingReservationForm();
            pf.show(); 
        }else{
            JOptionPane.showMessageDialog(null, "another one is parking here" , "Error Message"  ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_car20MouseClicked

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
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Car2;
    private javax.swing.JButton Exitt;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
