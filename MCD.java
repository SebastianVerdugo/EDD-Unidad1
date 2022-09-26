package MaximoComunDivisor;

public class MCD 

{
	public static void main (String args [])
	{
		int mcd=0, n=1;
		mcd=maximoComunDivisor(18, 12, n, mcd);
		System.out.println(mcd);
	}
	public static int maximoComunDivisor(int valor1, int valor2, int n, int mcd)
	{
		if(valor1/n==1 || valor2/n==1)
		{
			return mcd;
		}
		if(valor1%n==0 && valor2%n==0)
		{
			mcd=n;
		}
		return maximoComunDivisor(valor1, valor2, n+1, mcd);
	}
	   
}
	/*
		return maximoComunDivisor(valor1, valor2, n+1, mcd);
		
		Se cumple la condicion valor1%n=0 && valor2%n=0
		MaximoComunDivisor(22, 20, 2, 2)
		
		Se cumple la condicion valor1%n=0 && valor2%n=0
		MaximoComunDivisor(22, 20, 3, 3)
		MaximoComunDivisor(22, 20, 4, 3)
		MaximoComunDivisor(22, 20, 5, 3)
		
		
		Se cumple la condicion valor1%n=0 && valor2%n=0
		MaximoComunDivisor(22, 20, 6, 6)
		MaximoComunDivisor(22, 20, 7, 6)
		MaximoComunDivisor(22, 20, 8, 6)
		MaximoComunDivisor(22, 20, 9, 6)
		MaximoComunDivisor(22, 20, 10, 6)
		MaximoComunDivisor(22, 20, 11, 6)
		MaximoComunDivisor(22, 20, 12, 6)
		MaximoComunDivisor(22, 20, 13, 6)
		MaximoComunDivisor(22, 20, 15, 6)
		MaximoComunDivisor(22, 20, 16, 6)
		MaximoComunDivisor(22, 20, 17, 6)
		MaximoComunDivisor(22, 20, 18, 6)
		
		Se cumple la condicion valor1/n=1 o valor2/n=1
		
		retorna 6
	*/
