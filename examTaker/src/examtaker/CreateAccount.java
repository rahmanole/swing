/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examtaker;

/**
 *
 * @author OLEE
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    String name;
    String email;
    String studentId;
    String batchId;
    String round;
    String pass;
    String pass_conf;

    boolean isValidName;
    boolean isValidEmail;
    boolean isValidStudentId;
    boolean isValidBatchId;
    boolean isValidRound;
    boolean isValidPass;

    public CreateAccount() {
        initComponents();

        name = txtFild_name.getText().trim();
        email = txtFild_email.getText().trim();
        studentId = txtFild_student_id.getText().trim();
        batchId = txtFild_batch_id.getText().trim();
        round = txtFild_round.getSelectedItem().toString().trim();
        pass = txtFild_pass.getText().trim();
        pass_conf = txtFild_pass_conf.getText().trim();

        lbl_err_name.setVisible(false);
        lbl_err_email.setVisible(false);
        lbl_err_student_id.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnl_createAccount = new javax.swing.JPanel();
        lbl_create_acc = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtFild_name = new javax.swing.JTextField();
        txtFild_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFild_student_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFild_batch_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFild_pass = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFild_pass_conf = new javax.swing.JTextField();
        btn_create_acc = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtFild_round = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        lbl_err_name = new javax.swing.JLabel();
        lbl_err_email = new javax.swing.JLabel();
        lbl_err_student_id = new javax.swing.JLabel();
        lbl_err_batch_id1 = new javax.swing.JLabel();
        lbl_err_round = new javax.swing.JLabel();
        lbl_err_pass = new javax.swing.JLabel();
        lbl_err_pass_conf = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IDB-BISEW");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Test your learnings");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(290, 290, 290)
                .addComponent(jLabel2)
                .addContainerGap(484, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));

        pnl_createAccount.setBackground(new java.awt.Color(52, 73, 94));

        lbl_create_acc.setBackground(new java.awt.Color(255, 255, 255));
        lbl_create_acc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_create_acc.setForeground(new java.awt.Color(255, 255, 255));
        lbl_create_acc.setText("Create Account");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jSeparator1.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");

        txtFild_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFild_name.setBorder(null);
        txtFild_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFild_nameFocusLost(evt);
            }
        });

        txtFild_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFild_email.setBorder(null);
        txtFild_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFild_emailFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Student ID");

        txtFild_student_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFild_student_id.setBorder(null);
        txtFild_student_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFild_student_idFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Batch ID");

        txtFild_batch_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFild_batch_id.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");

        txtFild_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFild_pass.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Confirm Password");

        txtFild_pass_conf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFild_pass_conf.setBorder(null);

        btn_create_acc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_create_acc.setForeground(new java.awt.Color(255, 255, 255));
        btn_create_acc.setText("Create");
        btn_create_acc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btn_create_acc.setContentAreaFilled(false);
        btn_create_acc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_create_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_accActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Round");

        txtFild_round.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFild_round.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "37", "38", "39", "40", "41", "42", "43", "44", "45" }));
        txtFild_round.setBorder(null);
        txtFild_round.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email");

        lbl_err_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_err_name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_err_name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examtaker/image/icons8_Box_Important_25px.png"))); // NOI18N
        lbl_err_name.setText("Enter name");
        lbl_err_name.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lbl_err_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_err_email.setForeground(new java.awt.Color(255, 255, 255));
        lbl_err_email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examtaker/image/icons8_Box_Important_25px.png"))); // NOI18N
        lbl_err_email.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lbl_err_student_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_err_student_id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_err_student_id.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examtaker/image/icons8_Box_Important_25px.png"))); // NOI18N
        lbl_err_student_id.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lbl_err_batch_id1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_err_batch_id1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_err_batch_id1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examtaker/image/icons8_Box_Important_25px.png"))); // NOI18N
        lbl_err_batch_id1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lbl_err_round.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_err_round.setForeground(new java.awt.Color(255, 255, 255));
        lbl_err_round.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examtaker/image/icons8_Box_Important_25px.png"))); // NOI18N
        lbl_err_round.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lbl_err_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_err_pass.setForeground(new java.awt.Color(255, 255, 255));
        lbl_err_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examtaker/image/icons8_Box_Important_25px.png"))); // NOI18N
        lbl_err_pass.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lbl_err_pass_conf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_err_pass_conf.setForeground(new java.awt.Color(255, 255, 255));
        lbl_err_pass_conf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examtaker/image/icons8_Box_Important_25px.png"))); // NOI18N
        lbl_err_pass_conf.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnl_createAccountLayout = new javax.swing.GroupLayout(pnl_createAccount);
        pnl_createAccount.setLayout(pnl_createAccountLayout);
        pnl_createAccountLayout.setHorizontalGroup(
            pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_createAccountLayout.createSequentialGroup()
                .addGroup(pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_createAccountLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12))
                        .addGap(64, 64, 64)
                        .addGroup(pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFild_email, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFild_name)
                            .addComponent(txtFild_student_id)
                            .addComponent(txtFild_batch_id)
                            .addComponent(txtFild_pass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFild_pass_conf)
                            .addComponent(txtFild_round, 0, 258, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_err_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_err_email, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addComponent(lbl_err_round, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addComponent(lbl_err_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addComponent(lbl_err_pass_conf, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addComponent(lbl_err_batch_id1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbl_err_student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_createAccountLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbl_create_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_createAccountLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_createAccountLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(btn_create_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnl_createAccountLayout.setVerticalGroup(
            pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_createAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_create_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFild_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_err_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFild_email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_err_email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFild_student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lbl_err_student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFild_batch_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_err_batch_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFild_round)
                    .addGroup(pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(lbl_err_round, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFild_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_err_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnl_createAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFild_pass_conf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(lbl_err_pass_conf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(btn_create_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(pnl_createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(pnl_createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1070, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_create_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_accActionPerformed
        // TODO add your handling code here:
        new StudentInfo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_create_accActionPerformed

//validation

    private void txtFild_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFild_nameFocusLost
        // TODO add your handling code here:
        isValidName();
    }//GEN-LAST:event_txtFild_nameFocusLost
    private boolean isValidName() {
        name = txtFild_name.getText().trim();
        if (name.equals("")) {
            lbl_err_name.setVisible(true);
            isValidName = false;
        } else {
            lbl_err_name.setVisible(false);
            isValidName = true;
        }

        return isValidName;
    }

    private void txtFild_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFild_emailFocusLost
        // TODO add your handling code here:
        isValidEmail();
    }//GEN-LAST:event_txtFild_emailFocusLost

    private boolean isValidEmail() {
        email = txtFild_email.getText().trim();
        if (email.equals("")) {
            lbl_err_email.setText("Enter email");
            lbl_err_email.setVisible(true);
            isValidEmail = false;
        } else {
            lbl_err_email.setVisible(false);
            isValidEmail = true;
        }

        return isValidEmail;
    }

    private void txtFild_student_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFild_student_idFocusLost
        // TODO add your handling code here:
        isValidStudentId();
    }//GEN-LAST:event_txtFild_student_idFocusLost

    private boolean isValidStudentId() {
        studentId = txtFild_student_id.getText().trim();
        if (studentId.equals("")) {
            lbl_err_student_id.setText("Enter Student Id");
            lbl_err_student_id.setVisible(true);
            isValidStudentId = false;
        }else if(studentId.length() != 7) {
            lbl_err_student_id.setText("Invalid Id");
            lbl_err_student_id.setVisible(true);
            isValidStudentId = false;
        }else {
            lbl_err_student_id.setVisible(false);
            isValidStudentId = true;
        }

        return isValidStudentId;
    }

    //end
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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_create_acc;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_create_acc;
    private javax.swing.JLabel lbl_err_batch_id1;
    private javax.swing.JLabel lbl_err_email;
    private javax.swing.JLabel lbl_err_name;
    private javax.swing.JLabel lbl_err_pass;
    private javax.swing.JLabel lbl_err_pass_conf;
    private javax.swing.JLabel lbl_err_round;
    private javax.swing.JLabel lbl_err_student_id;
    private javax.swing.JPanel pnl_createAccount;
    private javax.swing.JTextField txtFild_batch_id;
    private javax.swing.JTextField txtFild_email;
    private javax.swing.JTextField txtFild_name;
    private javax.swing.JTextField txtFild_pass;
    private javax.swing.JTextField txtFild_pass_conf;
    private javax.swing.JComboBox<String> txtFild_round;
    private javax.swing.JTextField txtFild_student_id;
    // End of variables declaration//GEN-END:variables
}
