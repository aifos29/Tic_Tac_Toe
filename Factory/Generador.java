package Factory;

public class Generador {
	protected String tipo;
	
	public Generador(String tipo){
		this.tipo=tipo;
	}
	
	public Partida Crear_Partida(){
		if (tipo.equalsIgnoreCase("OnePlayer")){
			return new UnJugador();
		}
		else{
			return new DosJugadores();
		}
	}
	
	

}
