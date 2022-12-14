/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import classes.MySqlConnect;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Acer
 */
public class SignUp extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        rePass = new javax.swing.JPasswordField();
        userValidation = new javax.swing.JLabel();
        EmValidation = new javax.swing.JLabel();
        passwordValidation = new javax.swing.JLabel();
        RepasswordValidation = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(getPreferredSize());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("login");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 40, 20));

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/SignUpicon.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 70, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/icons8-user-24.png"))); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 100, 40));

        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 285, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/MailIcon25.png"))); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 80, 40));

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailKeyPressed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 285, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/passicon.png"))); // NOI18N
        jLabel5.setText("Enter Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Re-enter Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 120, 20));

        jButton1.setText("SignUp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 2, 10)); // NOI18N
        jLabel7.setText("Already have an account?");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 120, 30));

        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 285, -1));

        rePass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rePassKeyPressed(evt);
            }
        });
        getContentPane().add(rePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 286, -1));

        userValidation.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        userValidation.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(userValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 280, 20));

        EmValidation.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        EmValidation.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(EmValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 280, 20));

        passwordValidation.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        passwordValidation.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(passwordValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 280, 20));

        RepasswordValidation.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        RepasswordValidation.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(RepasswordValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 290, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 440));

        setSize(new java.awt.Dimension(552, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Login loginFrame = new Login();
        loginFrame.show();
        this.hide();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user = username.getText();
        String em = email.getText();
        String password = pass.getText();
        String repassword = rePass.getText();

        if (user.length() == 0) {
            userValidation.setText("username can't be blank!");
        } else if (em.length() == 0) {
            EmValidation.setText("Email can't be empty!");
        } else if (password.length() < 5 || password == "") {
            passwordValidation.setText("Invalid Password!");
        } else if (!repassword.equals(password)) {
            RepasswordValidation.setText("Password do not Match!");
        }

//        database connection and validation
        conn = MySqlConnect.ConnectDB();
        String Sql = "insert into login_data (name, email, password) values(?,?,?)";
        try {
            pst = conn.prepareStatement(Sql);
            pst.setString(1, username.getText());
            pst.setString(2, email.getText());
            pst.setString(3, pass.getText());

            int i = pst.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "account created!");
                this.hide();
                Login log = new Login();
                log.show();
            }

            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.print(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        userValidation.setText("");
    }//GEN-LAST:event_usernameKeyPressed

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed
        EmValidation.setText("");
    }//GEN-LAST:event_emailKeyPressed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        passwordValidation.setText("");
    }//GEN-LAST:event_passKeyPressed

    private void rePassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rePassKeyPressed
        RepasswordValidation.setText("");
    }//GEN-LAST:event_rePassKeyPressed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmValidation;
    private javax.swing.JLabel RepasswordValidation;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passwordValidation;
    private javax.swing.JPasswordField rePass;
    private javax.swing.JLabel userValidation;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
