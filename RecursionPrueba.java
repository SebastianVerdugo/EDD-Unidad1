package PruebaRecursiva;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RecursionPrueba 
{
	
	public static void main (String args[])
	{
		RecursionPrueba r= new RecursionPrueba ();
		System.out.println(r.misterio(15));
		System.out.println(r.misterio(20));
		System.out.println(15/2);
	}

	int misterio (int n)
	{
       System.out.println(n);
		if(n==1 || n==0)
		{
			return n;
		}
		else
		{
			return 10*misterio(n/2)+n%2;
		}
	}
	/*El metodo transforma tanto a 15 y 20 en su equivalente binaria
	       
	       misterio(n/2)       10*misterio(n/2)+n%2
	       
	       misterio(15)------->10*111+1=1111
	       misterio(7)------->10*11+1=111
	       misterio(3)-------->10*1+1=11
	       misterio(1)--------->1
	       
	       misterio(20)-------->10*1010+0=10100
	       misterio(10)-------->10*101+0=1010
	       misterio(5)--------->10*10+1=101
	       misterio(2)--------->10*1+0=10
	       misterio(1)--------->1
	   
	 */
	

}
