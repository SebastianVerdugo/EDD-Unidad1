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
