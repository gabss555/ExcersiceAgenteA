/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.sena.exerciseagentea.view;

import co.edu.sena.exerciseagentea.controller.IShedController;
import co.edu.sena.exerciseagentea.controller.ShedController;
import co.edu.sena.exerciseagentea.model.Shed;
import co.edu.sena.exerciseagentea.utils.MessageUtils;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Fecha: 23/10/2026
 * @author gabriela Isaziga
 * Objetivo: vista galpon
 */
public class JFrameShed extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrameShed.class.getName());
    private IShedController shedController = new ShedController();
    

    /**
     * Creates new form JFrameShed
     */
    public JFrameShed() {
        initComponents();
        fillTable();
    }
    
    public void fillTable()
    {
        DefaultTableModel model = new DefaultTableModel();
        jTableSheds.setModel(model);
        //columnas
        model.addColumn("Número");
        model.addColumn("Estado");
        
        //filas
        String[] rows = new String[2];
        for (Shed shed : ShedController.shedList) {
            rows[0] = String.valueOf(shed.getNumber());
            rows[1] = shed.getStatus();
            model.addRow(rows);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InfoGalpones = new javax.swing.JLabel();
        Numbergalpon = new javax.swing.JLabel();
        EstadoGalpon = new javax.swing.JLabel();
        SpaceText = new javax.swing.JTextField();
        BotonCreation = new javax.swing.JButton();
        BotonActualization = new javax.swing.JButton();
        Botonclean = new javax.swing.JButton();
        BotonClean = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSheds = new javax.swing.JTable();
        CajaLista = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GALPONES");
        setBackground(new java.awt.Color(255, 255, 255));

        InfoGalpones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InfoGalpones.setText("Gestión de inforamión galpones");

        Numbergalpon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Numbergalpon.setText("Número galpón");

        EstadoGalpon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EstadoGalpon.setText("Estado galpón");

        BotonCreation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonCreation.setText("Crear");
        BotonCreation.addActionListener(this::BotonCreationActionPerformed);

        BotonActualization.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonActualization.setText("Actualizar");
        BotonActualization.addActionListener(this::BotonActualizationActionPerformed);

        Botonclean.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Botonclean.setText("Eliminar");
        Botonclean.setEnabled(false);
        Botonclean.addActionListener(this::BotoncleanActionPerformed);

        BotonClean.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonClean.setText("Limpiar");
        BotonClean.addActionListener(this::BotonCleanActionPerformed);

        jTableSheds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableSheds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableShedsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSheds);

        CajaLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISPONIBLE", "OCUPADO", " " }));
        CajaLista.addActionListener(this::CajaListaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonCreation)
                    .addComponent(Numbergalpon))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(SpaceText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(BotonActualization)))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Botonclean)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonClean))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EstadoGalpon)
                        .addGap(18, 18, 18)
                        .addComponent(CajaLista, 0, 127, Short.MAX_VALUE)))
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(InfoGalpones)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(InfoGalpones)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Numbergalpon)
                    .addComponent(EstadoGalpon)
                    .addComponent(SpaceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCreation)
                    .addComponent(BotonActualization)
                    .addComponent(Botonclean)
                    .addComponent(BotonClean))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CajaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaListaActionPerformed
        clear();
    }//GEN-LAST:event_CajaListaActionPerformed

    private void BotonCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCreationActionPerformed
        
        try
        {
        
        Shed shed = new Shed();
        shed.setNumber(Integer.parseInt(SpaceText.getText()));
        shed.setStatus(CajaLista.getSelectedItem().toString());
        
        shedController.insert(shed);
        MessageUtils.getInstance().showInfo("El registro fue modificado ");
        clear();
        fillTable();
        
        }
        
        catch(NumberFormatException ex){
            MessageUtils.getInstance().showError("El número del galpon debe contener solo números");
        }
        
        catch(Exception ex){
            MessageUtils.getInstance().showError(ex.getMessage());
        }
    }//GEN-LAST:event_BotonCreationActionPerformed

    private void BotonActualizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizationActionPerformed
        int option = MessageUtils.getInstance().showConfirm("Está seguro de eliminar el registro?");
        if(option == JOptionPane.YES_OPTION)
        {
            try
            {
                shedController.delete(Integer.parseInt(SpaceText.getText()));
                MessageUtils.getInstance().showInfo("Registro eliminado exitosamente");
                clear();
                fillTable();
            }
            
            catch(Exception ex)
            {
                MessageUtils.getInstance().showError(ex.getMessage());
            }
        }
    }//GEN-LAST:event_BotonActualizationActionPerformed

    private void BotoncleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoncleanActionPerformed
       //clean con minuscula es eliminar
        int option = MessageUtils.getInstance().showConfirm("Esta seguro de eliminar el seguro?=");
        if(option == JOptionPane.YES_OPTION)
            
            try{
                shedController.delete(Integer.parseInt(SpaceText.getText()));
                MessageUtils.getInstance().showInfo("Registro eliminado con exito");
                clear();
                fillTable();
            }
            
            catch(Exception ex){
                MessageUtils.getInstance().showError(ex.getMessage());
            }
    }//GEN-LAST:event_BotoncleanActionPerformed

    private void BotonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCleanActionPerformed
        
        
    }//GEN-LAST:event_BotonCleanActionPerformed

    private void jTableShedsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableShedsMouseClicked
        // TODO add your handling code here:
        int rowSelected = jTableSheds.getSelectedRow();
        if(rowSelected != -1)
        {
            BotonActualization.setEnabled(true);
            BotonClean.setEnabled(true);
            BotonCreation.setEnabled(false);
            
            
            
            int numberSelected = Integer.parseInt(jTableSheds.getValueAt(rowSelected, 0).toString());
            try {
            //consultar por id
            Shed shed = shedController.find(numberSelected);
            SpaceText.setText(String.valueOf(shed.getNumber()));
            CajaLista.setSelectedItem(shed.getStatus());
            
            }
            
            catch(Exception ex)
            {
                MessageUtils.getInstance().showError(ex.getMessage());
            }
        }
            
            
    }//GEN-LAST:event_jTableShedsMouseClicked
    
    public void clear()
    {
        SpaceText.setText("");
        CajaLista.setSelectedIndex(0);
        jTableSheds.clearSelection();
        BotonCreation.setEnabled(true);
        BotonActualization.setEnabled(false);
        BotonClean.setEnabled(false);
    }
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JFrameShed().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualization;
    private javax.swing.JButton BotonClean;
    private javax.swing.JButton BotonCreation;
    private javax.swing.JButton Botonclean;
    private javax.swing.JComboBox<String> CajaLista;
    private javax.swing.JLabel EstadoGalpon;
    private javax.swing.JLabel InfoGalpones;
    private javax.swing.JLabel Numbergalpon;
    private javax.swing.JTextField SpaceText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSheds;
    // End of variables declaration//GEN-END:variables

    
}
