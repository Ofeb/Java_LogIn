package login.app;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import login.app.Bl.AccDataBaseManager;
import login.app.Bl.Account;

/**
 *
 * @author MAC_DEE
 */
public class GUIFrame extends javax.swing.JFrame {

    /**
     * Creates new form GUIFrame
     */
    public GUIFrame() {
        initComponents();
        hideInStart();
    }

    private void hideInStart() {

        SignupPnl.setVisible(true);
        LogInPnl.setVisible(true);
        SignupPnl2.setVisible(false);
        SignupPnl.setRequestFocusEnabled(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        HomePnl = new javax.swing.JPanel();
        SignupPnl = new javax.swing.JPanel();
        IconLbl = new javax.swing.JLabel();
        LogInPnl = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        UsernameTxtFld = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        PasswordFld = new javax.swing.JPasswordField();
        LogInBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        SignupLoginBtn = new javax.swing.JButton();
        SignupPnl2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fullname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        password2 = new javax.swing.JPasswordField();
        signupBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        signupLoginBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/app/Kasi Tech.png"))); // NOI18N

        LogInPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("     LOGIN ");
        LogInPnl.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 29, 166, 42));

        jLabel12.setText("Username");
        LogInPnl.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 89, -1, -1));

        UsernameTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTxtFldActionPerformed(evt);
            }
        });
        LogInPnl.add(UsernameTxtFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 117, 197, 35));

        jLabel13.setText("Password");
        LogInPnl.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 170, -1, -1));
        LogInPnl.add(PasswordFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 198, 197, 39));

        LogInBtn.setBackground(new java.awt.Color(0, 102, 102));
        LogInBtn.setText("LOG IN");
        LogInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInBtnActionPerformed(evt);
            }
        });
        LogInPnl.add(LogInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 255, -1, 37));

        jLabel14.setText("Don't have an account ? ");
        LogInPnl.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 333, 135, 26));

        SignupLoginBtn.setText("Sign up");
        SignupLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupLoginBtnActionPerformed(evt);
            }
        });
        LogInPnl.add(SignupLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 335, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("            SIGN UP ");

        jLabel5.setText("Full name");

        jLabel6.setText("Username");

        jLabel7.setText("Password");

        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Confirm Password");

        signupBtn.setBackground(new java.awt.Color(0, 102, 102));
        signupBtn.setText("Sign Up");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Already have an account ? ");

        signupLoginBtn.setForeground(new java.awt.Color(255, 51, 51));
        signupLoginBtn.setText("Log in");
        signupLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SignupPnl2Layout = new javax.swing.GroupLayout(SignupPnl2);
        SignupPnl2.setLayout(SignupPnl2Layout);
        SignupPnl2Layout.setHorizontalGroup(
            SignupPnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignupPnl2Layout.createSequentialGroup()
                .addGroup(SignupPnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignupPnl2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(SignupPnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SignupPnl2Layout.createSequentialGroup()
                                .addGroup(SignupPnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signupLoginBtn))))
                    .addGroup(SignupPnl2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SignupPnl2Layout.setVerticalGroup(
            SignupPnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignupPnl2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SignupPnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignupPnl2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(SignupPnl2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(signupLoginBtn)))
                .addContainerGap())
        );

        javax.swing.GroupLayout SignupPnlLayout = new javax.swing.GroupLayout(SignupPnl);
        SignupPnl.setLayout(SignupPnlLayout);
        SignupPnlLayout.setHorizontalGroup(
            SignupPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignupPnlLayout.createSequentialGroup()
                .addComponent(IconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignupPnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogInPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SignupPnlLayout.setVerticalGroup(
            SignupPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignupPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SignupPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogInPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
            .addGroup(SignupPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignupPnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HomePnlLayout = new javax.swing.GroupLayout(HomePnl);
        HomePnl.setLayout(HomePnlLayout);
        HomePnlLayout.setHorizontalGroup(
            HomePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SignupPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HomePnlLayout.setVerticalGroup(
            HomePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SignupPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(HomePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HomePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void LogInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInBtnActionPerformed
        // TODO add your handling code here:
        try {
            //variables
            AccDataBaseManager manager = new AccDataBaseManager();
            Account account;
            int isAvailable = 0;

            ArrayList<Account> accountlist = manager.logInDetails();

            String user = UsernameTxtFld.getText();
            char[] password = PasswordFld.getPassword();
            for (Account acc : accountlist) {
                if (acc.getUsername().equals(user) && acc.getPassword().equals(new String(password))) {
                    JOptionPane.showMessageDialog(rootPane, "LOG IN SUCCESSFUL");

                    isAvailable = 1;
                }

            }

            if (isAvailable == 0) {
                JOptionPane.showMessageDialog(rootPane, "Wrong Username or Password,Try again", "Wrong Input", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }//GEN-LAST:event_LogInBtnActionPerformed

    private void UsernameTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTxtFldActionPerformed

    private void signupLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupLoginBtnActionPerformed

        LogInPnl.setVisible(true);
        SignupPnl2.setVisible(false);

    }//GEN-LAST:event_signupLoginBtnActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        try {
            // Variables
            AccDataBaseManager manager = new AccDataBaseManager();
            Account account = null;
            //create an account
            char[] pwd1 = password1.getPassword();
            char[] pwd2 = password2.getPassword();

            if ((new String(pwd1).equals(new String(pwd2))) /*&&!(username.getText().isEmpty() && Fullname.getText().isBlank() && new String(pwd1).isEmpty())*/) {
                account = new Account(username.getText(), Fullname.getText(), new String(pwd1));
                Boolean isadded = manager.addUser(account);
                if (isadded) {
                    JOptionPane.showMessageDialog(rootPane, "Added Successful");

                    //clear all 
                    clearFillieds();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Not Added");
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_signupBtnActionPerformed

    private void SignupLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupLoginBtnActionPerformed
        // Panel control
        SignupPnl2.setVisible(true);
        LogInPnl.setVisible(false);


    }//GEN-LAST:event_SignupLoginBtnActionPerformed

    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fullname;
    private javax.swing.JPanel HomePnl;
    private javax.swing.JLabel IconLbl;
    private javax.swing.JButton LogInBtn;
    private javax.swing.JPanel LogInPnl;
    private javax.swing.JPasswordField PasswordFld;
    private javax.swing.JButton SignupLoginBtn;
    private javax.swing.JPanel SignupPnl;
    private javax.swing.JPanel SignupPnl2;
    private javax.swing.JTextField UsernameTxtFld;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JButton signupBtn;
    private javax.swing.JButton signupLoginBtn;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void clearFillieds() {
        username.setText("");
        Fullname.setText("");
        password1.setText("");
        password2.setText("");
        PasswordFld.setText("");
        UsernameTxtFld.setText("");
    }

}
