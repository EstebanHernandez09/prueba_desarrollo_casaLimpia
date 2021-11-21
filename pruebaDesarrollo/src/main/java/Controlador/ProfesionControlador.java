package Controlador;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import Servicio.Servicio;

@Named
@RequestScoped
public class ProfesionControlador {
	private List<Profesion> listaProfesion = new ArrayList<Profesion>();
	private Profesion profesion;
	private Servicio crud = new Servicio();
	private String sel ="seleccione un opcion";
	
	
	
	public String getSel() {
		return sel;
	}

	public void setSel(String sel) {
		this.sel = sel;
	}

	public ProfesionControlador() {
		setProfesion(new Profesion());
	}
			
	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}

	public List<Profesion> seleccionarTodoProfesion(){
		listaProfesion.clear();
		listaProfesion=crud.obtenerTodoProfesion();
		return null;
	}
	
	public Profesion obtenerProfesion(int id){
		this.profesion=crud.obtenerProfesion(id);
		return null;
	}
	public String insertarProfesion(Profesion profesion){
		crud.insertarProfesion(profesion);
		profesion=new Profesion();
		seleccionarTodoProfesion();
		
		return null;
	}
	public String actualizarProfesion(Profesion profesion){
		crud.actualizarProfesion(profesion);
		profesion=new Profesion();
		seleccionarTodoProfesion();
		
		return null;
	}

	public String eliminarProfesion(int id){
		crud.eliminarProfesion(id);
		profesion=new Profesion();
		seleccionarTodoProfesion();
		return null;
	}
	
	public static void main(String[] args) {
		ProfesionControlador profesionControlador = new ProfesionControlador();
		profesionControlador.seleccionarTodoProfesion();
	}

	public List<Profesion> getListaProfesion() {
		return listaProfesion;
	}

	public void setListaProfesion(List<Profesion> listaProfesion) {
		this.listaProfesion = listaProfesion;
	}

	public Servicio getCrud() {
		return crud;
	}

	public void setCrud(Servicio crud) {
		this.crud = crud;
	}
	
}
