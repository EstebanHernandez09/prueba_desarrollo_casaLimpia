package Controlador;

public class Ofertas {
	private int idOferta;
	private String O_Nombre;
	private String O_Descripcion;
	private String O_Fecha_inicio;
	private String O_Fecha_final;
	private int id_Agencia;
	
	public Ofertas() {
		
	}
	
	public Ofertas(int idOferta, String O_nombre, String O_descripcion, String O_fecha_inicio, String O_fecha_final, int id_agencia) {
		super();
		this.idOferta = idOferta;
		O_Nombre = O_nombre;
		O_Descripcion = O_descripcion;
		O_Fecha_inicio = O_fecha_inicio;
		O_Fecha_final = O_fecha_final;
		id_Agencia = id_agencia; 
	}
	public String getO_Nombre() {
		return O_Nombre;
	}

	public void setO_Nombre(String o_Nombre) {
		O_Nombre = o_Nombre;
	}

	public String getO_Descripcion() {
		return O_Descripcion;
	}

	public void setO_Descripcion(String o_Descripcion) {
		O_Descripcion = o_Descripcion;
	}

	public String getO_Fecha_inicio() {
		return O_Fecha_inicio;
	}

	public void setO_Fecha_inicio(String o_Fecha_inicio) {
		O_Fecha_inicio = o_Fecha_inicio;
	}

	public String getO_Fecha_final() {
		return O_Fecha_final;
	}

	public void setO_Fecha_final(String o_Fecha_final) {
		O_Fecha_final = o_Fecha_final;
	}

	public int getIdOferta() {
		return idOferta;
	}
	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}

	public int getId_Agencia() {
		return id_Agencia;
	}

	public void setId_Agencia(int id_Agencia) {
		this.id_Agencia = id_Agencia;
	}
	
	
}
