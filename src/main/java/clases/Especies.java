package clases;

import java.sql.Date;

public class Especies {

	/* Creacion de sus datos */

	private int idEspecimen;
	private String nombreEspecie;
	private String sexoEspecie;
	private String paisOrigenEsp;
	private String continenteOrigenEsp;
	private Date añoNacimientoEsp;

	/* Creacion de setters y getters */

	public int getIdEspecimen() {
		return idEspecimen;
	}

	public void setIdEspecimen(int idEspecimen) {
		this.idEspecimen = idEspecimen;
	}

	public String getNombreEspecie() {
		return nombreEspecie;
	}

	public void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
	}

	public String getSexoEspecie() {
		return sexoEspecie;
	}

	public void setSexoEspecie(String sexoEspecie) {
		this.sexoEspecie = sexoEspecie;
	}

	public String getPaisOrigenEsp() {
		return paisOrigenEsp;
	}

	public void setPaisOrigenEsp(String paisOrigenEsp) {
		this.paisOrigenEsp = paisOrigenEsp;
	}

	public String getContinenteOrigenEsp() {
		return continenteOrigenEsp;
	}

	public void setContinenteOrigenEsp(String continenteOrigenEsp) {
		this.continenteOrigenEsp = continenteOrigenEsp;
	}

	public Date getAñoNacimientoEsp() {
		return añoNacimientoEsp;
	}

	public void setAñoNacimientoEsp(Date añoNacimientoEsp) {
		this.añoNacimientoEsp = añoNacimientoEsp;
	}

}
