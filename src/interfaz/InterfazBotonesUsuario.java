package interfaz;

import dominio.Sistema;
import dominio.Usuario;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfazBotonesUsuario extends javax.swing.JPanel {

    private Sistema sistema;
    private JPanel actual;
    private JFrame ventana;
    private Usuario usuarioActual;

    public InterfazBotonesUsuario(Sistema unSistema, JFrame unaVentana,
            Usuario unUsuario) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        usuarioActual = unUsuario;
        actual = new PanelHomeUsuario(sistema, this, ventana);
        ventana.add(this);
        ventana.add(actual);
        etiquetaUsuarioActual.setText(" Bienvenido, "
                + this.usuarioActual.getNombre());
    }

    public JPanel getActual() {
        return actual;
    }

    public void setActual(JPanel actual) {
        this.actual = actual;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotonesUsuario = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        etiquetaUsuarioActual = new javax.swing.JLabel();
        btnPedirPlan = new javax.swing.JButton();
        btnConsultaDirecta = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnAgregarComida = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(250, 784));
        setLayout(null);

        panelBotonesUsuario.setBackground(new java.awt.Color(204, 255, 153));
        panelBotonesUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBotonesUsuario.setMinimumSize(new java.awt.Dimension(250, 784));
        panelBotonesUsuario.setPreferredSize(new java.awt.Dimension(250, 784));
        panelBotonesUsuario.setLayout(null);

        btnHome.setBackground(new java.awt.Color(255, 0, 102));
        btnHome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.setContentAreaFilled(false);
        btnHome.setOpaque(true);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        panelBotonesUsuario.add(btnHome);
        btnHome.setBounds(2, 36, 250, 46);

        etiquetaUsuarioActual.setBackground(new java.awt.Color(255, 0, 102));
        etiquetaUsuarioActual.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        etiquetaUsuarioActual.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUsuarioActual.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaUsuarioActual.setOpaque(true);
        panelBotonesUsuario.add(etiquetaUsuarioActual);
        etiquetaUsuarioActual.setBounds(0, 580, 300, 42);

        btnPedirPlan.setBackground(new java.awt.Color(255, 0, 102));
        btnPedirPlan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPedirPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnPedirPlan.setText("Pedir Plan");
        btnPedirPlan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPedirPlan.setContentAreaFilled(false);
        btnPedirPlan.setOpaque(true);
        btnPedirPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirPlanActionPerformed(evt);
            }
        });
        panelBotonesUsuario.add(btnPedirPlan);
        btnPedirPlan.setBounds(2, 231, 250, 43);

        btnConsultaDirecta.setBackground(new java.awt.Color(255, 0, 102));
        btnConsultaDirecta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConsultaDirecta.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaDirecta.setText("Consulta Directa");
        btnConsultaDirecta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultaDirecta.setContentAreaFilled(false);
        btnConsultaDirecta.setOpaque(true);
        btnConsultaDirecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaDirectaActionPerformed(evt);
            }
        });
        panelBotonesUsuario.add(btnConsultaDirecta);
        btnConsultaDirecta.setBounds(2, 167, 250, 43);

        btnPerfil.setBackground(new java.awt.Color(255, 0, 102));
        btnPerfil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfil.setText("Perfil");
        btnPerfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setOpaque(true);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        panelBotonesUsuario.add(btnPerfil);
        btnPerfil.setBounds(2, 103, 250, 43);

        btnAgregarComida.setBackground(new java.awt.Color(255, 0, 102));
        btnAgregarComida.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        btnAgregarComida.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarComida.setText(" Agregar Comida a Dieta");
        btnAgregarComida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarComida.setContentAreaFilled(false);
        btnAgregarComida.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarComida.setOpaque(true);
        btnAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComidaActionPerformed(evt);
            }
        });
        panelBotonesUsuario.add(btnAgregarComida);
        btnAgregarComida.setBounds(2, 295, 250, 45);

        btnSalir.setBackground(new java.awt.Color(255, 0, 102));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Cerrar sesión");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setContentAreaFilled(false);
        btnSalir.setOpaque(true);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelBotonesUsuario.add(btnSalir);
        btnSalir.setBounds(0, 660, 250, 43);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.png"))); // NOI18N
        panelBotonesUsuario.add(fondo);
        fondo.setBounds(0, -20, 250, 810);

        add(panelBotonesUsuario);
        panelBotonesUsuario.setBounds(-1, 0, 250, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        ventana.remove(actual);
        actual = new PanelHomeUsuario(sistema, this, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnPedirPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirPlanActionPerformed
        ventana.remove(actual);
        actual = new PanelPlanAlimentacionUsuario(sistema, ventana, this);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnPedirPlanActionPerformed

    private void btnConsultaDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaDirectaActionPerformed
        ventana.remove(actual);
        actual = new PanelConsultaProfesional(sistema, this, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnConsultaDirectaActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        ventana.remove(actual);
        actual = new PanelPerfilUsuario(sistema, ventana, this);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaActionPerformed
        ventana.remove(actual);
        actual = new PanelDietaDiariaUsuario(sistema, ventana, this);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnAgregarComidaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ventana.remove(actual);
        ventana.remove(PanelHomeUsuario.getInterfaz());
        actual = new PanelIngresar(ventana, sistema);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComida;
    private javax.swing.JButton btnConsultaDirecta;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPedirPlan;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel etiquetaUsuarioActual;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel panelBotonesUsuario;
    // End of variables declaration//GEN-END:variables
}
