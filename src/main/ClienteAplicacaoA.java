package main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

import ui.Aplicacao;
import ui.JFrameClaro;
import ui.JFrameEscuro;

public class ClienteAplicacaoA {

	/*
	 * TODO FACTORY.METHOD.01
	 * 
	 * 1. Veja a implementacao do main() desta classe e o execute. 
	 * Esta classe simula uma codigo cliente que usa e depende de um new para um produto
	 * JFrameClaro. Veja que esse produto usado aqui no main() pode variar, futuramente, perante o código que aqui esta, 
	 * considerando as 03 logicas de manipulacao de produtos JFrame (existe tambem o produto JFrameEscuro) comentadas.
	 * 
	 * 
	 * 2. Precisamos que um segundo cliente ClienteAplicacaoB reaproveite esses codigos de logica aqui presentes.
	 * Eis que, ClienteAplicacaoB deve utilizar um new para produtos JFrameEscuro no lugar de JFrameClaro. Neste momento deve
	 * ocorrer a replicacao integral do restante do codigo de ClienteAplicacaoA em ClienteAplicacaoB. Realize isso para perceber
	 * esse esforco. Lembre-se que nao podemos mexer nesta classe, pois ela ja estava sendo usada por outros ou
	 * nao temos acesso ao seu codigo-fonte. Acesse o TODO.FACTORY.METHOD.01.2 presente em ClienteAplicacaoB para simular
	 * o que se pede neste passo da pratica.
	 * 
	 * 
	 * 3. Considerando essa replicacao inconveniente entre ClienteAplicacaoA e ClienteAplicacaoB 
	 * (e tambem a impossibilidade de alterar codigo aqui de ClienteAplicacaoA, pois ja esta em uso), 
	 * e a necessidade de mudança de uso do produto fabricado perante as 03 logicas, 
	 * assuma que o desenvolvedor do codigo da logica e dos produtos verificou que seria interessante aplicar 
	 * o padrao FACTORY METHOD. Na hierarquia de classes paralelas, do lado do supertipo PRODUTO, 
	 * tem-se o supertipo JFrame, com os produtos JFrameClaro e JFrameEscuro como subtipos, por extensao. 
	 * Do lado do supertipo das classes CRIADOR, considere o encapsulamento disso via classes do padrao, 
	 * que promoverao o reuso e a flexibilidade necessarias para mudar o produto sob essa logica. Chame essas
	 * classes CRIADORAS de ModoAppNormal e ModoAppEscuro. Acesse o TODO FACTORY.METHOD.01.3 presente na classe CRIADORA ABSTRATA
	 * Aplicacao para resolver este passo da pratica (ela ja contem todos os metodos para voce terminar de implementar). 
	 * Altere o codigo do main() aqui abaixo nesta classe, comentando o codigo original e adicionando
	 * o codigo que usa o padrao e repita o processo na outra classe ClienteAplicacaoB.
	 * 
	 * [PERGUNTA FATORY.METHOD.A] Com o padrao antes e depois aplicado, os clientes ClienteAplicacaoA e ClienteAplicacaoB 
	 * conhecem o tipo concreto dos produtos JFrame? Isso eh proposital e o que isso trouxe de bom para o codigo desses clientes?
	 * O problema de replicacao da logica sobre o produto que varia foi resolvido?
	 * 
	 *  
	 * 4. Considerando a aplicacao do padrao, imagine que o cliente representado pela classe 
	 * AplicacaoClienteB, resolveu lidar com um novo tipo de produto: use um JFrame default (sem especializacoes) 
	 * em ClienteAplicacaoB.main().
	 * 
	 * [PERGUNTA FATORY.METHOD.B] O que foi feito para o FACTORY METHOD final comportar o produto JFrame default la?
	 * Tivemos que replicar codigo de manipulacao para lidar com esse novo produto ou nao? Explique se
	 * o cliente, teve muito esforco para fazer essa troca perante o reproveitamento do codigo com a logica e se 
	 * a classe ClienteAplicacaoA teve que ser modificada.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		//codigo sem padrao: instaciando produto concreto com new e dependendo dele
		JFrameClaro janela = new JFrameClaro();

		//codigo sem padrao: manipulando logica 01 sobre o produto no proprio cliente
		janela.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//codigo sem padrao: manipulando logica 02 sobre o produto no proprio cliente
		JSplitPane split = new JSplitPane();
		split.setLeftComponent(new JPanel());
		split.setRightComponent(new JPanel());
		split.setDividerLocation(350);
		janela.add(split);

		//codigo sem padrao: manipulando logica 03 sobre o produto no proprio cliente
		janela.setVisible(true);

		//acesso a um metodo especifico do produto JFrameClaro, que vai variar nesta classe cliente. foco de acoplamento.
		janela.setIconeURL("https://www.ifpb.edu.br/++theme++verde/img/favicon.ico");
	}

}