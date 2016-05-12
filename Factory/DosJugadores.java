package Factory;

public class DosJugadores extends Partida {
	
	public void movimientos(int fila,int columna){
		if (actual_player==1){
			
			tablero[fila][columna]=simbolo_player1;
			
		}
		else{
			tablero[fila][columna]=simbolo_player2;
		}
	
		
		
		

	}
	
	public DosJugadores(){
		descripcion = "DosJugadores";
	}
}
