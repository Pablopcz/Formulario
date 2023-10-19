/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package conexionsrejdbc;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionsreJDBC {

    public static void main(String[] args) {
        
        /** referenciar el usuario y password con el cual me conectaré a la base de datos */
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/sre_colegios";
        
        
        /** establecer conexión */

        Connection conexion; 
        Statement statement; /** permite ejecutar sentencias sql a través de la conexión establecida */
        ResultSet rs; 
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionsreJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
       
           
        try {
            conexion = DriverManager.getConnection(url,usuario,password);
            statement = conexion.createStatement();
            statement.executeUpdate("INSERT INTO ESTUDIANTE(Nombre_estudiante,Apellido_estudiante)VALUES('SARA','MOTTA')");
            rs = statement.executeQuery("SELECT * FROM ESTUDIANTE");
            rs.next();
            
            do{
            
                System.out.println(rs.getInt("Codigo_estudiante")+" "+rs.getString("Nombre_estudiante")+" "+rs.getString("Apellido_estudiante" ));
                
            }while (rs.next());
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionsreJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
                             
        }
}
