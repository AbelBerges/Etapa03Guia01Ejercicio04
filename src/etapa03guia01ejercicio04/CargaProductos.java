/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package etapa03guia01ejercicio04;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kalema
 */
public class CargaProductos extends javax.swing.JInternalFrame {
private DefaultTableModel modelo=new DefaultTableModel(){
    private boolean isCellEditable(){
        return false;
    }

};
    /**
     * Creates new form CargaProductos
     */
    public CargaProductos() {
        initComponents();
        armarTabla();
        jbtCargoCategoriasActionPerformed();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtDescripcionCarga = new javax.swing.JTextField();
        jtMarcaCarga = new javax.swing.JTextField();
        jtCodigoCarga = new javax.swing.JTextField();
        jtPrecioCarga = new javax.swing.JTextField();
        jtStockCarga = new javax.swing.JTextField();
        jbtCargar = new javax.swing.JButton();
        jbtLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMuestroProductos = new javax.swing.JTable();
        jbtCargoCategorias = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CARGA DE PRODUCTOS");

        jLabel2.setText("Categoria");
        jLabel2.setFocusable(false);

        jLabel3.setText("Código");
        jLabel3.setFocusable(false);

        jLabel4.setText("Marca");
        jLabel4.setFocusable(false);

        jLabel5.setText("Descripción");
        jLabel5.setFocusable(false);

        jLabel6.setText("Precio");
        jLabel6.setFocusable(false);

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Stock");
        jLabel7.setFocusable(false);

        jtCodigoCarga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCodigoCargaFocusLost(evt);
            }
        });

        jtPrecioCarga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtPrecioCargaFocusLost(evt);
            }
        });

        jtStockCarga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtStockCargaFocusLost(evt);
            }
        });

        jbtCargar.setText("Cargar");
        jbtCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCargarActionPerformed(evt);
            }
        });

        jbtLimpiar.setText("Limpiar");

        jTMuestroProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTMuestroProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtCargoCategorias, 0, 139, Short.MAX_VALUE)
                            .addComponent(jtDescripcionCarga))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jtPrecioCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtStockCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtCargar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtCodigoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtMarcaCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jtCodigoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtCargoCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtMarcaCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtDescripcionCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtPrecioCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtStockCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtCargar)
                    .addComponent(jbtLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCargarActionPerformed
        int elCodigo=Integer.valueOf(jtCodigoCarga.getText());
        String laMarca=jtMarcaCarga.getText();
        String laDescripcion=jtDescripcionCarga.getText();
        double elPrecio=Double.valueOf(jtPrecioCarga.getText());
        Categoria laCategoria=jbtCargoCategorias.getItemAt(jbtCargoCategorias.getSelectedIndex());
        int elStock=Integer.valueOf(jtStockCarga.getText());
        Menu.listado.add(new Productos(elCodigo, laMarca, laDescripcion, elStock, elPrecio, laCategoria));
        
    }//GEN-LAST:event_jbtCargarActionPerformed

    private void jtCodigoCargaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCodigoCargaFocusLost
        try {
            Integer valorCodigo;
            valorCodigo = Integer.valueOf(jtCodigoCarga.getText());
            if(valorCodigo<=0){
                JOptionPane.showMessageDialog(this, "Debe ingresar un número positivo");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número entero en el campo CÓDIGO");
        }
    }//GEN-LAST:event_jtCodigoCargaFocusLost

    private void jtPrecioCargaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPrecioCargaFocusLost
        try {
            Double valor = Double.valueOf(jtPrecioCarga.getText());
            if(valor<=0){
            JOptionPane.showMessageDialog(this, "Debe ingresar un número Real positivo");
        }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un númeor Real");
        }
    }//GEN-LAST:event_jtPrecioCargaFocusLost

    private void jtStockCargaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtStockCargaFocusLost
        try {
            int valor=Integer.valueOf(jtStockCarga.getText());
            if(valor<=0){
                JOptionPane.showMessageDialog(this, "Debe ingresar un número entero positivo");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número entero");
        }
    }//GEN-LAST:event_jtStockCargaFocusLost
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMuestroProductos;
    private javax.swing.JButton jbtCargar;
    private javax.swing.JComboBox<Categoria> jbtCargoCategorias;
    private javax.swing.JButton jbtLimpiar;
    private javax.swing.JTextField jtCodigoCarga;
    private javax.swing.JTextField jtDescripcionCarga;
    private javax.swing.JTextField jtMarcaCarga;
    private javax.swing.JTextField jtPrecioCarga;
    private javax.swing.JTextField jtStockCarga;
    // End of variables declaration//GEN-END:variables

    private void armarTabla(){
        modelo.addColumn("Código");
        modelo.addColumn("Marca");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
        modelo.addColumn("Stock");
        jTMuestroProductos.setModel(modelo);
    }

    private void jbtCargoCategoriasActionPerformed(){        
          jbtCargoCategorias.addItem(Categoria.ALIMENTOS);
          jbtCargoCategorias.addItem(Categoria.ELECTRONICA);
          jbtCargoCategorias.addItem(Categoria.ROPA);
    } 
}