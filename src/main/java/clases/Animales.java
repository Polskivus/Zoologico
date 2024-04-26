package clases;

public class Animales {

	/* Creacion de sus datos */

	private int idAnimal;
	private boolean extincionAnimal;
	private String familiaAnimal;
	private String nombreVulgar;
	private String nombreCientifico;

	/* Creacion de setters y getters */

	public int getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}

	public boolean isExtincionAnimal() {
		return extincionAnimal;
	}

	public void setExtincionAnimal(boolean extincionAnimal) {
		this.extincionAnimal = extincionAnimal;
	}

	public String getFamiliaAnimal() {
		return familiaAnimal;
	}

	public void setFamiliaAnimal(String familiaAnimal) {
		this.familiaAnimal = familiaAnimal;
	}

	public String getNombreVulgar() {
		return nombreVulgar;
	}

	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

}
