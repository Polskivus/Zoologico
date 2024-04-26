package conexionBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Conexion {

	protected Connection conexionBBDD;
	protected String usuario = "adminControl";
	protected String contraseña = "1234";
	protected String url = "jdbc:oracle:thin:@192.168.100.11:49163:xe";

	public Conexion() {

		try {

			Class.forName("oracle.jdbc.OracleDriver");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void abrirConexion() {

		try {

			String url = "jdbc:oracle:thin:@192.168.100.11:49163:xe";
			Properties propiedaduser = new Properties();

			propiedaduser.setProperty("user", usuario);
			propiedaduser.setProperty("password", contraseña);

			conexionBBDD = DriverManager.getConnection(url, propiedaduser);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void cerrarConexion() {

		try {

			conexionBBDD.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
