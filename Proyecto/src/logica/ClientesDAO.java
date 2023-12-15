package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import persistencia.Conexion;

public class ClientesDAO {
    public static String insertarCliente(ClienteVO cli) {
        String rptaRegistro = null;
        int numFAfectas = 0;

        try {
            Connection acceDB = Conexion.getConnection();
            String sql = "INSERT INTO clientes VALUES(?,?,?,?,?,?,?,?) ";
            PreparedStatement estatuto = acceDB.prepareStatement(sql);

            estatuto.setInt(1, cli.getCedula());
            estatuto.setString(2, cli.getNombreC());
            estatuto.setString(3, cli.getNombre());
            estatuto.setString(4, cli.getDireccion());
            estatuto.setString(5, cli.getContraseña());
            estatuto.setInt(6, cli.getTarjeta());
            estatuto.setInt(7, cli.getPin());
            estatuto.setInt(8, cli.getPlan());

            numFAfectas = estatuto.executeUpdate();

            if (numFAfectas > 0) {
                rptaRegistro = "Registro exitoso.";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rptaRegistro;
    }

    public int eliminarCliente(int cedula) {
        int filAfectadas = 0;
        try {
            Connection accesoDB = Conexion.getConnection();
            String sql = "DELETE FROM clientes WHERE cedula = ?";
            PreparedStatement estatuto = accesoDB.prepareStatement(sql);
            estatuto.setInt(1, cedula);
            filAfectadas = estatuto.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filAfectadas;
    }
    
    public ClienteVO buscarClientes(int cedula) {
        ClienteVO c = new ClienteVO();
        c.setCedula(cedula);
        try {
            Connection accesoDB = Conexion.getConnection();
            String sql = "SELECT * FROM clientes WHERE cedula = ?";
            PreparedStatement estatuto = accesoDB.prepareStatement(sql);
            estatuto.setInt(1, cedula);
            ResultSet rs = estatuto.executeQuery();
            while (rs.next()) {
                c.setNombre(rs.getString(2));
                c.setNombreC(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setContraseña(rs.getString(5));
                c.setTarjeta(rs.getInt(6));
                c.setPin(rs.getInt(7));
                c.setPlan(rs.getInt(8));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }
public Arraylistclientes listaCliente() {
	Arraylistclientes datosCli = new Arraylistclientes();
	ClienteVO cliente;
	try {
		  Connection accesoDB = Conexion.getConnection();
          String sql = "SELECT * FROM clientes";
          PreparedStatement estatuto = accesoDB.prepareStatement(sql);
          ResultSet rs = estatuto.executeQuery();
          while (rs.next()) {
        	  cliente = new ClienteVO();
        	  cliente.setCedula(rs.getInt(1));
        	  cliente.setNombre(rs.getString(2));
        	  cliente.setNombreC(rs.getString(3));
        	  cliente.setDireccion(rs.getString(4));
        	  cliente.setContraseña(rs.getString(5));
        	  cliente.setTarjeta(rs.getInt(6));
        	  cliente.setPin(rs.getInt(7));
        	  cliente.setPlan(rs.getInt(8));
        	  
        	  datosCli.agregar(cliente);
	}
          
	}
          
          catch (Exception e) {
	
	}
	return datosCli;
    
    
    
}   
}

