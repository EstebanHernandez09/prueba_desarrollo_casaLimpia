package Controlador;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import Servicio.Servicio;

@Named
@RequestScoped
public class OfertasControlador {
	private List<Ofertas> listaofertas = new ArrayList<Ofertas>();
	private Ofertas ofertas;
	private Servicio crud = new Servicio();
	
	public List<Ofertas> seleccionarTodo(){
		listaofertas.clear();
		listaofertas=crud.obtenerTodoOferta();
		return null;
	}
	
	public Ofertas obtenerOferta(int id){
		this.ofertas=crud.obtenerOferta(id);
		return null;
	}
	public String insertarOferta(Ofertas ofertas){
		crud.insertarOferta(ofertas);
		ofertas=new Ofertas();
		seleccionarTodo();
		
		return null;
	}
	public String actualizarOferta(Ofertas ofertas){
		crud.actualizarOferta(ofertas);
		ofertas=new Ofertas();
		seleccionarTodo();
		
		return null;
	}

	public String eliminarOferta(int id){
		crud.eliminarOferta(id);
		ofertas=new Ofertas();
		seleccionarTodo();
		return null;
	}
	
	public List<Ofertas> getListaofertas() {
		return listaofertas;
	}
	public void setListaofertas(List<Ofertas> listaofertas) {
		this.listaofertas = listaofertas;
	}
	public Ofertas getOfertas() {
		return ofertas;
	}
	public void setOfertas(Ofertas ofertas) {
		this.ofertas = ofertas;
	}
	public Servicio getCrud() {
		return crud;
	}
	public void setCrud(Servicio crud) {
		this.crud = crud;
	}
	
	
}
