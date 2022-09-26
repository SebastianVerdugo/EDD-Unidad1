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
	/*
		return convertidor(valor/10, n, contador+1, acumulador);
		
		Se cumple condicion valor%10=0
		
		convertidor(111, 2, 1, 0)
		
		Se cumple condicion contador=1 y valor%10=1
		
		convertidor(11, 2, 2, 2)
		
		Se cumple condicion  contador>=2 y valor%10=1
		
		convertidor(1, 2, 4, 6)
		
		Se cumple condicion contador>=2 y valor%10=1
		
		convertidor(0, 2, 8, 14)
		
		Se cumple condicion valor=0
		
		retorna 14
	*/

