package Lógica;

import java.util.ArrayList;
import java.util.Iterator;

import Factory.Generador;
import Factory.Partida;




public class Modelo {
	private ArrayList<Funciones> vistas=new ArrayList<Funciones>();
	

	private Partida partida;
	
	public Modelo(){
		this(null);
	}

	public Modelo(Funciones vista) {
		if (vistas !=null){
			vistas.add(vista);
		}
		
	}
	
	public void movimientos(int fila,int columna){
		partida.movimientos(fila, columna);
		if (partida.descripcion=="DosJugadores"){
			actualizar_tablero(posicion(fila,columna));
			if (partida.revisar_ganador()){
				mostrar_ganador();
			}
			if (partida.movimientos==0){
				this.terminar();
			}
			partida.turno_computer();
			
		}
		else{
	     	actualizar_tablero(posicion(partida.fila_jugada,partida.columna_jugada));
	     	System.out.println(partida.movimientos);
	     	if (!partida.revisar_ganador() && partida.movimientos>0){
	     		partida.turno_computer();
	     		actualizar_tablero(posicion(partida.fila_jugada,partida.columna_jugada));
	     	}
	     	if (partida.revisar_ganador() && partida.movimientos>=0){
	     		this.mostrar_ganador();
	     	}
	     	else{
	     		if (partida.movimientos == 0){
	     			this.terminar();
	     		
	     	}
	     	}
	     	
	     	
		}
	}
	
	
	

	public void addContactView(Funciones view){
		if (!vistas.contains(view)){
			vistas.add(view);
		}
	}
	
	public void limpiar_vistas (){
		vistas.removeAll(vistas);
	}
	
	private void mostrar_ganador() 
	{
		Iterator<Funciones> notificar = vistas.iterator();
		while (notificar.hasNext()){
			
			notificar.next().mostrar_Ganador(partida.getactualPlayer());
		}
	}
	
	private void terminar(){
		Iterator<Funciones> notificar = vistas.iterator();
		while (notificar.hasNext()){
			
			notificar.next().fin_de_juego();
		}
	}
	
	private void actualizar_tablero(int pos){
		String enviar=" ";
		
		if (partida.getactualPlayer()==1){
			enviar = partida.simbolo_player1;
		}
		else{
			enviar=partida.simbolo_player2;
		}
		
		
		
		Iterator<Funciones> notificar = vistas.iterator();
		while (notificar.hasNext()){
		
			notificar.next().actualizar_juego(enviar,pos,partida.getactualPlayer());
		}
		
	}
	

	
	public void preparar_juego(String player1,String player2,String tipo){
		String jugador="player2";
		if (tipo.equals("OnePlayer")){
			jugador = "Computer";
		}
		
		Generador nueva= new Generador(tipo);
		partida=nueva.Crear_Partida();
		partida.iniciar(player1, player2);
		Iterator<Funciones> notificar = vistas.iterator();
		while (notificar.hasNext()){
			
			notificar.next().preparar_tablero(jugador);
		}
		
	
		
	}

	

	
	private int posicion(int fila,int columna){
		int pos=0;
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				if (fila==i && columna==j){
					return pos;
				}
				else pos++;
			}
		}
		
		return 0;
	}
	

	
	
	
	


	
	
	
	
	
	
	
	
}
