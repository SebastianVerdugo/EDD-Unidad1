package BinarioaDecimal;

public class ConvertidorDecimal {
	
	public static void main (String args[])
	{
		int  n=2, contador=0, acumulador=0;
		acumulador=convertidor(1110,  n, contador, acumulador);
		System.out.println(acumulador);
	}
	
	public static int convertidor(int valor,  int n, int contador, int acumulador)
	{
		if(valor==0)
		{
			return acumulador;
		}
		if(contador==0 && valor%10==1)
		{
			acumulador=acumulador+1;
		}
		if(contador==1 && valor%10==1)
		{
			acumulador=acumulador+n;
		}
		if(contador>=2 && valor%10==1)
		{
			n=n*2;
			acumulador=acumulador+n;
		}
		if(valor%10==0)
		{
			acumulador=acumulador+0;
		}
		return convertidor(valor/10, n, contador+1, acumulador);
		
	}

}
