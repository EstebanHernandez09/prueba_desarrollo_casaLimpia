package Controlador;

public class Agencia {
	private int idAgencia;
	private String Ag_Nombre;
	private String Ag_Telefono;
	private String Ag_Direccion;
	
	public Agencia() {
		
	}
	
	public Agencia(int idAgencia, String ag_Nombre, String ag_Telefono, String ag_Direccion) {
		super();
		this.idAgencia = idAgencia;
		Ag_Nombre = ag_Nombre;
		Ag_Telefono = ag_Telefono;
		Ag_Direccion = ag_Direccion;
	}

	public int getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}

	public String getAg_Nombre() {
		return Ag_Nombre;
	}

	public void setAg_Nombre(String ag_Nombre) {
		Ag_Nombre = ag_Nombre;
	}

	public String getAg_Telefono() {
		return Ag_Telefono;
	}

	public void setAg_Telefono(String ag_Telefono) {
		Ag_Telefono = ag_Telefono;
	}

	public String getAg_Direccion() {
		return Ag_Direccion;
	}

	public void setAg_Direccion(String ag_Direccion) {
		Ag_Direccion = ag_Direccion;
	}
	
	
	

}
