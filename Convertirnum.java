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
	/*
		return convertidor(residuo=valor%10,valor=valor/10,  r=residuo+r);
		
		convertidor(4, 2340, "4")
		convertidor(0, 234, "04")
		convertidor(4, 23, "404")
		convertidor(3, 2, "3404")
		
		Se cumple la condicion valor<10
		
		retorna 23404
	*/
