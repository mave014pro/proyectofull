package logica;
import java.sql.Connection;
import java.sql.PreparedStatement;

import persistencia.*;
public class PeliculaDAO {
	public static String insertarPeliculas(PeliculasVO peli) {
        String rptaRegistro=null;
        int numFAfectas=0;
     
        try{
	Connection acceDB = Conexion.getConnection();
	String sql="INSERT INTO peliculas VALUES(?,?,?,?,?,?); ";
	PreparedStatement estatuto = acceDB.prepareStatement(sql);
			
              estatuto.setInt(1, peli.getPin());
              estatuto.setString(2, peli.getNombre() );
              estatuto.setString(3, peli.getClasificacion());
              estatuto.setInt(4,peli.getDuracion());
              estatuto.setString(5, peli.getDirector());
              estatuto.setString(6,peli.getEstreno());
              
            
              numFAfectas=estatuto.executeUpdate();
			            
	if(numFAfectas>0){
		rptaRegistro="Registro exitoso.";
	}
       } catch (Exception e) {
  	System.out.println(e.getMessage());
  }
  return rptaRegistro;
}   
	public static int eliminarPersona(int cedula){
	     int filAfectadas= 0;
	     try {
	    	     Connection acceDB = Conexion.getConnection();
	            String sql="DELETE FROM peliculas WHERE pin =?;";
	        	PreparedStatement estatuto = acceDB.prepareStatement(sql);
	            estatuto.setInt(1, cedula);
	            filAfectadas = estatuto.executeUpdate();
	     } catch (Exception e) {
	        	System.out.println(e.getMessage());
	 }
	     return filAfectadas;
	}


}
