package persistencia;
//* modificado para que corra en Java 8.0

import java.sql.*;

/*En este archivo lo �nico que hay que modificar es el login y password (l�nea 12 y 13)
que utiliza en su m�quina para acceder a MySQL y si lo quiere usar en otro proyecto
cambiar adem�s el nombre de la base de datos que utilice (l�nea 11) el resto es siempre igual*/

public class Conexion {
	
   static String bd = "Netfils";  
   static String login = "root";
   static String password = "root";
   static String url = "jdbc:mysql://localhost/"+bd+
		   "?useTimezone=true&serverTimezone=UTC"; //*
   
   Connection conn = null;

 
      
    	  public static Connection getConnection() {
    		    Connection conn = null;
    		    try {
     Class.forName("com.mysql.cj.jdbc.Driver");
     conn = DriverManager.getConnection(url, login, password);
     if (conn != null) {
     System.out.println("Conexión a la base de datos " + bd + " OK");
     }
     } catch (SQLException e) {
     System.out.println(e);
     } catch (ClassNotFoundException e) {
     System.out.println(e);
     } catch (Exception e) {
       System.out.println(e);
  }
    return conn;
   }
      
public static Connection getConnecion() {
	// TODO Auto-generated method stub
	return null;
}

}