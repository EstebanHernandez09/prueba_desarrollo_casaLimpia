package Modelo;

import java.util.ArrayList;


import java.util.List;
import java.sql.*;

import Controlador.Agencia;
import Controlador.Aspirante;
import Controlador.Ofertas;
import Controlador.Profesion;

public class Conexion implements Transacciones {
	
	public String db = "cargos_ofertados";
    public String url = "jdbc:mysql://localhost:3306/"+db;
    public String user = "root";
    public String pass = "123456";


   public Connection Conectar(){
       Connection con = null;

       try{

           Class.forName("com.mysql.cj.jdbc.Driver");

           con = DriverManager.getConnection(this.url, this.user, this.pass);
           System.out.println("conexion exitosa");

       }catch(Exception ex){
    	   ex.printStackTrace();   
       }
       return con;

   }
//aspirantes
	@Override
	public List<Aspirante> obtenerTodoAspirante() {
		List<Aspirante> listaAspirante = new ArrayList<Aspirante>();
		String sql="SELECT * FROM aspirante";
		try {
			Connection link = this.Conectar();
			Statement stmt = link.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Aspirante aspirante = new Aspirante(rs.getInt("idAspirante"), rs.getString("AS_Nombre"),rs.getInt("AS_Cedula"), rs.getInt("AS_Edad"), rs.getString("AS_Genero"), rs.getInt("IdProfesion"), rs.getInt("IdAgencia"));
				System.out.println(rs.getString("AS_Nombre"));
				listaAspirante.add(aspirante);
			}
			try {
				link.close();
				System.out.println("conexion cerrada");
			}catch (Exception ex){
				ex.printStackTrace();
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
		return listaAspirante;
	}

	@Override
	public Aspirante obtenerAspirante(int id) {
		Aspirante aspirante = null;
		String sql ="SELECT * FROM aspirante WHERE idAspirante= ? ";
		try {
			Connection link = this.Conectar();
			PreparedStatement stmt = link.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			aspirante = new Aspirante(rs.getInt("idAspirante"), rs.getString("AS_Nombre"),rs.getInt("AS_Cedula"), rs.getInt("AS_Edad"), rs.getString("AS_Genero"), rs.getInt("IdProfesion"), rs.getInt("IdAgencia"));
				//System.out.println(rs.getString("P_Nombre"));
				//System.out.println(aspirante.getP_nombre());
			try {
				link.close();
				System.out.println("conexion cerrada");
			}catch (Exception ex){
				ex.printStackTrace();
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
		System.out.println(aspirante.getAS_Nombre());
		return aspirante;
	}

	@Override
	public void insertarAspirante(Aspirante aspirante) {
		String sql = "INSERT INTO aspirante (AS_Nombre, AS_Cedula, AS_Edad, AS_Genero, Id_Profesion, IdAgencia) VALUES (?,?,?,?,?,?)";
		try {
			Connection link = this.Conectar();
			PreparedStatement stmt = link.prepareStatement(sql);
			stmt.setString(1, aspirante.getAS_Nombre());
			stmt.setInt(2, aspirante.getAS_Cedula());
			stmt.setInt(3, aspirante.getAS_Edad());
			stmt.setString(4, aspirante.getAS_Genero());
			stmt.setInt(5, aspirante.getIdProfesion());
			stmt.setInt(6, aspirante.getIdAgencia());
			stmt.executeUpdate();
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}

	@Override
	public void actualizarAspirante(Aspirante aspirante) {
		String sql = "UPDATE aspirante SET AS_Nombre =?, AS_Cedula=?, AS_Edad=?, AS_Genero=?, Id_Profesion=?, IdAgencia= ? WHERE idAspirante = ?";
		try {
			Connection link = this.Conectar();
			PreparedStatement stmt = link.prepareStatement(sql);
			stmt.setString(1, aspirante.getAS_Nombre());
			stmt.setInt(2, aspirante.getAS_Cedula());
			stmt.setInt(3, aspirante.getAS_Edad());
			stmt.setString(4, aspirante.getAS_Genero());
			stmt.setInt(5, aspirante.getIdProfesion());
			stmt.setInt(6, aspirante.getIdAgencia());
			stmt.setInt(7, aspirante.getIdAspirante());
			stmt.executeUpdate();
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}

	@Override
	public void eliminarAspirante(int id) {
		String sql="DELETE FROM aspirante WHERE id=?";
		try {
			Connection link = this.Conectar();
			PreparedStatement stmt = link.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}
	
	//ofertas
	
	@Override
	public List<Ofertas> obtenerTodoOferta() {
		List<Ofertas> listaofertas = new ArrayList<Ofertas>();
		String sql="SELECT * FROM oferta";
		try {
			Connection link = this.Conectar();
			Statement stmt = link.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Ofertas ofertas = new Ofertas(rs.getInt("idOferta"), rs.getString("O_Nombre"), rs.getString("O_Descripcion"), rs.getString("O_Fecha_inicio"), rs.getString("O_Fecha_fin"), rs.getInt("id_Agencia"));
				System.out.println(rs.getString("O_Nombre"));
				listaofertas.add(ofertas);
			}
			try {
				link.close();
				System.out.println("conexion cerrada");
			}catch (Exception ex){
				ex.printStackTrace();
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
		return listaofertas;
	}

	@Override
	public Ofertas obtenerOferta(int id) {
		Ofertas ofertas = null;
		String sql ="SELECT * FROM oferta WHERE idOferta= ? ";
		try {
			Connection link = this.Conectar();
			PreparedStatement stmt = link.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			ofertas = new Ofertas(rs.getInt("idOferta"), rs.getString("O_Nombre"), rs.getString("O_Descripcion"), rs.getString("O_Fecha_inicio"), rs.getString("O_Fecha_fin"), rs.getInt("id_Agencia"));
				System.out.println(rs.getString("O_Nombre"));
				//System.out.println(aspirante.getP_nombre());
			try {
				link.close();
				System.out.println("conexion cerrada");
			}catch (Exception ex){
				ex.printStackTrace();
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
		System.out.println(ofertas.getO_Nombre());
		return ofertas;
	}

	@Override
	public void insertarOferta(Ofertas ofertas) {
		String sql = "INSERT INTO oferta (idOferta, O_Nombre, O_Descripcion, O_Fecha_inicio, O_Fecha_final,id_agencia) VALUES (?,?,?,?,?,?)";
		try {
			Connection link = this.Conectar();
			PreparedStatement stmt = link.prepareStatement(sql);
			stmt.setInt(1, ofertas.getIdOferta());
			stmt.setString(2, ofertas.getO_Nombre());
			stmt.setString(3, ofertas.getO_Descripcion());
			stmt.setString(4, ofertas.getO_Fecha_inicio());
			stmt.setString(5, ofertas.getO_Fecha_final());
			stmt.setInt(6, ofertas.getId_Agencia());
			stmt.executeUpdate();
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}

	@Override
	public void actualizarOferta(Ofertas ofertas) {
		String sql = "UPDATE profesion SET Nombre = ?, descripcion = ?, fechaInicio = ?, fechaFinal = ?, id_agencia = ? WHERE idOferta = ?";
		try {
			Connection link = this.Conectar();
			PreparedStatement stmt = link.prepareStatement(sql);
			stmt.setString(1, ofertas.getO_Nombre());
			stmt.setString(2, ofertas.getO_Descripcion());
			stmt.setString(3, ofertas.getO_Fecha_inicio());
			stmt.setString(4, ofertas.getO_Fecha_final());
			stmt.setInt(5, ofertas.getId_Agencia());
			stmt.setInt(6, ofertas.getIdOferta());
			stmt.executeUpdate();
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}

	@Override
	public void eliminarOferta(int id) {
		String sql="DELETE FROM oferta WHERE idOferta=?";
		try {
			Connection link = this.Conectar();
			PreparedStatement stmt = link.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}
	
	
	//profesion
		@Override
		public List<Profesion> obtenerTodoProfesion() {
			List<Profesion> listaProfesion = new ArrayList<Profesion>();
			String sql="SELECT * FROM profesion";
			try {
				Connection link = this.Conectar();
				Statement stmt = link.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					Profesion profesion = new Profesion(rs.getInt("id_Profesion"), rs.getString("P_Nombre"));
					System.out.println(rs.getString("P_Nombre"));
					listaProfesion.add(profesion);
				}
				try {
					link.close();
					System.out.println("conexion cerrada");
				}catch (Exception ex){
					ex.printStackTrace();
				}
			}catch (Exception ex){
				ex.printStackTrace();
			}
			return listaProfesion;
		}

		@Override
		public Profesion obtenerProfesion(int id) {
			Profesion profesion = null;
			String sql ="SELECT * FROM profesion WHERE id_Profesion= ? ";
			try {
				Connection link = this.Conectar();
				PreparedStatement stmt = link.prepareStatement(sql);
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery();
				rs.next();
				profesion = new Profesion(rs.getInt("id_Profesion"), rs.getString("P_Nombre"));
					//System.out.println(rs.getString("P_Nombre"));
					//System.out.println(aspirante.getP_nombre());
				try {
					link.close();
					System.out.println("conexion cerrada");
				}catch (Exception ex){
					ex.printStackTrace();
				}
			}catch (Exception ex){
				ex.printStackTrace();
			}
			System.out.println(profesion.getP_nombre());
			return profesion;
		}

		@Override
		public void insertarProfesion(Profesion profesion) {
			String sql = "INSERT INTO profesion (P_Nombre) VALUES (?)";
			try {
				Connection link = this.Conectar();
				PreparedStatement stmt = link.prepareStatement(sql);
				stmt.setString(1, profesion.getP_nombre());
				stmt.executeUpdate();
			}catch (Exception ex){
				ex.printStackTrace();
			}
		}

		@Override
		public void actualizarProfesion(Profesion profesion) {
			String sql = "UPDATE profesion SET P_Nombre= ? WHERE id_Profesion = ?";
			try {
				Connection link = this.Conectar();
				PreparedStatement stmt = link.prepareStatement(sql);
				stmt.setString(1, profesion.getP_nombre());
				stmt.setInt(2, profesion.getId_Profesion());
				stmt.executeUpdate();
			}catch (Exception ex){
				ex.printStackTrace();
			}
		}

		@Override
		public void eliminarProfesion(int id) {
			String sql="DELETE FROM profesion WHERE id=?";
			try {
				Connection link = this.Conectar();
				PreparedStatement stmt = link.prepareStatement(sql);
				stmt.setInt(1, id);
				stmt.executeUpdate();
			}catch (Exception ex){
				ex.printStackTrace();
			}
		}
	
		
		//agencias
				@Override
				public List<Agencia> obtenerTodoAgencia() {
					List<Agencia> listaAgencia = new ArrayList<Agencia>();
					String sql="SELECT * FROM agencia";
					try {
						Connection link = this.Conectar();
						Statement stmt = link.createStatement();
						ResultSet rs = stmt.executeQuery(sql);
						while(rs.next()) {
							Agencia agencia = new Agencia(rs.getInt("idAgencia"), rs.getString("Ag_Nombre"), rs.getString("Ag_Telefono"), rs.getString("Ag_Direccion"));
							System.out.println(rs.getString("Ag_Nombre"));
							listaAgencia.add(agencia);
						}
						try {
							link.close();
							System.out.println("conexion cerrada");
						}catch (Exception ex){
							ex.printStackTrace();
						}
					}catch (Exception ex){
						ex.printStackTrace();
					}
					return listaAgencia;
				}

				@Override
				public Agencia obtenerAgencia(int id) {
					Agencia agencia = null;
					String sql ="SELECT * FROM agencia WHERE idAgencia= ? ";
					try {
						Connection link = this.Conectar();
						PreparedStatement stmt = link.prepareStatement(sql);
						stmt.setInt(1, id);
						ResultSet rs = stmt.executeQuery();
						rs.next();
						agencia = new Agencia(rs.getInt("idAgencia"), rs.getString("Ag_Nombre"), rs.getString("Ag_Telefono"), rs.getString("Ag_Direccion"));
							//System.out.println(rs.getString("P_Nombre"));
							//System.out.println(aspirante.getP_nombre());
						try {
							link.close();
							System.out.println("conexion cerrada");
						}catch (Exception ex){
							ex.printStackTrace();
						}
					}catch (Exception ex){
						ex.printStackTrace();
					}
					System.out.println(agencia.getAg_Nombre());
					return agencia;
				}

				@Override
				public void insertarAgencia(Agencia agencia) {
					String sql = "INSERT INTO profesion (Ag_Nombre, Ag_Telefono, Ag_Direccion) VALUES (?,?,?)";
					try {
						Connection link = this.Conectar();
						PreparedStatement stmt = link.prepareStatement(sql);
						stmt.setString(1, agencia.getAg_Nombre());
						stmt.setString(2, agencia.getAg_Telefono());
						stmt.setString(3, agencia.getAg_Direccion());
						stmt.executeUpdate();
					}catch (Exception ex){
						ex.printStackTrace();
					}
				}

				@Override
				public void actualizarAgencia(Agencia agencia) {
					String sql = "UPDATE agencia SET Ag_Nombre= ?, Ag_Telefono= ?, Ag_Direccion = ?  WHERE idAgencia = ?";
					try {
						Connection link = this.Conectar();
						PreparedStatement stmt = link.prepareStatement(sql);
						stmt.setString(1, agencia.getAg_Nombre());
						stmt.setString(2, agencia.getAg_Telefono());
						stmt.setString(3, agencia.getAg_Direccion());
						stmt.setInt(4, agencia.getIdAgencia());
						stmt.executeUpdate();
					}catch (Exception ex){
						ex.printStackTrace();
					}
				}

				@Override
				public void eliminarAgencia(int id) {
					String sql="DELETE FROM agencia WHERE idAgencia=?";
					try {
						Connection link = this.Conectar();
						PreparedStatement stmt = link.prepareStatement(sql);
						stmt.setInt(1, id);
						stmt.executeUpdate();
					}catch (Exception ex){
						ex.printStackTrace();
					}
				}
	public static void main(String[] args) {
		Conexion conn = new Conexion();
		conn.obtenerTodoAspirante();
	}

}
