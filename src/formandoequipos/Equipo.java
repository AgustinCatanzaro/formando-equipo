package formandoequipos;

import java.util.ArrayList;


public class Equipo implements Comparable<Equipo> {

	private ArrayList<Colaborador> equipo;
	private int afinidad;
	private int cantidadRespuestasIguales;
	private String respuestas;
	
	
	/*public Equipo(ArrayList<Colaborador> equipo) {
		this.equipo = equipo;
	}*/
	public Equipo(){
		this.equipo = new ArrayList<Colaborador>();
		this.afinidad = 0;
		this.cantidadRespuestasIguales = 0;
		this.respuestas = null;
	}
	
	public String getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(String respuestas) {
		this.respuestas = respuestas;
	}



	public int getAfinidad() {
		return afinidad;
	}


	public void setRespuestasIguales(int cantidadRespuestasIguales) {
		this.cantidadRespuestasIguales = cantidadRespuestasIguales;
	}


	public void agregarColaborador(Colaborador colaborador){
		this.equipo.add(colaborador);
	}

	public int calcularAfinidad(/*ArrayList<Colaborador> colaborador*/){
		int afinidad;
		afinidad = (int) (equipo.size()*(Math.pow(this.cantidadRespuestasIguales, 2)));
		
		return afinidad;
		
	}

	public int compareTo(Equipo arg0) {
		if (this.afinidad < arg0.afinidad) return -1;
		if (this.afinidad < arg0.afinidad) return 1;
		return 0;
	}
	
	
}

