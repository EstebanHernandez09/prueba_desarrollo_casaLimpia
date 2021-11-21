package Modelo;
import java.util.List;

import Controlador.Agencia;
import Controlador.Aspirante;
import Controlador.Ofertas;
import Controlador.Profesion;


public interface Transacciones {
	
	//metodos de crud ofertas
	public List<Ofertas> obtenerTodoOferta();
	
	public Ofertas obtenerOferta(int id);
	
	public void insertarOferta(Ofertas ofertas);
	
	public void actualizarOferta(Ofertas ofertas);

	public void eliminarOferta(int id);
	
	//metodos de crud aspirantes
	public List<Aspirante> obtenerTodoAspirante();
	
	public Aspirante obtenerAspirante(int id);
	
	public void insertarAspirante(Aspirante aspirante);
	
	public void actualizarAspirante(Aspirante aspirante);

	public void eliminarAspirante(int id);
	
	//metodos de crud profesiones
	public List<Profesion> obtenerTodoProfesion();
	
	public Profesion obtenerProfesion(int id);
	
	public void insertarProfesion(Profesion profesion);
	
	public void actualizarProfesion(Profesion profesion);

	public void eliminarProfesion(int id);
	
	//metodos de crud agencias
	public List<Agencia> obtenerTodoAgencia();
	
	public Agencia obtenerAgencia(int id);
	
	public void insertarAgencia(Agencia agencia);
	
	public void actualizarAgencia(Agencia agencia);

	public void eliminarAgencia(int id);
}
