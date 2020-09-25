/*
 * Author: Altair Mateus T. Alencastro
 * Date: 2020/09/22 09:53 PM
 */


package model;

import javax.swing.JOptionPane;

public class Aplicacao 
{
	public static void main(String[] args)
	{
//		Vari�vel auxiliar
		String aux;
		int op = 0;
		
		while(op != 2)
		{
			 aux = JOptionPane.showInputDialog("1 - Calcular | 2 - Sair");
			 	op = (Integer.parseInt(aux));
			
			if(op == 1)
			{
				//	Objeto
				Imc imc = new Imc();
				
				//	Leitura do nome
				imc.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
				
				//	Leitura do Peso
				aux = JOptionPane.showInputDialog("Digite seu peso em Kg: \n Exemplo: 53");
					imc.setPeso(Double.parseDouble(aux));
					
				//	Leitura da Altura
				aux = JOptionPane.showInputDialog("Digite sua altura em Metros: \n Exemplo: 1.60");
					imc.setAltura(Double.parseDouble(aux));
				
				//	C�lculo do imc
				imc.calculoImc();
				
				//	Exibi��o do Resultado
				String result = String.format("%s, seu IMC � %.2f e voc� est� no estado %s", imc.getNome(), imc.getImc(),imc.imc());
				JOptionPane.showMessageDialog(null, result);
			}//	Fim do bloco if
		}//	Fim do bloco de repeti��o while
				
				
		
	}//	Fim do m�todo main
}//	Fim da classe Aplicacao
