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

public class Factura {
    String numPieza, descripcion;
    int cantidad;
    double precio;
    
    //metodo constructor
    Factura(){
        this.numPieza=null;
        this.descripcion=null;
        this.cantidad=0;
        this.precio=0;
    }

    public String getNumPieza() {
        return numPieza;
    }

    public void setNumPieza(String numPieza) {
        this.numPieza = numPieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    //creamos las variables
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //calcular monto de factura
    public double getMonto_Factura(int cant, double precio){
        //variable
        double total;
        if (cant < 0){
            cant=0;            
        }
        if (precio < 0){
            precio=0;
        }
        total= cant*precio;
        //JOptionPane.showMessageDialog(null, "Monto de la Factura: "+total);
        return total;
    }
    
    //creando archivo txt para almacenar los datos ingresados
    public void crearArchivo(JTable jtab){
        try{
           String fileRectangulo = "D:\\Documents\\NetBeansProjects\\Factura\\src\\factura\\datos.txt";
           BufferedWriter bfw = new BufferedWriter(new FileWriter(fileRectangulo));
            for (int i = 0; i < jtab.getColumnCount(); i++) {
                bfw.write(jtab.getColumnName(i) + "      ");
            }
            bfw.write("\n");
            for (int i = 0; i < jtab.getRowCount(); i++) {
                for (int j = 0; j < jtab.getColumnCount(); j++) {
                    bfw.write(jtab.getValueAt(i, j).toString() + "           ");
                }
                bfw.newLine();
            }
            bfw.close();
            JOptionPane.showMessageDialog(null, "El archivo fue creado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo." + e.getMessage());
        }
    }
    
    //llenar tabla con los registros
    public void llenarTabla(String pieza, String desc2, int cant2, double precio2, double monto, JTable tabla){
       //asignar los valores obtenidos
        setNumPieza(pieza);
        setDescripcion(desc2);
        setCantidad(cant2);
        setPrecio(precio2);
        monto = getMonto_Factura(cant2, precio2);
        //añadimos el registro a la tabla
        try {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object nuevaTab[] = {pieza,desc2,cant2,precio2,monto};
            tb.addRow(nuevaTab);
            JOptionPane.showMessageDialog(null, "Registro Añadido exitosamente"); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se pudo añadir "+e.getMessage());
        }
    }
    
    // Eliminar datos de una tabla
    public void eliminaRegistro(JTable tabla){
        DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
        if (tabla.getSelectedRow()>=0){
            tb.removeRow(tabla.getSelectedRow());
        } 
    }
    
    //guardar datos modificados
    public void guardarDatosModificados(JTable tabla, int filaSelec, String pieza, String desc2, int cant2, double precio2, double monto){
        try { 
            monto = getMonto_Factura(cant2, precio2);
            
            tabla.setValueAt(pieza, filaSelec, 0);
            tabla.setValueAt(desc2, filaSelec, 1);
            tabla.setValueAt(cant2, filaSelec, 2);
            tabla.setValueAt(precio2, filaSelec, 3);
            tabla.setValueAt(monto, filaSelec, 4);
            
            JOptionPane.showMessageDialog(null, "Registro Modificado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
