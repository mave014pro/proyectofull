package logica;

import persistencia.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SeriesDAO {
    public static String insertarSerie(SeriesVO ser) {
        String rptaRegistro = null;
        int numFAfectas = 0;

        try {
            Connection acceDB = Conexion.getConnection();
            String sql = "INSERT INTO series VALUES(?,?,?,?,?,?); ";
            PreparedStatement estatuto = acceDB.prepareStatement(sql);

            estatuto.setInt(1, ser.getPin());
            estatuto.setString(2, ser.getNombre());
            estatuto.setString(3, ser.getClasificacion());
            estatuto.setInt(4, ser.getTemporadas());
            estatuto.setInt(5, ser.getCapitulos());
            estatuto.setInt(6, ser.getDuracion());

            numFAfectas = estatuto.executeUpdate();

            if (numFAfectas > 0) {
                rptaRegistro = "Registro exitoso.";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rptaRegistro;
    }
    
    public static int eliminarSeries(int pin) {

    	 int filAfectadas = 0;
         try {
             Connection accesoDB = Conexion.getConnection();
             String sql = "DELETE FROM series WHERE pin =?;";
             PreparedStatement estatuto = accesoDB.prepareStatement(sql);
             estatuto.setInt(1, pin);
             filAfectadas = estatuto.executeUpdate();
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
         return filAfectadas;
    	
    }
    
    
}