/*
5. Cree una clase llamada Factura, que una ferretería podría utilizar para representar una factura 
para un artículo vendido en la tienda. Una Factura debe incluir cuatro piezas de información como 
variables de instancia: un número de pieza (tipo String), la descripción de la pieza (tipo String), 
la cantidad de artículos de ese tipo que se van a comprar (tipo int) y el precio por artículo (double). 
Su clase debe tener un constructor que inicialice las cuatro variables de instancia. Proporcione un método 
establecer y un método obtener para cada variable de instancia. Además, proporcione un método llamado getMonto_Factura, 
que calcule el monto de la factura (es decir, que multiplique la cantidad por el precio por artículo) y después devuelva 
ese monto como un valor double. Si la cantidad no es positiva, debe establecerse en 0. Si el precio por artículo 
no es positivo, debe establecerse a 0.0. Escriba una aplicación de prueba llamada Prueba_Factura, que demuestre las 
capacidades de la clase Factura (utilizando JFrame Form, JTable, utilice con JPoPMenu las opciones de modificar y eliminar, 
además utilice archivo de texto en Java para almacenar y cargar la información).
 */
package factura;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Prueba_Factura extends javax.swing.JFrame {

    Factura fact = new Factura();
    
    public Prueba_Factura() {
        initComponents();
        jBtnActualizar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuFactura = new javax.swing.JPopupMenu();
        jMenuItemModificar = new javax.swing.JMenuItem();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtFldPieza = new javax.swing.JTextField();
        jTxtFldDescripcion = new javax.swing.JTextField();
        jTxtFldCantidad = new javax.swing.JTextField();
        jTxtFldPrecio = new javax.swing.JTextField();
        jBtnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFactura = new javax.swing.JTable();
        jBtnActualizar = new javax.swing.JButton();
        jBtnExportar = new javax.swing.JButton();

        jMenuItemModificar.setText("Modificar");
        jMenuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarActionPerformed(evt);
            }
        });
        jPopupMenuFactura.add(jMenuItemModificar);

        jMenuItemEliminar.setText("Eliminar");
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        jPopupMenuFactura.add(jMenuItemEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Factura de venta - Ferreteria X");

        jLabel2.setText("No de pieza");

        jLabel3.setText("Descripción");

        jLabel4.setText("Cantidad");

        jLabel5.setText("precio");

        jBtnCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnCalcular.setText("Calcular");
        jBtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalcularActionPerformed(evt);
            }
        });

        jTableFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Pieza", "Descripción", "Cantidad", "Precio", "Total"
            }
        ));
        jTableFactura.setComponentPopupMenu(jPopupMenuFactura);
        jScrollPane1.setViewportView(jTableFactura);
        if (jTableFactura.getColumnModel().getColumnCount() > 0) {
            jTableFactura.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        jBtnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnActualizar.setText("Actualizar");
        jBtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarActionPerformed(evt);
            }
        });

        jBtnExportar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnExportar.setText("Exportar");
        jBtnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtFldPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtFldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtFldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtFldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnExportar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtFldPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtFldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtFldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtFldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCalcular))
                .addGap(1, 1, 1)
                .addComponent(jBtnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnExportar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalcularActionPerformed
        // calcular monto total de una factura y añadir a la tabla
        //variables
        String pieza, descripcion;
        int cant;
        double precio, total;
        //inicializamos las variables
        cant = Integer.parseInt(jTxtFldCantidad.getText());
        precio = Double.parseDouble(jTxtFldPrecio.getText());
        total = cant * precio;
        //mostramos el monto total de la factura
        JOptionPane.showMessageDialog(null, "El valor total de la compra es "+total);
        pieza = jTxtFldPieza.getText();
        descripcion = jTxtFldDescripcion.getText();
        fact.llenarTabla(pieza, descripcion, cant, precio, total, jTableFactura);
        limpiarCajaTexto();
    }//GEN-LAST:event_jBtnCalcularActionPerformed

    private void jBtnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExportarActionPerformed
        //exportar datos a un archivo de texto
        fact.crearArchivo(jTableFactura);
    }//GEN-LAST:event_jBtnExportarActionPerformed

    private void jMenuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarActionPerformed
        //instanciamos la tabla
        DefaultTableModel tb = (DefaultTableModel) jTableFactura.getModel();
        if (jTableFactura.getSelectedRow()>=0){ // nos paramos ne la fila seleccionada
            //reasignamos en las cajas de texto los valores de la tabla
            jTxtFldPieza.setText(jTableFactura.getValueAt(jTableFactura.getSelectedRow(), 0).toString());
            jTxtFldDescripcion.setText(jTableFactura.getValueAt(jTableFactura.getSelectedRow(), 1).toString());
            jTxtFldCantidad.setText(jTableFactura.getValueAt(jTableFactura.getSelectedRow(), 2).toString());
            jTxtFldPrecio.setText(jTableFactura.getValueAt(jTableFactura.getSelectedRow(), 3).toString());
        } 
        jBtnActualizar.setVisible(true);
    }//GEN-LAST:event_jMenuItemModificarActionPerformed

    private void jBtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizarActionPerformed
        //creamos atributos
        String pieza, desc;
        int cant;
        double precio, monTotal;
        pieza=jTxtFldPieza.getText();
        desc=jTxtFldDescripcion.getText();
        cant=Integer.parseInt(jTxtFldCantidad.getText());
        precio=Double.parseDouble(jTxtFldPrecio.getText());
        int filaSelec=0;
        filaSelec= jTableFactura.getSelectedRow();
        monTotal= cant * precio;
        fact.guardarDatosModificados(jTableFactura, filaSelec,pieza,desc,cant,precio,monTotal);
        limpiarCajaTexto();
    }//GEN-LAST:event_jBtnActualizarActionPerformed

    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
        // eliminar un registro
        fact.eliminaRegistro(jTableFactura);
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

    private void limpiarCajaTexto(){
        //limpiamos las cajas de texto
        jTxtFldPieza.setText(null);
        jTxtFldDescripcion.setText(null);
        jTxtFldCantidad.setText(null);
        jTxtFldPrecio.setText(null);
    }
    
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
            java.util.logging.Logger.getLogger(Prueba_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba_Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnActualizar;
    private javax.swing.JButton jBtnCalcular;
    private javax.swing.JButton jBtnExportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenuFactura;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFactura;
    private javax.swing.JTextField jTxtFldCantidad;
    private javax.swing.JTextField jTxtFldDescripcion;
    private javax.swing.JTextField jTxtFldPieza;
    private javax.swing.JTextField jTxtFldPrecio;
    // End of variables declaration//GEN-END:variables
}
