package Controllers;

import Views.CompraEquipo.frmCompraEquipo;
import Views.Consultas.lEmpleados;
import Views.Consultas.lEquipos;
import Views.Consultas.lProveedores;
import Views.Consultas.lSolicitudes;
import Views.Empleado.frmEmpleado;
import Views.Equipo.frmEquipo;
import Views.Proveedor.frmProveedor;
import Views.Solicitud.FrmSolicitud1;
import Views.Solicitud.FrmSolicitud2;
import Views.usuario.frmUsuario;
import Views.Consultas.lUsuarios;
import Views.Empleado.frmEditarDatos;
import WebServices.Usuarios;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author mdeodanes
 */
public class frmAdmin extends javax.swing.JFrame {

    Usuarios perfil;

    public frmAdmin(Usuarios user) {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        setIconImage(getIconImage());

        lblUsuarioLogin.setText(user.getNombre());
        lblRolUsuario.setText(user.getPrivilegio());

        if (user.getIdPrivilegio() == 1) {
        } else if (user.getIdPrivilegio() == 2) {

              mbMantenimiento.setVisible(false);
            mbConsultas.setVisible(false);
            btnUsuarioMan.setVisible(false);
            btnEquiposMan.setVisible(false);
            btnEmpleadoMan.setVisible(false);
            btnProveedorMan.setVisible(false);
            btnSolicitudMan.setVisible(false);
            btnCompraequipoMan.setVisible(false);

        } else {

            mbMantenimiento.setEnabled(false);
            btnUsuarioMan.setEnabled(false);
            btnEquiposMan.setEnabled(false);
            miListarEquipos.setEnabled(false);
             miListarUsuarios.setEnabled(false);
                   
        }

        perfil = user;
        this.setExtendedState(this.MAXIMIZED_BOTH);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    }

