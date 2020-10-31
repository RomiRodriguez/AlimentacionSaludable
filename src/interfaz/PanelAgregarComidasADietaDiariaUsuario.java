package interfaz;

import dominio.Alimento;
import dominio.Sistema;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;


public class PanelAgregarComidasADietaDiariaUsuario extends javax.swing.JPanel {

    private Sistema sistema;
    private JFrame ventana;
    private InterfazBotonesUsuario interfaz;

    public PanelAgregarComidasADietaDiariaUsuario(Sistema unSistema,
            JFrame unaVentana, InterfazBotonesUsuario unaInterfaz) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        interfaz = unaInterfaz;
        listaComidasDiarias.setListData(sistema.getListaAlimentos().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarComida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaComidasDiarias = new javax.swing.JList();
        etiquetaTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        textoAviso = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        btnAgregarComida.setBackground(new java.awt.Color(255, 0, 102));
        btnAgregarComida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAgregarComida.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarComida.setText("Agregar Comida");
        btnAgregarComida.setContentAreaFilled(false);
        btnAgregarComida.setOpaque(true);
        btnAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComidaActionPerformed(evt);
            }
        });
        add(btnAgregarComida);
        btnAgregarComida.setBounds(420, 540, 210, 35);

        listaComidasDiarias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaComidasDiarias);

        add(jScrollPane1);
        jScrollPane1.setBounds(340, 100, 370, 410);

        etiquetaTitulo.setBackground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setText("Agregar Comida");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(390, 10, 270, 50);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        add(btnVolver);
        btnVolver.setBounds(0, 10, 110, 70);

        textoAviso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoAviso.setForeground(new java.awt.Color(255, 0, 153));
        textoAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoAviso.setText("texto");
        textoAviso.setToolTipText("");
        textoAviso.setVisible(false);
        add(textoAviso);
        textoAviso.setBounds(280, 600, 520, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaActionPerformed
        Alimento comidaSeleccionada = (Alimento) listaComidasDiarias.getSelectedValue();
        interfaz.getUsuarioActual().getHistorialDelDia().getComidasIngeridas().add(comidaSeleccionada);
        LocalDate diaActual = LocalDate.now();
        interfaz.getUsuarioActual().setFechaUltimaAdicion(diaActual.toString());
        if (listaComidasDiarias.isSelectionEmpty()){
        //mostrar que no se aggrego nada
        textoAviso.setText("No se agregó ninguna comida");
        
        }else{
        //mostrar que se agrego algo
        textoAviso.setText("La comida se agregó correctamente");
        }
        textoAviso.setVisible(true);
        
        
    }//GEN-LAST:event_btnAgregarComidaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventana.remove(this);
        PanelDietaDiariaUsuario nuevo = new PanelDietaDiariaUsuario(sistema, ventana, interfaz);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComida;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaComidasDiarias;
    private javax.swing.JLabel textoAviso;
    // End of variables declaration//GEN-END:variables
}
