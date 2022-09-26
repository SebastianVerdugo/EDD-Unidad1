package ArregloMenor;

public class NumeromenorArreglo 
{
	public static void main (String args[])
	{
		int[] valores = {9, 3, 7, 1, 8};
		int i=0, menor=999999999;
		menor=arregloMenor(valores, i, menor);
		System.out.println(menor);
	}
	public static int arregloMenor(int[] valor, int i, int menor)
	{
		if(i==valor.length-1)
		{
			return menor;
		}
		if(valor[i]<menor)
		{
			menor=valor[i];
		}
		return arregloMenor(valor, i+1, menor);
		
	}

}
	/*
		return arregloMenor(valor, i+1, menor);
		
		Se cumple la condicion valor[i)<menor
		
		arregloMenor(arreglo, 1, 8)
		
		Se cumple la condicion valor[i)<menor
		
		arregloMenor(arreglo, 2, 1)
		arregloMenor(arreglo, 3, 1)
		arregloMenor(arreglo, 4, 1)
		
		Se cumple la condicion i=tamañovector-1
		
		retorna 1
		
	*/
