package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelIngresar extends javax.swing.JPanel {

    private JFrame ventana;
    private Sistema sistema;
    private JPanel actual;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Profesional> listaProfesionales;

    public PanelIngresar(JFrame unaVentana,
            Sistema unSistema) {
        initComponents();
        ventana = unaVentana;
        actual = new PanelRegistroUsuario(sistema, ventana);
        sistema = unSistema;
        listaUsuarios = sistema.getListaUsuarios();
        listaProfesionales = sistema.getListaProfesionales();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cajaContrasenia = new javax.swing.JTextField();
        etiquetaNombreUsuario = new javax.swing.JLabel();
        cajaNombreUsuario = new javax.swing.JTextField();
        etiquetaContrasenia = new javax.swing.JLabel();
        etiquetaNombreUsuario1 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        etiquetaMensajeAlAceptar = new javax.swing.JLabel();
        etiquetaErrorContrasenia = new javax.swing.JLabel();
        etiquetaErrorNombre = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1147, 784));

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setPreferredSize(new java.awt.Dimension(1147, 784));
        jPanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar sesión");
        jPanel.add(jLabel1);
        jLabel1.setBounds(420, 80, 290, 100);

        cajaContrasenia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel.add(cajaContrasenia);
        cajaContrasenia.setBounds(580, 300, 160, 35);

        etiquetaNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNombreUsuario.setText("¿Todavía se ha registrado?");
        jPanel.add(etiquetaNombreUsuario);
        etiquetaNombreUsuario.setBounds(340, 520, 290, 29);

        cajaNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel.add(cajaNombreUsuario);
        cajaNombreUsuario.setBounds(580, 250, 160, 35);

        etiquetaContrasenia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaContrasenia.setText("Contraseña:");
        jPanel.add(etiquetaContrasenia);
        etiquetaContrasenia.setBounds(390, 300, 180, 30);

        etiquetaNombreUsuario1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombreUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNombreUsuario1.setText("Nombre usuario:");
        jPanel.add(etiquetaNombreUsuario1);
        etiquetaNombreUsuario1.setBounds(390, 250, 180, 29);

        btnRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 0, 102));
        btnRegistrarse.setText("Regístrese ahora");
        btnRegistrarse.setContentAreaFilled(false);
        btnRegistrarse.setOpaque(true);
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel.add(btnRegistrarse);
        btnRegistrarse.setBounds(610, 520, 250, 30);

        btnIniciarSesion.setBackground(new java.awt.Color(255, 0, 102));
        btnIniciarSesion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Aceptar");
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setOpaque(true);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel.add(btnIniciarSesion);
        btnIniciarSesion.setBounds(530, 410, 210, 37);

        etiquetaMensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaMensajeAlAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel.add(etiquetaMensajeAlAceptar);
        etiquetaMensajeAlAceptar.setBounds(340, 380, 570, 26);

        etiquetaErrorContrasenia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaErrorContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel.add(etiquetaErrorContrasenia);
        etiquetaErrorContrasenia.setBounds(750, 300, 400, 30);

        etiquetaErrorNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaErrorNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel.add(etiquetaErrorNombre);
        etiquetaErrorNombre.setBounds(750, 250, 400, 30);

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

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        if (cajaNombreUsuario.getText().trim().isEmpty()) {
            etiquetaErrorNombre.setText("Debe completar este campo");
        }
        if (cajaContrasenia.getText().trim().isEmpty()) {
            etiquetaErrorContrasenia.setText("Debe completar este campo");
        }
        if (!etiquetaErrorNombre.getText().equals("") || !etiquetaErrorContrasenia.getText().equals("")) {
            etiquetaMensajeAlAceptar.setText("Error al ingresar usuario");
        } else {
            Usuario usuario = new Usuario();
            usuario.setNombreUsuario(cajaNombreUsuario.getText());
            Profesional profesional = new Profesional();
            profesional.setNombreUsuario(cajaNombreUsuario.getText());
            if (!listaUsuarios.contains(usuario)
                    && !listaProfesionales.contains(profesional)) {
                etiquetaErrorNombre.setText("Usuario no existente");
                etiquetaMensajeAlAceptar.setText("Error al ingresar usuario");
            } else if (listaUsuarios.contains(usuario)) {
                for (int i = 0; i < listaUsuarios.size(); i++) {
                    if (listaUsuarios.get(i).getNombreUsuario().equals(cajaNombreUsuario.getText())) {
                        if (listaUsuarios.get(i).getContrsenia().equals(cajaContrasenia.getText())) {
                            ventana.remove(this);
                            InterfazBotonesUsuario nuevaBotonera = new InterfazBotonesUsuario(sistema, ventana, listaUsuarios.get(i));
                            ventana.pack();
                        } else {
                            etiquetaMensajeAlAceptar.setText("Contraseña incorrecta");
                        }
                    }
                }
            } else {
                for (int i = 0; i < listaProfesionales.size(); i++) {
                    if (listaProfesionales.get(i).getNombreUsuario().equals(cajaNombreUsuario.getText())) {
                        if (listaProfesionales.get(i).getContrsenia().equals(cajaContrasenia.getText())) {
                            ventana.remove(this);
                            InterfazBotonesProfesional nuevaBotonera = new InterfazBotonesProfesional(sistema, ventana, listaProfesionales.get(i));
                            ventana.pack();
                        } else {
                            etiquetaMensajeAlAceptar.setText("Contraseña incorrecta");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        ventana.remove(this);
        ventana.add(new PanelRegistrar(sistema, ventana));
        ventana.pack();
    }//GEN-LAST:event_btnRegistrarseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JTextField cajaContrasenia;
    private javax.swing.JTextField cajaNombreUsuario;
    private javax.swing.JLabel etiquetaContrasenia;
    private javax.swing.JLabel etiquetaErrorContrasenia;
    private javax.swing.JLabel etiquetaErrorNombre;
    private javax.swing.JLabel etiquetaMensajeAlAceptar;
    private javax.swing.JLabel etiquetaNombreUsuario;
    private javax.swing.JLabel etiquetaNombreUsuario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}
