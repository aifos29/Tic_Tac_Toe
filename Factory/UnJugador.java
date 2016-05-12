package Factory;

import java.util.ArrayList;
import java.util.Random;

import Lógica.Varianzas;

public class UnJugador extends Partida {

	public ArrayList<Varianzas> estado_actual;

	


	
	
	public void movimientos(int fila,int columna){
			actual_player=1;
		    tablero[fila][columna]=simbolo_player1;
		
			fila_jugada=fila;
			columna_jugada=columna;
			movimientos --;
		
		}
	
	
	protected void cambiar_turno(){
			actual_player=2;
			ArrayList <Integer> mov = evaluar();
			tablero[mov.get(0)][mov.get(1)]=simbolo_player2;
			fila_jugada=mov.get(0);
			columna_jugada=mov.get(1);
			
		
		movimientos --;
	}
	
	private void inicializar_estado(){
		estado_actual = new ArrayList<Varianzas>();
		for (int i=0;i<3;i++){
			estado_actual.add(new Varianzas("Fila",i));
			estado_actual.add(new Varianzas("Columna",i));
		}
		for (int i=0;i<2;i++){
			estado_actual.add(new Varianzas("Diagonal",i));
		}
	}
	
	public ArrayList<Integer> evaluar(){
		recopiliar_datos();
		Varianzas respuesta = mejor_opcion();
		if (respuesta==null){
			
			return buscar_disponible();
		}
		else{
			return recuperar_posicion(respuesta.identificador,respuesta.numero);
		}
		
		
	}
	
	private ArrayList<Integer> recuperar_posicion(String posibilidad,int posicion){
		ArrayList<Integer> pos = new ArrayList<Integer>();
		switch (posibilidad){
		case "Fila":
			for (int i=0;i<3;i++){
				if (tablero[posicion][i].equals("0")){
					pos.add(posicion);
					pos.add(i);
				}
			}
			break;
		case "Columna":
			for (int i=0;i<3;i++){
				if (tablero[i][posicion].equals("0")){
					pos.add(i);
					pos.add(posicion);
				}
			}
			break;
		case "Diagonal":
			if (posicion==0){
				for (int i=0;i<3;i++){
					for (int j=0;j<3;j++){
						if (j==i && tablero[i][j].equals("0")){
							pos.add(i);
							pos.add(j);
						}
					}
				}
				break;
			}
			else{
				if (tablero[0][2].equals("0")){
					pos.add(0);
					pos.add(2);
					break;
				}
				if (tablero[1][1].equals("0")){
					pos.add(1);
					pos.add(1);
					break;
				}
				if (tablero[2][1].equals("0")){
					pos.add(2);
					pos.add(1);
					break;
				}
			}
		}
		return pos;
	}

	private void recopiliar_datos(){
		inicializar_estado();
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
					for (Varianzas var:estado_actual){
					if (var.numero==i && var.identificador=="Fila"){
						if (tablero[i][j].equals("x")){
							var.cont_x++;
						}
						if (tablero[i][j].equals("o")){
							var.cont_o++;
						}
					}
				}
			}
			}
		for (int i=0;i<3;i++){
			for (Varianzas var:estado_actual){
				for (int j=0;j<3;j++){
				if (var.numero==i && var.identificador=="Columna"){
					if (tablero[j][i].equals("x")){
						var.cont_x++;
					}
					if (tablero[j][i].equals("o")){
						var.cont_o++;
					}
				}
					
				}
			}
		}
		
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				if (j==i){
					if (tablero[i][j].equals("x")){
						estado_actual.get(6).cont_x ++;
					}
					if (tablero[i][j].equals("o")){
						estado_actual.get(6).cont_o ++;
					}
				}
			}
		}
		
		if (tablero[0][2].equals("x")){
			estado_actual.get(7).cont_x++;
		}
		if (tablero[1][1].equals("x")){
			estado_actual.get(7).cont_x++;
		}
		if (tablero[2][0].equals("x")){
			estado_actual.get(7).cont_x++;
		}
		if (tablero[0][2].equals("o")){
			estado_actual.get(7).cont_o++;
		}
		if (tablero[1][1].equals("o")){
			estado_actual.get(7).cont_o++;
		}
		if (tablero[2][0].equals("o")){
			estado_actual.get(7).cont_o++;
		}
		
		

		
	}
	

	private Varianzas mejor_opcion(){
		ArrayList <Varianzas> opciones = new ArrayList <Varianzas>();
		for (Varianzas var : estado_actual){
			if ((var.cont_o + var.cont_x)!=3){
				if (var.cont_o==2 || var.cont_x==2){
					if (var.cont_o == 2){
						var.dominante = "o";
					}
					if (var.cont_x==2){
						var.dominante="x";
					}
					opciones.add(var);
					
				}
			}
		}
		
		if (opciones.size()!=0){
			for (Varianzas var: opciones){
				if (var.dominante==simbolo_player2){
					return var;
				}
			}
			return opciones.get(0);
		}
			
		
		else{
			return null;
		}
		
		
	}

	private ArrayList<Integer> buscar_disponible() {
		ArrayList<Integer> posicion = new ArrayList<Integer>();
		boolean vacia=true;
		while (vacia){
			Random rnd = new Random();
			int col=rnd.nextInt(3);
			int fila=rnd.nextInt(3);
			
			if (tablero[fila][col].equals("0")){
				posicion.add(fila);
				posicion.add(col);
				vacia = false;
			}
			
		}
		     return posicion;
		
		
	}

}
