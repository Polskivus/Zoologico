package clases;

import java.sql.Date;

public class Veterinarios {

	/* Creacion de sus datos */

	private int idVeterinario;
	private String nombreVet;
	private String apellidoVet;
	private String dniVet;
	private int sueldoVet;
	private Date antiguedadVet;
	private int numeroVet;

	/* Creacion de setters y getters */
	
	public int getIdVeterinario() {
		return idVeterinario;
	}

	public void setIdVeterinario(int idVeterinario) {
		this.idVeterinario = idVeterinario;
	}

	public String getNombreVet() {
		return nombreVet;
	}

	public void setNombreVet(String nombreVet) {
		this.nombreVet = nombreVet;
	}

	public String getApellidoVet() {
		return apellidoVet;
	}

	public void setApellidoVet(String apellidoVet) {
		this.apellidoVet = apellidoVet;
	}

	public String getDniVet() {
		return dniVet;
	}

	public void setDniVet(String dniVet) {
		this.dniVet = dniVet;
	}

	public int getSueldoVet() {
		return sueldoVet;
	}

	public void setSueldoVet(int sueldoVet) {
		this.sueldoVet = sueldoVet;
	}

	public Date getAntiguedadVet() {
		return antiguedadVet;
	}

	public void setAntiguedadVet(Date antiguedadVet) {
		this.antiguedadVet = antiguedadVet;
	}

	public int getNumeroVet() {
		return numeroVet;
	}

	public void setNumeroVet(int numeroVet) {
		this.numeroVet = numeroVet;
	}

}
