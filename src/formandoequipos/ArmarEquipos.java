package formandoequipos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArmarEquipos extends MasFrecuente {
	private int cantidadEquipos;
	private ArrayList <Colaborador> colaboradores;
	private int cantidadColaboradores;
	private int cantidadPreguntas;
	
	
	public ArmarEquipos(String misColaboradores) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(misColaboradores));
		
		this.cantidadPreguntas = sc.nextInt();
		this.cantidadColaboradores = sc.nextInt();
		this.colaboradores = new ArrayList<Colaborador>();
		
		for(int i = 0 ; i < this.cantidadColaboradores ; i++){
			colaboradores.add(new Colaborador(cantidadPreguntas));
		}
		sc.nextLine();
		for(int i = 0 ; i < this.cantidadColaboradores ; i++){
			colaboradores.get(i).setRespuestas(sc.nextLine().toString());
		}
		
	}
	
	public void FormarEquipos() throws IOException{
		//Crear Archivo
		PrintWriter salida = null;
		String miPath="C:\\Users\\agust\\Desktop\\Facultad\\POO\\POO2\\WorkSpace\\FormandoEquipos\\";
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		ArrayList<String> aux = new ArrayList<String>();
		
		
		String respuesta="";
		
		for(int j = 0 ; j < this.cantidadPreguntas ; j++){
			System.out.println(aux);
			equipos.add(new Equipo());
			aux.clear();
			boolean flag = false;
			
			for(int i = 0 ; i < this.cantidadColaboradores ; i ++){
				
				aux.add(""+colaboradores.get(i).getRespuestas().charAt(j));
				
			}
			
			if(ArmarEquipos.mostFrequent(aux, aux.size()) == null) break;
			
			for(int i = 0 ; i < this.cantidadColaboradores ; i ++){
				
				if(flag == false){
					respuesta= respuesta+(ArmarEquipos.mostFrequent(aux, aux.size()));
					equipos.get(j).setRespuestas(respuesta);
					equipos.get(j).setRespuestasIguales(respuesta.length());
					flag = true;
				}
				
				if(ArmarEquipos.mostFrequent(aux, aux.size()).equals(colaboradores.get(i).getRespuestas().charAt(j))){
					
					equipos.get(j).agregarColaborador(colaboradores.get(i));
						
				}else {
					colaboradores.remove(i);
					this.cantidadColaboradores = this.cantidadColaboradores-1;
				}
				
				
			}//termina for de cantidad colaboradores(i)
			equipos.get(j).calcularAfinidad();
			
		}//termina for cantidad de preguntas(j)
		
		
		Collections.sort(equipos);
		salida=new PrintWriter(new FileWriter(miPath+"output.txt"/*, true*/));
		salida.println(equipos.get(0).getAfinidad());
		salida.println(equipos.get(0).getRespuestas());
		
		salida.close();
		
	
	
	
	}//termina formando equipos
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArmarEquipos e1 = new ArmarEquipos("input");
		e1.FormarEquipos();
		
		//System.out.println("size de colaboradores: "+e1.colaboradores.size());
		//System.out.println(e1.colaboradores.get(0).getRespuestas());
		/*for(int i = 0 ; i < e1.cantidadColaboradores ; i++){
			System.out.println(e1.colaboradores.get(i).getRespuestas());
		}*/
		

	}

}
