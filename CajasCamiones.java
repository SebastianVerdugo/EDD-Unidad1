package AlmacenCajas;

public class CajasCamiones 
{
	public static void main (String args [])
	{
		int totalCamiones=0, capacidadOriginal=0;
		totalCamiones=contenerCajas(14, 3, capacidadOriginal,totalCamiones);
		System.out.println(totalCamiones);
	}
	public static int contenerCajas(int cajas, int capacidadCamiones,int capacidadOriginal, int totalCamiones)
	{
		if(capacidadOriginal==0)
		{
			capacidadOriginal=cajas;
		}
		if(cajas<=capacidadCamiones)
		{
			return totalCamiones;
		}
		return contenerCajas(cajas=cajas/2, capacidadCamiones, capacidadOriginal,totalCamiones=(capacidadOriginal/cajas)+totalCamiones);
		
	}

}
      /*
      	        return contenerCajas(cajas=cajas/2, capacidadCamiones, capacidadOriginal,totalCamiones=(capacidadOriginal/cajas)+totalCamion
		
      		contenerCajas(7, 3, 14, 2)
		contenerCajas(3, 3, 14, 6)
		
		Se cumple la condicion
		
		3<=3
		
		retorna 6
      */
