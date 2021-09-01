package DatabaseClasses;


import Clases.Administrador;
import Clases.Cliente;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import java.time.*;

public class CRUD {    
    private String ruta;
    
     
    public CRUD(String ruta){
        this.ruta = ruta;
        conectar();
    }
    
    public Connection conectar(){
        Connection connect = null;
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:"+ruta);
            if (connect != null) {
                System.out.println("EXITO!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return connect;
    }
    /**
     *
     * @return
     */
    public  List<Cliente> obtenerVariosClientes() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		String sql="";
		//String sql="SELECT * FROM CLIENTE ORDER BY ID";
		
		//List<Cliente> listaCliente= new ArrayList<Cliente>();
	 
		try {			
			//co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				 
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		return null;
	}

    public  List<Administrador> obtenerVariosAdministradores() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		String sql="";
		//String sql="SELECT * FROM CLIENTE ORDER BY ID";
		
		//List<Cliente> listaCliente= new ArrayList<Cliente>();
	 
		try {			
			//co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				 
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		return null;
	}
    
    public void agregar(Cliente cli) {
        Connection connect= null;
        Statement stm= null;
        String sql;
        try {
            sql= "INSERT INTO agregar (nombre, fecha_ingreso, fecha_de_nacimiento, sexo, alergias, niveles_glucosa, hemoglobina, peso, altura)"
                        + "values("
                    + cli.getNombre() + ","
                    + (Date) cli.getFechaRegistro()+ ","
                    + (Date) cli.getFechaCumpleaños() + ","
                    + cli.getGenero() + ","
                    + cli.getAlergias() + ","
                    + cli.getGlucosa() + ","
                    + cli.getHemoglobina() + ","
                    + cli.getPeso() + ","
                    + cli.getAltura() + ")";
            connect= conectar();
            stm= connect.createStatement();
            stm.execute(sql);
            
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void modificar(String sentencia){
        Connection connect= null;
        Statement stm= null;
        //String sql="UPDATE CLIENTE SET cedula='"+cliente.getCedula()+"', nombres='"+cliente.getNombre()+"', apellidos='"+cliente.getApellido()+"'" +" WHERE ID="+cliente.getId();
        try {
            //connect=Conexion.conectar();
            stm=connect.createStatement();
            stm.execute(sentencia);
            //	actualizar=true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }	
    }
    
}

 

