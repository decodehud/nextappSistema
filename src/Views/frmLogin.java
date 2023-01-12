/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.frmAdmin;
import Controllers.frmUser;
import javax.swing.JOptionPane;
import WebServices.WebServices;
import WebServices.Usuarios;
import WebServices.WebServices_Service;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author mdeodanes
 */
public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();
        setIconImage(getIconImage());
        this.hiddenPassword.setVisible(false);

    }

    @SuppressWarnings("unchecked")

    WebServices_Service service = new WebServices_Service();
    WebServices Data = service.getWebServicesPort();
    Usuarios user;

    int r, a;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        showPassword = new javax.swing.JLabel();
        hiddenPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesion");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        setResizable(false);

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel.setMinimumSize(new java.awt.Dimension(100, 700));
        Panel.setLayout(null);

        showPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/showPassword.png"))); // NOI18N
        showPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPasswordMouseClicked(evt);
            }
        });
        Panel.add(showPassword);
        showPassword.setBounds(400, 280, 47, 47);

        hiddenPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hiddenPassword.png"))); // NOI18N
        hiddenPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hiddenPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hiddenPasswordMouseClicked(evt);
            }
        });
        Panel.add(hiddenPassword);
        hiddenPassword.setBounds(400, 280, 47, 47);

        txtUsername.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtUsername.setBorder(null);
        Panel.add(txtUsername);
        txtUsername.setBounds(160, 140, 280, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/username.png"))); // NOI18N
        Panel.add(jLabel4);
        jLabel4.setBounds(150, 110, 300, 78);

        txtPassword.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtPassword.setBorder(null);
        Panel.add(txtPassword);
        txtPassword.setBounds(160, 280, 240, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        Panel.add(jLabel2);
        jLabel2.setBounds(150, 250, 300, 78);

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logins.png"))); // NOI18N
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setFocusPainted(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        Panel.add(btnIngresar);
        btnIngresar.setBounds(180, 370, 238, 70);

        jLabel3.setBackground(new java.awt.Color(100, 114, 158));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 114, 158));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("All right reserved 2022 - Programacion III");
        jLabel3.setEnabled(false);
        Panel.add(jLabel3);
        jLabel3.setBounds(130, 560, 330, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public Image getIconImage() {

        Image IconImage = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/IconImage.png"));
        return IconImage;

    }
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:

        IniciarSession();

    }//GEN-LAST:event_btnIngresarActionPerformed

    public void IniciarSession() {

        user = Data.validarUsuario(txtUsername.getText(), txtPassword.getText());

        if (txtUsername.getText().trim().isEmpty() && txtPassword.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Ingresa usuario o contraseña", "Advertencia", JOptionPane.INFORMATION_MESSAGE);

        } else {

            if (user.getIdUsuario() > 0) {

                if (user.getEstado() > 0) {

                    if (user.getIdPrivilegio() != 2 && user.getIdPrivilegio() != 4) {
                        frmAdmin menu = new frmAdmin(user);
                        this.hide();
                        menu.setVisible(true);
                        //new frmMenu().setVisible(true);

                    } else if (user.getIdPrivilegio() == 2) {

                        frmUser menu = new frmUser(user);
                        this.hide();
                        menu.setVisible(true);
                        //new frmMenu().setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(this, "No tiene un rol asignado", "Warning", JOptionPane.INFORMATION_MESSAGE);

                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Usuario se encuentra inactivo", "Inactivo", JOptionPane.INFORMATION_MESSAGE);

                }

            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contrasena incorrecta", "Acceso denegado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void showPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMouseClicked
        // TODO add your handling code here:
        showPassword.setVisible(false);
        hiddenPassword.setVisible(true);
        txtPassword.setEchoChar((char) 0);

    }//GEN-LAST:event_showPasswordMouseClicked

    private void hiddenPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hiddenPasswordMouseClicked
        // TODO add your handling code here:
        showPassword.setVisible(true);
        hiddenPassword.setVisible(false);
        txtPassword.setEchoChar(('•'));
    }//GEN-LAST:event_hiddenPasswordMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel hiddenPassword;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel showPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
