package ConvetirEntero;

public class Convertirnum {
	
	public static void main (String args[])
	{
	  String r="";
	  int residuo=0;
	  r=convertidor(residuo, 23404,  r);
	  System.out.println("valor en string: "+r);
	}
	public static String convertidor(int residuo, int valor,  String r)
	{
		if(valor<10)
		{
			return r=valor+r;
		}
		return convertidor(residuo=valor%10,valor=valor/10,  r=residuo+r);
	
	}

}
