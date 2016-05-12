package View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

import Lógica.Controller;
import Lógica.Funciones;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.ComponentOrientation;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextField;

public class Pantalla_Juego implements Funciones {

	private JFrame frame;
	private Controller controlador;
	public JButton button00;
	public JButton button01;
	public JButton button02;
	public JButton button10;
	public JButton button11;
	public JButton button12;
	public JButton button20;
	public JButton button21;
	public JButton button22;
	private JSeparator linea3;
	private JSeparator linea1;
	private JSeparator linea2;
	public JTextField txtplayer1;
	public JTextField txtplayer2;
	public JMenuItem mntmModoInvidual;
	public JMenuItem mntmDosJugadores;
	private JLabel lbljugadores;
	private JLabel lblPlayer;
	private JLabel lblPlayer2;


	
	


	public Pantalla_Juego(Controller c) {
		this.controlador=c;
		c.Asignar_Vista(this);
		initialize();
		addEvents();
	}

	private void addEvents() {
		this.button00.addActionListener(controlador);
		this.button01.addActionListener(controlador);
		this.button02.addActionListener(controlador);
		this.button10.addActionListener(controlador);
		this.button11.addActionListener(controlador);
		this.button12.addActionListener(controlador);
		this.button20.addActionListener(controlador);
		this.button21.addActionListener(controlador);
		this.button22.addActionListener(controlador);
		this.mntmDosJugadores.addActionListener(controlador);
		this.mntmModoInvidual.addActionListener(controlador);
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 526, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel_tablero = new JPanel();
		panel_tablero.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_tablero.setBounds(0, 0, 525, 322);
		frame.getContentPane().add(panel_tablero);
		panel_tablero.setLayout(null);
		
		lbljugadores = new JLabel("");
		lbljugadores.setBounds(340, 23, 157, 14);
		panel_tablero.add(lbljugadores);
		
		txtplayer2 = new JTextField();
		txtplayer2.setEnabled(false);
		txtplayer2.setText("o");
		txtplayer2.setColumns(10);
		txtplayer2.setBounds(334, 279, 86, 14);
		panel_tablero.add(txtplayer2);
		
		txtplayer1 = new JTextField();
		txtplayer1.setEnabled(false);
		txtplayer1.setText("x");
		txtplayer1.setBounds(98, 279, 86, 14);
		panel_tablero.add(txtplayer1);
		txtplayer1.setColumns(10);
		
		lblPlayer2 = new JLabel("Player2:");
		lblPlayer2.setBounds(231, 279, 93, 14);
		panel_tablero.add(lblPlayer2);
		
		lblPlayer = new JLabel("Player 1:");
		lblPlayer.setBounds(10, 277, 75, 14);
		panel_tablero.add(lblPlayer);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		panel_tablero.add(menuBar);
		
		JMenu mnOpciones = new JMenu("Opciones");
		menuBar.add(mnOpciones);
		
		mntmModoInvidual = new JMenuItem("Un Jugador");
		mnOpciones.add(mntmModoInvidual);
		
		mntmDosJugadores = new JMenuItem("Dos Jugadores");
		mnOpciones.add(mntmDosJugadores);
		
		linea2 = new JSeparator();
		linea2.setOrientation(SwingConstants.VERTICAL);
		linea2.setBackground(Color.RED);
		linea2.setBounds(294, 37, 10, 247);
		panel_tablero.add(linea2);
		
		linea1 = new JSeparator();
		linea1.setOrientation(SwingConstants.VERTICAL);
		linea1.setBackground(Color.RED);
		linea1.setBounds(211, 37, 10, 247);
		panel_tablero.add(linea1);
		
		linea3 = new JSeparator();
		linea3.setBackground(Color.RED);
		linea3.setBounds(95, 194, 348, 30);
		panel_tablero.add(linea3);
		
		JSeparator linea4 = new JSeparator();
		linea4.setBackground(Color.RED);
		linea4.setBounds(95, 117, 348, 30);
		panel_tablero.add(linea4);
		
		button00 = new JButton("");
		button00.setEnabled(false);
		button00.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button00.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		button00.setBounds(141, 52, 60, 60);
		panel_tablero.add(button00);
		
		button01 = new JButton("");
		button01.setEnabled(false);
		button01.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button01.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		button01.setBounds(224, 52, 60, 60);
		panel_tablero.add(button01);
		
		button02 = new JButton("");
		button02.setEnabled(false);
		button02.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button02.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		button02.setBounds(310, 52, 60, 60);
		panel_tablero.add(button02);
		
		button10 = new JButton("");
		button10.setEnabled(false);
		button10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button10.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		button10.setBounds(141, 123, 60, 60);
		panel_tablero.add(button10);
		
		button11 = new JButton("");
		button11.setEnabled(false);
		button11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button11.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		button11.setBounds(224, 123, 60, 60);
		panel_tablero.add(button11);
		
		button12 = new JButton("");
		button12.setEnabled(false);
		button12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button12.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		button12.setBounds(310, 123, 60, 60);
		panel_tablero.add(button12);
		
		button20 = new JButton("");
		button20.setEnabled(false);
		button20.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button20.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		button20.setBounds(141, 208, 60, 60);
		panel_tablero.add(button20);
		
		button21 = new JButton("");
		button21.setEnabled(false);
		button21.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button21.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		button21.setBounds(224, 208, 60, 60);
		panel_tablero.add(button21);
		
		button22 = new JButton("");
		button22.setEnabled(false);
		button22.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button22.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		button22.setBounds(310, 208, 60, 60);
		panel_tablero.add(button22);
		
		JLabel lblimagen = new JLabel("");
		lblimagen.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblimagen.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/bloggif_5733a3bc72066.png")));
		lblimagen.setBounds(0, 0, 525, 322);
		panel_tablero.add(lblimagen);
	}


