

package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import vistas.VistaPedidos;


public class Main {

    public static void main(String[] args) {
        VistaPedidos form = new VistaPedidos();
        ControladorVistaPedidos controlador = new ControladorVistaPedidos();
        
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        
        //controlador.AgregarPedidos();
        
    }
    
}