    public Image getIconImage() {

        Image IconImage = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/IconImage.png"));
        return IconImage;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JDesktopPane();
        btnUsuarioMan = new javax.swing.JButton();
        btnEmpleadoMan = new javax.swing.JButton();
        btnEquiposMan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblUsuarioLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRolUsuario = new javax.swing.JLabel();
        btnProveedorMan = new javax.swing.JButton();
        btnSolicitudUsuario = new javax.swing.JButton();
        btnActualizaremp = new javax.swing.JButton();
        btnSolicitudMan = new javax.swing.JButton();
        btnCompraequipoMan = new javax.swing.JButton();
        nav = new javax.swing.JMenuBar();
        mbMantenimiento = new javax.swing.JMenu();
        miUsuarios = new javax.swing.JMenuItem();
        miEmpleados = new javax.swing.JMenuItem();
        miEquipos = new javax.swing.JMenuItem();
        miProveedores = new javax.swing.JMenuItem();
        miSolicitudes = new javax.swing.JMenuItem();
        miCompraEquipos = new javax.swing.JMenuItem();
        mbConsultas = new javax.swing.JMenu();
        miListarUsuarios = new javax.swing.JMenuItem();
        miListarEmpleados = new javax.swing.JMenuItem();
        miListarEquipos = new javax.swing.JMenuItem();
        miListarProveedores = new javax.swing.JMenuItem();
        miListarSolicitudes = new javax.swing.JMenuItem();
        miListarCompraEquipos = new javax.swing.JMenuItem();
        mbSolicitud = new javax.swing.JMenu();
        miSolicitud = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu administrador");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1920, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Panel.setBackground(new java.awt.Color(249, 249, 249));
        Panel.setPreferredSize(new java.awt.Dimension(1920, 1080));

        btnUsuarioMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contrasena.png"))); // NOI18N
        btnUsuarioMan.setText("Gestionar Usuario");
        btnUsuarioMan.setBorderPainted(false);
        btnUsuarioMan.setContentAreaFilled(false);
        btnUsuarioMan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarioMan.setFocusPainted(false);
        btnUsuarioMan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarioMan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuarioMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioManActionPerformed(evt);
            }
        });

        btnEmpleadoMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mantenimiento-empleado.png"))); // NOI18N
        btnEmpleadoMan.setText("Gestionar Empleado");
        btnEmpleadoMan.setBorderPainted(false);
        btnEmpleadoMan.setContentAreaFilled(false);
        btnEmpleadoMan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleadoMan.setFocusPainted(false);
        btnEmpleadoMan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpleadoMan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmpleadoMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoManActionPerformed(evt);
            }
        });

        btnEquiposMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mantenimiento-equipos.png"))); // NOI18N
        btnEquiposMan.setText("Gestionar Equipo");
        btnEquiposMan.setBorderPainted(false);
        btnEquiposMan.setContentAreaFilled(false);
        btnEquiposMan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEquiposMan.setFocusPainted(false);
        btnEquiposMan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEquiposMan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEquiposMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquiposManActionPerformed(evt);
            }
        });

        jLabel1.setText("Bienvenido :");

        lblUsuarioLogin.setText("logueado");

        jLabel2.setText("Rol :");

        lblRolUsuario.setText("RolLogueado");

        btnProveedorMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mantenimiento-proveedor.png"))); // NOI18N
        btnProveedorMan.setText("Gestionar Proveedor");
        btnProveedorMan.setBorderPainted(false);
        btnProveedorMan.setContentAreaFilled(false);
        btnProveedorMan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedorMan.setFocusPainted(false);
        btnProveedorMan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProveedorMan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProveedorMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorManActionPerformed(evt);
            }
        });

        btnSolicitudUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/request.png"))); // NOI18N
        btnSolicitudUsuario.setText("Realizar solicitud");
        btnSolicitudUsuario.setBorderPainted(false);
        btnSolicitudUsuario.setContentAreaFilled(false);
        btnSolicitudUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSolicitudUsuario.setFocusPainted(false);
        btnSolicitudUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSolicitudUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSolicitudUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudUsuarioActionPerformed(evt);
            }
        });

        btnActualizaremp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editardatos.png"))); // NOI18N
        btnActualizaremp.setText("Editar mis datos");
        btnActualizaremp.setContentAreaFilled(false);
        btnActualizaremp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizaremp.setFocusPainted(false);
        btnActualizaremp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizaremp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizaremp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarempActionPerformed(evt);
            }
        });

        btnSolicitudMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/solicitudes.png"))); // NOI18N
        btnSolicitudMan.setText("Gestionar Solicitud");
        btnSolicitudMan.setBorderPainted(false);
        btnSolicitudMan.setContentAreaFilled(false);
        btnSolicitudMan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSolicitudMan.setFocusPainted(false);
        btnSolicitudMan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSolicitudMan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSolicitudMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudManActionPerformed(evt);
            }
        });

        btnCompraequipoMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compra-equipo.png"))); // NOI18N
        btnCompraequipoMan.setText("Gestionar Compra");
        btnCompraequipoMan.setBorderPainted(false);
        btnCompraequipoMan.setContentAreaFilled(false);
        btnCompraequipoMan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompraequipoMan.setFocusPainted(false);
        btnCompraequipoMan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompraequipoMan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCompraequipoMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraequipoManActionPerformed(evt);
            }
        });

        Panel.setLayer(btnUsuarioMan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(btnEmpleadoMan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(btnEquiposMan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(lblUsuarioLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(lblRolUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(btnProveedorMan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(btnSolicitudUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(btnActualizaremp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(btnSolicitudMan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(btnCompraequipoMan, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(756, 756, 756)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUsuarioLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRolUsuario))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSolicitudMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUsuarioMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(94, 94, 94)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEmpleadoMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSolicitudUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEquiposMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizaremp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCompraequipoMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProveedorMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(477, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblRolUsuario)
                    .addComponent(lblUsuarioLogin))
                .addGap(228, 228, 228)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEmpleadoMan)
                    .addComponent(btnUsuarioMan)
                    .addComponent(btnEquiposMan)
                    .addComponent(btnProveedorMan))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizaremp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSolicitudMan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSolicitudUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCompraequipoMan, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(457, 457, 457))
        );

        getContentPane().add(Panel, java.awt.BorderLayout.CENTER);

        nav.setBorder(null);
        nav.setForeground(new java.awt.Color(100, 114, 158));
        nav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        mbMantenimiento.setText("Mantenimiento");

        miUsuarios.setText("Usuarios");
        miUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUsuariosActionPerformed(evt);
            }
        });
        mbMantenimiento.add(miUsuarios);

        miEmpleados.setText("Empleados");
        miEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEmpleadosActionPerformed(evt);
            }
        });
        mbMantenimiento.add(miEmpleados);

        miEquipos.setText("Equipos");
        miEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEquiposActionPerformed(evt);
            }
        });
        mbMantenimiento.add(miEquipos);

        miProveedores.setText("Proveedores");
        miProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProveedoresActionPerformed(evt);
            }
        });
        mbMantenimiento.add(miProveedores);

        miSolicitudes.setText("Solicitudes");
        miSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSolicitudesActionPerformed(evt);
            }
        });
        mbMantenimiento.add(miSolicitudes);

        miCompraEquipos.setText("Compra de Equipos");
        miCompraEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCompraEquiposActionPerformed(evt);
            }
        });
        mbMantenimiento.add(miCompraEquipos);

        nav.add(mbMantenimiento);

        mbConsultas.setText("Consultas");

        miListarUsuarios.setText("Usuarios");
        miListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarUsuariosActionPerformed(evt);
            }
        });
        mbConsultas.add(miListarUsuarios);

        miListarEmpleados.setText("Empleados");
        miListarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarEmpleadosActionPerformed(evt);
            }
        });
        mbConsultas.add(miListarEmpleados);

        miListarEquipos.setText("Equipos");
        miListarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarEquiposActionPerformed(evt);
            }
        });
        mbConsultas.add(miListarEquipos);

        miListarProveedores.setText("Proveedores");
        miListarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarProveedoresActionPerformed(evt);
            }
        });
        mbConsultas.add(miListarProveedores);

        miListarSolicitudes.setText("Solicitudes");
        miListarSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarSolicitudesActionPerformed(evt);
            }
        });
        mbConsultas.add(miListarSolicitudes);

        miListarCompraEquipos.setText("Compras");
        miListarCompraEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarCompraEquiposActionPerformed(evt);
            }
        });
        mbConsultas.add(miListarCompraEquipos);

        nav.add(mbConsultas);

        mbSolicitud.setText("Solicitud");

        miSolicitud.setText("Realizar Solicitud");
        miSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSolicitudActionPerformed(evt);
            }
        });
        mbSolicitud.add(miSolicitud);

        nav.add(mbSolicitud);

        jMenu3.setText("Salir");

        miSalir.setText("Salir del sistema");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        jMenu3.add(miSalir);

        nav.add(jMenu3);

        setJMenuBar(nav);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEmpleadosActionPerformed
        // TODO add your handling code here:
        frmEmpleado iframe = new frmEmpleado();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_miEmpleadosActionPerformed

    private void miUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUsuariosActionPerformed
        // TODO add your handling code here:
        frmUsuario iframe = new frmUsuario();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);

    }//GEN-LAST:event_miUsuariosActionPerformed

    //DefaultCloseOperation

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.YES_NO_OPTION;
        int confirmarSalir = JOptionPane.showConfirmDialog(this, "Estas seguro de salir del sistema?", "Advertencia", JOptionPane.YES_NO_OPTION);

        if (confirmarSalir == 0) {
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Un gusto tenerte de nuevo");

        }
    }//GEN-LAST:event_miSalirActionPerformed

    private void salir() {

        int a = JOptionPane.YES_NO_OPTION;

        int confirmarSalir = JOptionPane.showConfirmDialog(this, "Estas seguro de salir del sistema?", "Advertencia", JOptionPane.YES_NO_OPTION);

        if (confirmarSalir == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (confirmarSalir == JOptionPane.NO_OPTION) {

            JOptionPane.showMessageDialog(null, "Un gusto tenerte de nuevo");

        }

    }

    private void btnUsuarioManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioManActionPerformed
        // TODO add your handling code here:
        frmUsuario iframe = new frmUsuario();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_btnUsuarioManActionPerformed

    private void btnEmpleadoManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoManActionPerformed
        // TODO add your handling code here:

        frmEmpleado iframe = new frmEmpleado();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_btnEmpleadoManActionPerformed

    private void miEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEquiposActionPerformed
        // TODO add your handling code here:
        frmEquipo iframe = new frmEquipo();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_miEquiposActionPerformed

    private void btnEquiposManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquiposManActionPerformed
        // TODO add your handling code here:
        frmEquipo iframe = new frmEquipo();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_btnEquiposManActionPerformed

    private void miProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProveedoresActionPerformed
        // TODO add your handling code here:
        frmProveedor iframe = new frmProveedor();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_miProveedoresActionPerformed

    private void btnProveedorManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorManActionPerformed
        // TODO add your handling code here:
        frmProveedor iframe = new frmProveedor();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_btnProveedorManActionPerformed

    private void miSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSolicitudActionPerformed
        // TODO add your handling code here:
        FrmSolicitud2 iframe = new FrmSolicitud2();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_miSolicitudActionPerformed

    private void miSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSolicitudesActionPerformed
        // TODO add your handling code here:

        FrmSolicitud1 iframe = new FrmSolicitud1();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_miSolicitudesActionPerformed

    private void btnSolicitudUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudUsuarioActionPerformed
        // TODO add your handling code here:
        FrmSolicitud2 iframe = new FrmSolicitud2();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_btnSolicitudUsuarioActionPerformed

    private void miListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarUsuariosActionPerformed
        // TODO add your handling code here:
        lUsuarios iframe = new lUsuarios();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);

    }//GEN-LAST:event_miListarUsuariosActionPerformed

    private void miListarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarEmpleadosActionPerformed
        // TODO add your handling code here:
        lEmpleados iframe = new lEmpleados();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_miListarEmpleadosActionPerformed

    private void miListarEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarEquiposActionPerformed
        // TODO add your handling code here:
        lEquipos iframe = new lEquipos();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_miListarEquiposActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_formWindowClosing

    private void miListarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarProveedoresActionPerformed
        // TODO add your handling code here:
        lProveedores iframe = new lProveedores();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_miListarProveedoresActionPerformed

    private void miListarSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarSolicitudesActionPerformed
        // TODO add your handling code here:
        lSolicitudes iframe = new lSolicitudes();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_miListarSolicitudesActionPerformed

    private void btnActualizarempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarempActionPerformed
        // TODO add your handling code here:
         frmEditarDatos iframe = new frmEditarDatos();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_btnActualizarempActionPerformed

    private void miCompraEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCompraEquiposActionPerformed
        // TODO add your handling code here:
        frmCompraEquipo iframe = new frmCompraEquipo();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_miCompraEquiposActionPerformed

    private void miListarCompraEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarCompraEquiposActionPerformed
        // TODO add your handling code here:
        frmCompraEquipo iframe = new frmCompraEquipo();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_miListarCompraEquiposActionPerformed

    private void btnSolicitudManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudManActionPerformed
        // TODO add your handling code here:
        FrmSolicitud1 iframe = new FrmSolicitud1();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_btnSolicitudManActionPerformed

    private void btnCompraequipoManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraequipoManActionPerformed
        // TODO add your handling code here:
        frmCompraEquipo iframe = new frmCompraEquipo();
        Panel.setVisible(true);
        //Panel.add(iframeUser);
        iframe.setVisible(true);
    }//GEN-LAST:event_btnCompraequipoManActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                //new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Panel;
    private javax.swing.JButton btnActualizaremp;
    private javax.swing.JButton btnCompraequipoMan;
    private javax.swing.JButton btnEmpleadoMan;
    private javax.swing.JButton btnEquiposMan;
    private javax.swing.JButton btnProveedorMan;
    private javax.swing.JButton btnSolicitudMan;
    private javax.swing.JButton btnSolicitudUsuario;
    private javax.swing.JButton btnUsuarioMan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JLabel lblRolUsuario;
    private javax.swing.JLabel lblUsuarioLogin;
    private javax.swing.JMenu mbConsultas;
    private javax.swing.JMenu mbMantenimiento;
    private javax.swing.JMenu mbSolicitud;
    private javax.swing.JMenuItem miCompraEquipos;
    private javax.swing.JMenuItem miEmpleados;
    private javax.swing.JMenuItem miEquipos;
    private javax.swing.JMenuItem miListarCompraEquipos;
    private javax.swing.JMenuItem miListarEmpleados;
    private javax.swing.JMenuItem miListarEquipos;
    private javax.swing.JMenuItem miListarProveedores;
    private javax.swing.JMenuItem miListarSolicitudes;
    private javax.swing.JMenuItem miListarUsuarios;
    private javax.swing.JMenuItem miProveedores;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JMenuItem miSolicitud;
    private javax.swing.JMenuItem miSolicitudes;
    private javax.swing.JMenuItem miUsuarios;
    private javax.swing.JMenuBar nav;
    // End of variables declaration//GEN-END:variables
}