	public void mostrar_Ganador(int ganador) {
		String player;
		if (ganador==1){
			player = "Jugador 1";
		}
		else{
			player="Jugador 2";
		}
		
		this.button00.setEnabled(false);
		this.button01.setEnabled(false);
		this.button02.setEnabled(false);
		this.button10.setEnabled(false);
		this.button11.setEnabled(false);
		this.button12.setEnabled(false);
		this.button20.setEnabled(false);
		this.button21.setEnabled(false);
		this.button22.setEnabled(false);
		
		
		 
       JOptionPane.showMessageDialog(frame,"El ganador es "+player, "Advertencia",
           JOptionPane.WARNING_MESSAGE);
      
		
	}

	public void preparar_tablero(String jugador){
		this.button00.setEnabled(true);
		this.button01.setEnabled(true);
		this.button02.setEnabled(true);
		this.button10.setEnabled(true);
		this.button11.setEnabled(true);
		this.button12.setEnabled(true);
		this.button20.setEnabled(true);
		this.button21.setEnabled(true);
		this.button22.setEnabled(true);
		
		this.button00.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		this.button01.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		this.button02.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		this.button10.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		this.button11.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		this.button12.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		this.button20.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		this.button21.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		this.button22.setIcon(new ImageIcon(Pantalla_Juego.class.getResource("/Imagenes/boton.png")));
		
		this.lblPlayer2.setText(jugador);
		
		
	}

	public void actualizar_juego(String actual, int pos,int jugador) {
		if (jugador == 1){
			this.lbljugadores.setText(this.lblPlayer.getText());
		}
		else{
			this.lbljugadores.setText(this.lblPlayer2.getText());
			
		}
		ImageIcon cambiar;
	
		if (actual.equals("x")){
			cambiar = new ImageIcon (Pantalla_Juego.class.getResource("/Imagenes/equis.jpg"));
		}
		else{
			cambiar = new ImageIcon (Pantalla_Juego.class.getResource("/Imagenes/circulo.jpg"));
		}
		switch (pos){
		
		case 0:
			this.button00.setIcon(cambiar);
			this.button00.setEnabled(false);
			break;
		case 1:
			this.button01.setIcon(cambiar);
			this.button01.setEnabled(false);
			break;
		case 2:
			this.button02.setIcon(cambiar);
			this.button02.setEnabled(false);
			break;
		case 3:
			this.button10.setIcon(cambiar);
			this.button10.setEnabled(false);
			break;
		case 4:
			this.button11.setIcon(cambiar);
			this.button11.setEnabled(false);
			break;
		case 5:
			this.button12.setIcon(cambiar);
			this.button12.setEnabled(false);
			break;
		case 6:
			this.button20.setIcon(cambiar);
			this.button20.setEnabled(false);
			break;
		case 7:
			this.button21.setIcon(cambiar);
			this.button21.setEnabled(false);
			break;
		case 8:
			this.button22.setIcon(cambiar);
			this.button22.setEnabled(false);
			break;
		
			
			
		}
		
		
	}

	@Override
	public void fin_de_juego() {
		JOptionPane.showMessageDialog(frame,"Sin movimientos", "Game Over",
		           JOptionPane.WARNING_MESSAGE);
		
	}



	
}
