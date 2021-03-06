package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;

public class JFrameEscuro extends JFrame {

	private Color corFundo = new Color(0, 0, 0);
	private Color corFonte = new Color(79, 79, 79);


	public JFrameEscuro() {
		setExtendedState(MAXIMIZED_BOTH);
		setEsquemaCores(this);
	}

	@Override
	public Component add(Component comp) {
		if (comp instanceof Container) {
			for (Component filho : ((Container)comp).getComponents()) {
				setEsquemaCores(filho);
			}
		} 
		setEsquemaCores(comp);
		return super.add(comp);
	}

	public Component setEsquemaCores(Component comp) {
		//setando cor de fonte do componente adicionado
		comp.setBackground(corFundo);

		//setando fonte
		Font font = comp.getFont();
		//				comp.setFont(font.deriveFont(Font.PLAIN));

		//setando cor da fonte
		comp.setForeground(corFonte);
		return comp;
	}
	
	
	
	
	
}
