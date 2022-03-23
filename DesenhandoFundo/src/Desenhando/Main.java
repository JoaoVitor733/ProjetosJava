package Desenhando;

import javax.swing.JFrame;

public class Main extends JFrame {
	
	public Main() {
		configurandoJanela();
	}
	
	public void configurandoJanela() {
		setSize(600,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(new Desenhando());
	}

	public static void main(String[] args) {
		new Main();
	}

}
