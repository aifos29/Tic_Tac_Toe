package L�gica;

public class Principal {
	public static void main (String [] args){

		Modelo modelo = new Modelo();
		Controller controlador = new Controller(modelo);
		
		View.Pantalla_Juego Pantalla = new View.Pantalla_Juego(controlador);
		modelo.limpiar_vistas();
		modelo.addContactView(Pantalla);
		
		
		
	}
	

}
