

import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Hotel_system extends javax.swing.JFrame {

    /**
     * Creates new form Hotel_system
     */
    public Hotel_system() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        cref = new javax.swing.JTextField();
        add1 = new javax.swing.JTextField();
        surname = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        add2 = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jCheckOut = new com.toedter.calendar.JDateChooser();
        jCheckIn = new com.toedter.calendar.JDateChooser();
        jdob = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jtxtTax = new javax.swing.JTextField();
        jbtnExit = new javax.swing.JButton();
        jtxtsubTotal = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jtxtTotal = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jbtnDelete = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnTotalCost = new javax.swing.JButton();
        jBtnUpdate = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jComboBoxNationality = new javax.swing.JComboBox<>();
        jComboBoxRoomNo = new javax.swing.JComboBox<>();
        jComboBoxRoomType = new javax.swing.JComboBox<>();
        jComboBoxMeal = new javax.swing.JComboBox<>();
        jComboBoxExtNo = new javax.swing.JComboBox<>();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jComboBoxId = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       // getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Customer ref:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("First Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Address line1:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Address Line 2:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Customer Mobile:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 100, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Customer ref:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("First Name:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Surname:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("E-mail");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Nationality:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Date of Birth");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Id type:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 80, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Gender:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Check-in Date:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 80, 20));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Check-out Date:");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 90, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Meal:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 80, 20));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Room Type:");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 90, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Room no.:");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 80, 20));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 240, -1));

        cref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crefActionPerformed(evt);
            }
        });
        getContentPane().add(cref, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 240, -1));

        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        getContentPane().add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 240, -1));

        surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameActionPerformed(evt);
            }
        });
        getContentPane().add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 240, -1));
        getContentPane().add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 240, -1));
        getContentPane().add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 240, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 240, -1));
        getContentPane().add(jCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 240, -1));
        getContentPane().add(jCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 240, -1));
        getContentPane().add(jdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 240, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ref", "First name", "Surname", "Address Line1", "Address Line2", "Customer MObile", "E-mail", "Date of Birth", "Nationality", "Id type", "Gender", "Check-in date", "Check-out Date", "Meal", "Room  Type", "Room no.", "Room Ext. No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 960, 500));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 4));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Tax");

        jtxtTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTaxActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jtxtsubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsubTotalActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("SubTotal");

        jtxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Total");

        jbtnDelete.setFont(new java.awt.Font("Tekton Pro Cond", 0, 24)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnTotalCost.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jbtnTotalCost.setText("Total Cost");
        jbtnTotalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTotalCostActionPerformed(evt);
            }
        });

        jBtnUpdate.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jBtnUpdate.setText("Update");
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel37))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jbtnTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jBtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtxtsubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1340, 190));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Room Ext. No.:");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 80, 20));

        jComboBoxNationality.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxNationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INDIAN", "OTHER" }));
        jComboBoxNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNationalityActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 240, -1));

        jComboBoxRoomNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxRoomNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "001", "002", "003", "004", "005", "006", "007", "008", "009" }));
        getContentPane().add(jComboBoxRoomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 240, -1));

        jComboBoxRoomType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxRoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Family" }));
        getContentPane().add(jComboBoxRoomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 240, -1));

        jComboBoxMeal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxMeal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        getContentPane().add(jComboBoxMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 240, -1));

        jComboBoxExtNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxExtNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1001", "1002", "1003", "1004", "1005", "1006", "1007", "1008", "1009" }));
        getContentPane().add(jComboBoxExtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 240, -1));

        jComboBoxGender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBoxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGenderActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 240, -1));

        jComboBoxId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aadhar card", "PAN card", "Driving Licence", "Passport", "College Id" }));
        getContentPane().add(jComboBoxId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 240, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void crefActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void surnameActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jtxtTaxActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jtxtsubTotalActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jtxtTotalActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {                                         
            frame = new JFrame("Exit");
            if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit","Hotel management system",
                    JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
            {
                System.exit(0);
            }
    }                                        

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                           
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      if(jTable1.getSelectedRow()==-1)
      {
          if(jTable1.getRowCount()==0)
          {
              JOptionPane.showMessageDialog(null, "Hotel Booking update Confirmed", "Hotel Management System", JOptionPane.OK_OPTION);
          }else
          {
              JOptionPane.showMessageDialog(null,"select a row to delete","Hotel management system",JOptionPane.OK_OPTION);    
          }
    }                                          
     else
      {
          model.removeRow(jTable1.getSelectedRow());
      }
    }
  
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {                                          
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       model.setRowCount(0);
       
       cref.setText(null);
       fname.setText(null);
       surname.setText(null);
       add1.setText(null);
       add2.setText(null);
       mobile.setText(null);
       email.setText(null);
       
       
       jComboBoxNationality.setSelectedIndex(0);
       jComboBoxId.setSelectedIndex(0);
       jComboBoxGender.setSelectedIndex(0);
       jComboBoxMeal.setSelectedIndex(0);
       jComboBoxRoomType.setSelectedIndex(0);
       jComboBoxRoomNo.setSelectedIndex(0);
       
       jdob.setDate(null);
          jCheckIn.setDate(null);   
          jCheckOut.setDate(null);
       
       
    }                                         

    private void jbtnTotalCostActionPerformed(java.awt.event.ActionEvent evt) {                                              
       
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       model.addRow(new Object[]{
       
       cref.getText(),
       fname.getText(),
       surname.getText(),
       add1.getText(),
       add2.getText(),
       mobile.getText(),
       email.getText(),
       
       jdob.getDate(),
       jComboBoxNationality.getSelectedItem(),
       jComboBoxId.getSelectedItem(),
       jComboBoxGender.getSelectedItem(),
         jCheckIn.getDate(),
         jCheckOut.getDate(),
       jComboBoxMeal.getSelectedItem(),
       jComboBoxRoomType.getSelectedItem(),
       jComboBoxRoomNo.getSelectedItem(),
       jComboBoxExtNo.getSelectedItem(),
       
   
       });
    
    }                                             

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                           
              DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      if(jTable1.getSelectedRow()==-1)
      {
          if(jTable1.getRowCount()==0)
          {
              JOptionPane.showMessageDialog(null, "Hotel Booking update Confirmed", "Hotel Management System", JOptionPane.OK_OPTION);
          }
    }      
    }                                          

    private void jComboBoxNationalityActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void jComboBoxGenderActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Hotel_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hotel_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hotel_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hotel_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hotel_system().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField add1;
    private javax.swing.JTextField add2;
    private javax.swing.JTextField cref;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jBtnUpdate;
    private com.toedter.calendar.JDateChooser jCheckIn;
    private com.toedter.calendar.JDateChooser jCheckOut;
    private javax.swing.JComboBox<String> jComboBoxExtNo;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JComboBox<String> jComboBoxId;
    private javax.swing.JComboBox<String> jComboBoxMeal;
    private javax.swing.JComboBox<String> jComboBoxNationality;
    private javax.swing.JComboBox<String> jComboBoxRoomNo;
    private javax.swing.JComboBox<String> jComboBoxRoomType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTotalCost;
    private com.toedter.calendar.JDateChooser jdob;
    private javax.swing.JTextField jtxtTax;
    private javax.swing.JTextField jtxtTotal;
    private javax.swing.JTextField jtxtsubTotal;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField surname;
    // End of variables declaration                   
}
