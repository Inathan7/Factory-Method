package ui;

import javax.swing.JFrame;

//CLASSE CRIADOR CONCRETO FEITA CONFORME PEDIDA - INATHAN

public class ModoAppEscuro extends Aplicacao {

	@Override
	public JFrame fabricarJFrame() {
		return new JFrameEscuro();
	}

}
