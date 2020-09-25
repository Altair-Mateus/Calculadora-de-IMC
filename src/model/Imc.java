/*
 * Author: Altair Mateus T. Alencastro
 * Date: 2020/09/22 09:53 PM
 */

package model;

public class Imc 
{
	private String nome;
	private double altura;
	private double peso;
	private double imc; 
	
	//	Início dos Getters e Setters
	public String getNome()
	{
		return nome;
	}//	Fim do getter getNome
	public void setNome(String nome) 
	{
		this.nome = nome;
	}//	Fim do setter setNome
	
	public double getAltura() 
	{
		return altura;
	}//	Fim do getter getAltura
	public void setAltura(double altura)
	{
		this.altura = altura;
	}//	Fim do setter setNome
	
	public double getPeso() 
	{
		return peso;
	}//	Fim do getter getPeso
	public void setPeso(double peso) 
	{
		this.peso = peso;
	}//	Fim do setter setNome
	
	public double getImc()
	{
		return imc;
	}//	Fim do getter getImc	
	
	public void calculoImc()
	{
		imc = peso / (Math.pow(altura,2));
	}//Fim do método calculoImc()
	
	public String imc()
	{
		if(imc < 18.5)
		{
			return "MAGREZA";
		} else if(imc >= 18.5 && imc <= 24.9)
			{
				return "NORMAL";
			}else if(imc >= 25 && imc <= 29.9)
				{
					return "SOBREPESO";
				} else if(imc >= 30 && imc <= 39.9)
					{
						return "OBESIDADE";
					} else
					{
						return "OBESIDADE GRAVE";
					}//	Fim dos blocos if-else
		
	}//	Fim do método imc()
}//	Fim da classe Imc
