package interfaz;

import dominio.Sistema;
import javax.swing.JFrame;

public class PanelRegistrar extends javax.swing.JPanel {

    private Sistema sistema;
    private JFrame ventana;

    public PanelRegistrar(Sistema unSistema, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        ventana.add(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        etiquetaREgistro = new javax.swing.JLabel();
        etiquetaEstaRegistrado = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnRegistroProfesional = new javax.swing.JButton();
        btnRegistroUsuario = new javax.swing.JButton();

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setPreferredSize(new java.awt.Dimension(1147, 784));
        jPanel.setLayout(null);

        etiquetaREgistro.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        etiquetaREgistro.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaREgistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaREgistro.setText("Registro");
        jPanel.add(etiquetaREgistro);
        etiquetaREgistro.setBounds(420, 80, 290, 100);

        etiquetaEstaRegistrado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaEstaRegistrado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaEstaRegistrado.setText("¿Ya está registrado?");
        jPanel.add(etiquetaEstaRegistrado);
        etiquetaEstaRegistrado.setBounds(370, 520, 230, 29);

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 0, 102));
        btnIngresar.setText("Ingrese");
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setOpaque(true);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel.add(btnIngresar);
        btnIngresar.setBounds(620, 520, 100, 30);

        btnRegistroProfesional.setBackground(new java.awt.Color(255, 0, 102));
        btnRegistroProfesional.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRegistroProfesional.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroProfesional.setText("Profesional");
        btnRegistroProfesional.setContentAreaFilled(false);
        btnRegistroProfesional.setOpaque(true);
        btnRegistroProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroProfesionalActionPerformed(evt);
            }
        });
        jPanel.add(btnRegistroProfesional);
        btnRegistroProfesional.setBounds(590, 330, 210, 37);

        btnRegistroUsuario.setBackground(new java.awt.Color(255, 0, 102));
        btnRegistroUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRegistroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroUsuario.setText("Usuario");
        btnRegistroUsuario.setContentAreaFilled(false);
        btnRegistroUsuario.setOpaque(true);
        btnRegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroUsuarioActionPerformed(evt);
            }
        });
        jPanel.add(btnRegistroUsuario);
        btnRegistroUsuario.setBounds(340, 330, 210, 37);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        ventana.remove(this);
        ventana.add(new PanelIngresar(ventana, sistema));
        ventana.pack();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegistroProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroProfesionalActionPerformed
        ventana.remove(this);
        ventana.add(new PanelRegistroProfesional(sistema, ventana));
        ventana.pack();
    }//GEN-LAST:event_btnRegistroProfesionalActionPerformed

    private void btnRegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroUsuarioActionPerformed
        ventana.remove(this);
        ventana.add(new PanelRegistroUsuario(sistema, ventana));
        ventana.pack();
    }//GEN-LAST:event_btnRegistroUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistroProfesional;
    private javax.swing.JButton btnRegistroUsuario;
    private javax.swing.JLabel etiquetaEstaRegistrado;
    private javax.swing.JLabel etiquetaREgistro;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}
