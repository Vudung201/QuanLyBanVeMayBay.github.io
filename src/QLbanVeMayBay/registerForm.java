/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLbanVeMayBay;

import Service.userService;
import getItem.User;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import ketnoiSQL.ketnoiSQL;

/**
 *
 * @author ASUS
 */
public class registerForm extends javax.swing.JFrame {

    /**
     * Creates new form registerForm
     */
    userService userService;
    User user;

    public registerForm() {
        initComponents();
        setLocationRelativeTo(null);
        userService = new userService();
        user = new User();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        qtText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sdtText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diachiTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        signInButton = new javax.swing.JButton();
        dateText = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        soCMText = new javax.swing.JTextField();
        namRadioButton = new javax.swing.JRadioButton();
        nuRadioButton = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        passText = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("????ng K??");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("????ng K??");

        qtText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtTextActionPerformed(evt);
            }
        });
        qtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qtTextKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("M???t kh???u:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("H??? v?? t??n:");

        nameText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTextKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("T??i kho???n:");

        emailText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailTextKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("S??? ??i???n tho???i:");

        sdtText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sdtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sdtTextKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("?????a ch???:");

        diachiTextArea.setColumns(20);
        diachiTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        diachiTextArea.setRows(5);
        jScrollPane1.setViewportView(diachiTextArea);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLbanVeMayBay/Go Back_50px.png"))); // NOI18N
        jButton1.setText("Quay l???i");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        signInButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLbanVeMayBay/Ok_50px.png"))); // NOI18N
        signInButton.setText("????ng k??");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        dateText.setDateFormatString("dd-MM-yyyy");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Ng??y sinh:");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("S??? CMND:");

        soCMText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        soCMText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                soCMTextKeyPressed(evt);
            }
        });

        buttonGroup1.add(namRadioButton);
        namRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namRadioButton.setSelected(true);
        namRadioButton.setText("Nam");

        buttonGroup1.add(nuRadioButton);
        nuRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nuRadioButton.setText("N???");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Gi???i t??nh:");
        jLabel10.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Qu???c t???ch:");
        jLabel11.setToolTipText("");

        passText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLbanVeMayBay/icons8-user-50.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qtText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(namRadioButton)
                                .addGap(53, 53, 53)
                                .addComponent(nuRadioButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 432, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(sdtText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(soCMText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signInButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jLabel3)
                    .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(namRadioButton)
                        .addComponent(nuRadioButton)
                        .addComponent(jLabel10))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sdtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(qtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(soCMText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(signInButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loginForm lg = new loginForm();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:

        user.setEmail(emailText.getText());
        user.setMk(passText.getText());
        user.setHoten(nameText.getText());

        user.setSoCM(soCMText.getText());
        SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
        user.setNgaysinh(dfm.format(dateText.getDate()));
        user.setSdt(sdtText.getText());
        if (namRadioButton.isSelected()) {
            user.setGioitinh("Nam");
        } else {
            user.setGioitinh("N???");
        }
        user.setQuyentk("User");
        user.setQuoctich(qtText.getText());
        user.setDiachi(diachiTextArea.getText());

        if (emailText.getText().equals("") || passText.getText().equals("") || nameText.getText().equals("") || soCMText.getText().equals("") || qtText.getText().equals("") || diachiTextArea.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Vui l??ng ??i???n ?????y ?????", "Th??ng b??o", JOptionPane.ERROR_MESSAGE);
        } else if (sdtText.getText().length() != 10 || soCMText.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "S??? ??i???n tho???i v?? CMND ph???i ??i???n ????ng 10 ch??? s??? !", "Th??ng b??o", JOptionPane.ERROR_MESSAGE);
        } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", emailText.getText()))) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p ????ng d???ng email", "L???i", JOptionPane.ERROR_MESSAGE);
        } else {

            String kt = "";
            Connection connectUser = ketnoiSQL.getConnection();
            try {
                Statement st = connectUser.createStatement();
                ResultSet rs = st.executeQuery("select * from Account");
                while (rs.next()) {
                    if (rs.getString(2).equals(user.getEmail())) {
                        kt = "Email ???? t???n t???i";
                        break;
                    }
                    if (rs.getString(5).equals(user.getSdt())) {
                        kt = "S??? ??i???n tho???i ???? t???n t???i";
                        break;
                    }
                    if (rs.getString(6).equals(user.getSoCM())) {
                        kt = "S??? CMND ???? t???n t???i";
                        break;
                    }

                }

            } catch (SQLException ex) {
                Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            userService.ktTrungDL(user, kt);
            if (kt.equals("")) {
                userService.addUser(user);
                JOptionPane.showMessageDialog(this, "????ng K?? Th??nh C??ng", "Th??ng b??o", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, kt, "Th??ng b??o", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_signInButtonActionPerformed

    private void sdtTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sdtTextKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            sdtText.setEditable(true);
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
            sdtText.setEditable(true);
        } else {
            sdtText.setEditable(false);
        }

    }//GEN-LAST:event_sdtTextKeyPressed

    private void soCMTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_soCMTextKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            soCMText.setEditable(true);
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
            soCMText.setEditable(true);
        } else {
            soCMText.setEditable(false);
        }
    }//GEN-LAST:event_soCMTextKeyPressed

    private void nameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            nameText.setEditable(true);
        } else {
            nameText.setEditable(false);
        }
    }//GEN-LAST:event_nameTextKeyPressed

    private void qtTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtTextKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            qtText.setEditable(true);
        } else {
            qtText.setEditable(false);
        }
    }//GEN-LAST:event_qtTextKeyPressed

    private void emailTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextKeyPressed

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
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dateText;
    private javax.swing.JTextArea diachiTextArea;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton namRadioButton;
    private javax.swing.JTextField nameText;
    private javax.swing.JRadioButton nuRadioButton;
    private javax.swing.JPasswordField passText;
    private javax.swing.JTextField qtText;
    private javax.swing.JTextField sdtText;
    private javax.swing.JButton signInButton;
    private javax.swing.JTextField soCMText;
    // End of variables declaration//GEN-END:variables
}
