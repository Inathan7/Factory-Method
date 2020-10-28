package ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 * TODO FACTORY.METHOD.01.3
 * 
 * 1. Associe as logicas do cliente que serao reusadas com os metodos abaixo comentados
 * 2. Estenda esta classe CRIADORA ABSTRATA para que se implemente o factory method 
 * fabricarJFrame(), que devole o supertipo de produto JFrame. Nas subclasses
 * CRIADORAS ModoAppNormal e ModoAppEscuro, implemente fabricarJFrame(), encapsulando o new
 * com o respectivo subtipo de JFrame (JFrameClaro e JFrameEscuro ja estao implementados no pacote ui).
 *
 */
public abstract class Aplicacao {
	
	private JFrame janela = fabricarJFrame();  // ADICIONEI ESSE ATRIBUTO PARA PODER CHAMAR MÉTODOS DE JFRAME - INATHAN
	
	//correspondente da logica 01, do main() de ClienteAplicacaoaA
	public void instalarListenerFechamento() {
		janela.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	//correspondente da logica 02, do main() de ClienteAplicacaoA
	public void instalarAreasDeLayout() {
		JSplitPane split = new JSplitPane();
		split.setLeftComponent(new JPanel());
		split.setRightComponent(new JPanel());
		split.setDividerLocation(350);
		janela.add(split);
	}
	
	
	//correspondente da logica 03, do main() de ClienteAplicacaoA
	public JFrame iniciar() {
		janela.setVisible(true);
		return janela;
	}
	
	//factory-method
	public abstract JFrame fabricarJFrame();
	
}
