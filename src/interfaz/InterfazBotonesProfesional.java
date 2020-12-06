package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfazBotonesProfesional extends javax.swing.JPanel {

    private Sistema sistema;
    private JFrame ventana;
    private JPanel actual;
    private Profesional usuarioActivo;

    public InterfazBotonesProfesional(Sistema unSistema, JFrame unaVentana,
            Profesional unProfesional) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        usuarioActivo = unProfesional;
        actual = new PanelHomeProfesional(unSistema, this, unaVentana);
        ventana.add(this);
        ventana.add(actual);
        etiquetaUsuarioActual.setText(" Bienvenido, "
                + unProfesional.getNombre());
    }

    public JPanel getActual() {
        return actual;
    }

    public void setActual(JPanel actual) {
        this.actual = actual;
    }

    public Profesional getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(Profesional usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHome = new javax.swing.JButton();
        etiquetaUsuarioActual = new javax.swing.JLabel();
        btnRealizarPlan = new javax.swing.JButton();
        btnConsultaDirecta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 153));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(250, 784));
        setLayout(null);

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
        add(btnHome);
        btnHome.setBounds(2, 32, 258, 41);

        etiquetaUsuarioActual.setBackground(new java.awt.Color(255, 0, 102));
        etiquetaUsuarioActual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etiquetaUsuarioActual.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUsuarioActual.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaUsuarioActual.setOpaque(true);
        add(etiquetaUsuarioActual);
        etiquetaUsuarioActual.setBounds(0, 600, 282, 42);

        btnRealizarPlan.setBackground(new java.awt.Color(255, 0, 102));
        btnRealizarPlan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRealizarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarPlan.setText("Realizar Plan");
        btnRealizarPlan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRealizarPlan.setContentAreaFilled(false);
        btnRealizarPlan.setOpaque(true);
        btnRealizarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPlanActionPerformed(evt);
            }
        });
        add(btnRealizarPlan);
        btnRealizarPlan.setBounds(2, 91, 258, 44);

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
        add(btnConsultaDirecta);
        btnConsultaDirecta.setBounds(0, 160, 260, 43);

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
        add(btnSalir);
        btnSalir.setBounds(0, 660, 258, 43);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.png"))); // NOI18N
        add(fondo);
        fondo.setBounds(0, 0, 260, 784);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        ventana.remove(actual);
        actual = new PanelHomeProfesional(sistema, this, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnConsultaDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaDirectaActionPerformed
        ventana.remove(actual);
        actual = new PanelConsultaProfesionalDesdeProfesional(sistema, this, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnConsultaDirectaActionPerformed

    private void btnRealizarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPlanActionPerformed
        ventana.remove(actual);
        actual = new PanelSeleccionarPlanARealizar(sistema, this, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnRealizarPlanActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ventana.remove(actual);
        ventana.remove(PanelHomeProfesional.getInterfaz());
        actual = new PanelIngresar(ventana, sistema);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaDirecta;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRealizarPlan;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel etiquetaUsuarioActual;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
