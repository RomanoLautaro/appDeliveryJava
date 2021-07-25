
package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import vistas.VistaPedidos;


public class ControladorVistaPedidos {
   /* 
    public void AgregarPedidos(){
        VistaPedidos form = new VistaPedidos();
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/delivery","root","");
            System.out.println("Conectado");
            //enviar una orden
            Statement s = c.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM `delivery01`");
            //obtener los resultados

            DefaultTableModel modelo = (DefaultTableModel) form.TablePedidos.getModel();
            modelo.setNumRows(0);

            while (res.next()) {
                Object[] fila = new Object[5];
                fila[0] = res.getString("nombre");
                fila[1] = res.getString("contacto");
                fila[2] = res.getString("direccion");
                fila[3] = res.getString("pedido");
                fila[4] = res.getString("cantidad");
                
                modelo.addRow(fila);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
*/
}
