package Controlador;

import java.util.ArrayList;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import Modelo.Conexion;
import Servicio.Servicio;

@Named
@RequestScoped
public class AspiranteControlador {
	
	private List<Aspirante> listaAspirante = new ArrayList<Aspirante>();
	private Aspirante aspirante;
	private Servicio crud = new Servicio();

	public AspiranteControlador() {
		setAspirante(new Aspirante());
	}
			
	public Aspirante getAspirante() {
		return aspirante;
	}

	public void setAspirante(Aspirante aspirante) {
		this.aspirante = aspirante;
	}

	public List<Aspirante> seleccionarTodoAspirante(){
		listaAspirante.clear();
		listaAspirante=crud.obtenerTodoAspirante();
		return null;
	}
	
	public Aspirante obtenerAspirante(int id){
		this.aspirante=crud.obtenerAspirante(id);
		return null;
	}
	public String insertar(){
		crud.insertarAspirante(aspirante);
		aspirante=new Aspirante();
		seleccionarTodoAspirante();
		System.out.println("controlar");
		return null;
	}
	public String actualizar(){
		crud.actualizarAspirante(aspirante);
		aspirante=new Aspirante();
		seleccionarTodoAspirante();
		
		return null;
	}

	public String eliminar(int id){
		crud.eliminarAspirante(id);
		aspirante=new Aspirante();
		seleccionarTodoAspirante();
		return null;
	}
	
	public static void main(String[] args) {
	/*	AspiranteControlador aspiranteControlador = new AspiranteControlador();
		aspiranteControlador.seleccionarTodo();*/
	}

	public List<Aspirante> getListaAspirante() {
		return listaAspirante;
	}

	public void setListaAspirante(List<Aspirante> listaAspirante) {
		this.listaAspirante = listaAspirante;
	}

	public Servicio getCrud() {
		return crud;
	}

	public void setCrud(Servicio crud) {
		this.crud = crud;
	}
	
}
