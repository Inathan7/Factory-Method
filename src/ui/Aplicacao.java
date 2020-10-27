package ui;

import javax.swing.JFrame;

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
	
	
	//correspondente da logica 01, do main() de ClienteAplicacaoaA
	public void instalarListenerFechamento() {
		
	}
	
	//correspondente da logica 02, do main() de ClienteAplicacaoA
	public void instalarAreasDeLayout() {
		
	}
	
	
	//correspondente da logica 03, do main() de ClienteAplicacaoA
	public JFrame iniciar() {
		return null;
	}
	
	//factory-method
	public abstract JFrame fabricarJFrame();
	
}
