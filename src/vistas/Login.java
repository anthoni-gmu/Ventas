/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import vistas.Menu;

public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        loginform.setBackground(new Color(0,0,0,0));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginform = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        loginform.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(166, 163, 111));
        loginform.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 320, 10));

        jTextField2.setBackground(new Color (0,0,0,0));
        jTextField2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jTextField2.setText("jTextField1");
        jTextField2.setBorder(null);
        loginform.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 320, 40));

        jSeparator2.setForeground(new java.awt.Color(166, 163, 111));
        loginform.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 320, 10));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.png"))); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.setBorder(null);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Untitled.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/button1_press.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        loginform.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));

        jPasswordField1.setBackground(new Color(0,0,0,0));
        jPasswordField1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        loginform.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 320, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(166, 163, 111));
        jLabel3.setText("Contraseña:");
        loginform.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(166, 163, 111));
        jLabel4.setText("Usuario:");
        loginform.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loginright.png"))); // NOI18N
        loginform.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loginleft2.png"))); // NOI18N
        loginform.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 300, 560));

        getContentPane().add(loginform);
        loginform.setBounds(30, 20, 1170, 740);

        setBounds(0, 0, 1230, 797);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu mn = new Menu();
        mn.setVisible(true);
                dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel loginform;
    // End of variables declaration//GEN-END:variables
}
