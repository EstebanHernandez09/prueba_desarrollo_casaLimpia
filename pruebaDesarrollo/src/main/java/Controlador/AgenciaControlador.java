package Controlador;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import Servicio.Servicio;

@Named
@RequestScoped
public class AgenciaControlador {
	private List<Agencia> listaagencia = new ArrayList<Agencia>();
	private Agencia agencia;
	private Servicio crud = new Servicio();
	
	public List<Agencia> seleccionarTodoAgencia(){
		listaagencia.clear();
		listaagencia=crud.obtenerTodoAgencia();
		return null;
	}
	
	public Agencia obtenerAgencia(int id){
		this.agencia=crud.obtenerAgencia(id);
		return null;
	}
	public String insertarAgencia(Agencia agencia){
		crud.insertarAgencia(agencia);
		agencia=new Agencia();
		seleccionarTodoAgencia();
		
		return null;
	}
	public String actualizarAgencia(Agencia agencia){
		crud.actualizarAgencia(agencia);
		agencia=new Agencia();
		seleccionarTodoAgencia();
		
		return null;
	}

	public String eliminarAgencia(int id){
		crud.eliminarAgencia(id);
		agencia=new Agencia();
		seleccionarTodoAgencia();
		return null;
	}
}
