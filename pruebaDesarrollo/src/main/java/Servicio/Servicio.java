package Servicio;

import Modelo.Conexion;


import java.util.List;

import Controlador.Agencia;
import Controlador.Aspirante;
import Controlador.Ofertas;
import Controlador.Profesion;

public class Servicio {
	
	public List<Aspirante> obtenerTodoAspirante(){
		Conexion conexion = new Conexion();
		return conexion.obtenerTodoAspirante();
	}
	
	public Aspirante obtenerAspirante(int id){
		Conexion conexion = new Conexion();
		return conexion.obtenerAspirante(id);
	}
	
	public void insertarAspirante(Aspirante aspirante) {
		System.out.println("servicio");
		Conexion conexion = new Conexion();
		conexion.insertarAspirante(aspirante);
	}
	
	public void actualizarAspirante(Aspirante aspirante) {
		Conexion conexion = new Conexion();
		conexion.actualizarAspirante(aspirante);
	}
	
	public void eliminarAspirante(int id) {
		Conexion conexion = new Conexion();
		conexion.eliminarAspirante(id);
	}
	
	//ofertas
	
	public List<Ofertas> obtenerTodoOferta(){
		Conexion conexion = new Conexion();
		return conexion.obtenerTodoOferta();
	}
	
	public Ofertas obtenerOferta(int id){
		Conexion conexion = new Conexion();
		return conexion.obtenerOferta(id);
	}
	
	public void insertarOferta(Ofertas ofertas) {
		Conexion conexion = new Conexion();
		conexion.insertarOferta(ofertas);
	}
	
	public void actualizarOferta(Ofertas ofertas) {
		Conexion conexion = new Conexion();
		conexion.actualizarOferta(ofertas);
	}
	
	public void eliminarOferta(int id) {
		Conexion conexion = new Conexion();
		conexion.eliminarOferta(id);
	}
	
	//profesion
	public List<Profesion> obtenerTodoProfesion(){
		Conexion conexion = new Conexion();
		return conexion.obtenerTodoProfesion();
	}
	
	public Profesion obtenerProfesion(int id){
		Conexion conexion = new Conexion();
		return conexion.obtenerProfesion(id);
	}
	
	public void insertarProfesion(Profesion profesion) {
		Conexion conexion = new Conexion();
		conexion.insertarProfesion(profesion);
	}
	
	public void actualizarProfesion(Profesion profesion) {
		Conexion conexion = new Conexion();
		conexion.actualizarProfesion(profesion);
	}
	
	public void eliminarProfesion(int id) {
		Conexion conexion = new Conexion();
		conexion.eliminarProfesion(id);
	}
	
	//agencia
		public List<Agencia> obtenerTodoAgencia(){
			Conexion conexion = new Conexion();
			return conexion.obtenerTodoAgencia();
		}
		
		public Agencia obtenerAgencia(int id){
			Conexion conexion = new Conexion();
			return conexion.obtenerAgencia(id);
		}
		
		public void insertarAgencia(Agencia agencia) {
			Conexion conexion = new Conexion();
			conexion.insertarAgencia(agencia);
		}
		
		public void actualizarAgencia(Agencia agencia) {
			Conexion conexion = new Conexion();
			conexion.actualizarAgencia(agencia);
		}
		
		public void eliminarAgencia(int id) {
			Conexion conexion = new Conexion();
			conexion.eliminarAgencia(id);
		}
	
	
	public static void main(String[] args) {
		Servicio servicio = new Servicio();
		servicio.obtenerTodoOferta();
	}
	

}
