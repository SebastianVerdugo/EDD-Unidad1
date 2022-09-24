package Digitomin;

public class DigitoMinimo {
	public static void main(String args[])
	{
		int  valormin=999999999, cont=0;
		valormin=compara(valormin, 3154);
		System.out.println(valormin);
	}
	public static int compara(int valormin, int valor)
	{
		if(valor==0)
		{
			return valormin;
		}
		if(valor%10==0)
		{
			return valormin=0;
		}
		if(valormin>valor%10)
		{
			valormin=valor%10;
		}
		return compara(valormin, valor=valor/10);
	}
//3
//4
//2
//3
}
