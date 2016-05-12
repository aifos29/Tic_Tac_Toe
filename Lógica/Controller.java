package Lógica;

import View.Pantalla_Juego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	private Pantalla_Juego Interfaz;
	private Modelo modelo;
	
	public Controller (Modelo modelo){
		this.modelo= modelo;
	}
	public void Asignar_Vista(Pantalla_Juego Pantalla){
		this.Interfaz=Pantalla;
	}
	
	
	public void actionPerformed(ActionEvent evt){
		Object source = evt.getSource();
		if (source == Interfaz.button00){
			modelo.movimientos(0,0);
		}
		if (source == Interfaz.button01){
			modelo.movimientos(0,1);
		}
		if (source == Interfaz.button02){
			modelo.movimientos(0,2);
		}
		if (source == Interfaz.button10){
			modelo.movimientos(1,0);
		}
		if (source == Interfaz.button11){
			modelo.movimientos(1,1);
		}
		if (source == Interfaz.button12){
			modelo.movimientos(1,2);
		}
		if (source == Interfaz.button20){
			modelo.movimientos(2,0);
		}
		if (source == Interfaz.button21){
			modelo.movimientos(2,1);
		}
		if (source == Interfaz.button22){
			modelo.movimientos(2,2);
		}
		if (source == Interfaz.mntmDosJugadores){
			modelo.preparar_juego(Interfaz.txtplayer1.getText(),Interfaz.txtplayer2.getText(),"TwoPlayer");
		}
		if (source == Interfaz.mntmModoInvidual){
			modelo.preparar_juego(Interfaz.txtplayer1.getText(),Interfaz.txtplayer2.getText(), "OnePlayer");
		}
	}

}
