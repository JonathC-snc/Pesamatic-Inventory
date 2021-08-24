package Conexion;
import java.sql.*;

public class Conexion {
    //Conexion Local
    public static Connection conectar(){
        try {
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/bd_pesamatic", "root","");
            return conectar;
        } catch (SQLException e) {
            System.out.println("Error en conexion local" + e);
        }
        return (null);
    }
}
