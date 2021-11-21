package Controlador;

public class Aspirante {
	private int idAspirante;
	private String AS_Nombre;
	private int AS_Cedula;
	private int AS_Edad;
	private String AS_Genero;
	private int idProfesion;
	private int idAgencia;
	
	public Aspirante() {
		
	}
	
	public Aspirante(int idAspirante, String aS_Nombre, int aS_Cedula, int aS_Edad, String aS_Genero, int idProfesion,
			int idAgencia) {
		super();
		this.idAspirante = idAspirante;
		AS_Nombre = aS_Nombre;
		AS_Cedula = aS_Cedula;
		AS_Edad = aS_Edad;
		AS_Genero = aS_Genero;
		this.idProfesion = idProfesion;
		this.idAgencia = idAgencia;
	}

	public int getIdAspirante() {
		return idAspirante;
	}

	public void setIdAspirante(int idAspirante) {
		this.idAspirante = idAspirante;
	}

	public String getAS_Nombre() {
		return AS_Nombre;
	}

	public void setAS_Nombre(String aS_Nombre) {
		AS_Nombre = aS_Nombre;
	}

	public int getAS_Cedula() {
		return AS_Cedula;
	}

	public void setAS_Cedula(int aS_Cedula) {
		AS_Cedula = aS_Cedula;
	}

	public int getAS_Edad() {
		return AS_Edad;
	}

	public void setAS_Edad(int aS_Edad) {
		AS_Edad = aS_Edad;
	}

	public String getAS_Genero() {
		return AS_Genero;
	}

	public void setAS_Genero(String aS_Genero) {
		AS_Genero = aS_Genero;
	}

	public int getIdProfesion() {
		return idProfesion;
	}

	public void setIdProfesion(int idProfesion) {
		this.idProfesion = idProfesion;
	}

	public int getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}

}
