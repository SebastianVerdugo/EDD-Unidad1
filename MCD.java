package MaximoComunDivisor;

public class MCD 

{
	public static void main (String args [])
	{
		int mcd=0, n=1;
		mcd=maximoComunDivisor(22, 20, n, mcd);
		System.out.println(mcd);
	}
	public static int maximoComunDivisor(int valor1, int valor2, int n, int mcd)
	{
		if(valor1/n==1&& valor2/n==1)
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
