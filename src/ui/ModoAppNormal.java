package ui;

import javax.swing.JFrame;

//CLASSE CRIADOR CONCRETO FEITA CONFORME PEDIDA - INATHAN

public class ModoAppNormal extends Aplicacao {

	@Override
	public JFrame fabricarJFrame() {
		return new JFrameClaro();
	}

}
