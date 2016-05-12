package Factory;

public class Partida {
	public int movimientos=9;
	public String simbolo_player1;
	public String simbolo_player2;
	protected String[][] tablero;
	protected int actual_player;
	public String descripcion;
	public int fila_jugada;
	public int columna_jugada;
	public Partida(){
		
	
	}
	
	public int getactualPlayer(){
		return actual_player;
	}
	
	public void iniciar(String player1, String player2){
		simbolo_player1=player1;
		simbolo_player2=player2;
		actual_player=1;
		tablero = new String[3][3];
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				tablero[i][j]="0";
			}
		}
		System.out.println(simbolo_player1+simbolo_player2);
		
	}
	
	protected void cambiar_turno(){
		if (actual_player==1){
			actual_player=2;
		}
		else{
			actual_player=1;
		}
		movimientos --;
	}
	
	public boolean evaluar_columnas(){
		for (int i=0;i<3;i++){
			if (revisar_campos(tablero[0][i],tablero[1][i],tablero[2][i])== true){
				return true;
			}
		}
		return false;
	}


	public boolean evaluar_filas(){
		for (int i=0;i<3;i++){
			if (revisar_campos(tablero[i][0],tablero[i][1],tablero[i][2])== true){
				return true;
			}
		}
		return false;
	}
		
	
	public boolean evaluar_diagonal(){
		if (revisar_campos(tablero[0][0],tablero[1][1],tablero[2][2])==true || revisar_campos(tablero[0][2],tablero[1][1],tablero[2][0])){
			return true;
		}
		return false;
	}
	
	private boolean revisar_campos(String uno,String dos,String tres){
		if (uno!="0" && dos!="0" && tres!="0"){
		return (uno==dos && dos==tres);
		}
		else{
			return false;
		}
	}
	
	public boolean revisar_ganador(){
		
		if (evaluar_columnas()==true || evaluar_filas()==true || evaluar_diagonal()==true){
			return true;
		}
		return false;
		
	
	}
	
	public  void movimientos(int fila,int columna){
			
			
	}
	public void turno_computer(){
		cambiar_turno();
	}
	
	
	
}
