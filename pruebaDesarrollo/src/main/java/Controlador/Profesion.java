package Controlador;

public class Profesion {
	private int id_Profesion;
	private String P_nombre;
	
	public Profesion() {
		
	}
	
	public Profesion(int id_Profesion, String p_nombre) {
		super();
		this.id_Profesion = id_Profesion;
		P_nombre = p_nombre;
	}
	
	public int getId_Profesion() {
		return id_Profesion;
	}

	public void setId_Profesion(int id_Profesion) {
		this.id_Profesion = id_Profesion;
	}

	public String getP_nombre() {
		return P_nombre;
	}

	public void setP_nombre(String p_nombre) {
		P_nombre = p_nombre;
	}
}
