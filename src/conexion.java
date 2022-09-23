import javax.swing.*;
import java.sql.Connection;

public class conexion {
    Connection conn = null;
    String bd = "institucion";
    String user = "sueco";
    String pass = "suecogtc";
    String host = "25.72.193.72";
    String port = "3306";
    String cadena = "jdbc:mysql://" + host + ":" + port + "/" + bd;

    public Connection myConnection() {
        try {
            Class.forName("com.jdbc.Driver");
            JOptionPane.showMessageDialog(null, "conexion realizada");
        } catch (ClassNotFoundException e) {

            JOptionPane.showMessageDialog(null, "error: " + e.toString());
        }
        return conn;
    }

}
