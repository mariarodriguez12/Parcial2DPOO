package logica;


public class Parcial {
	
	public String raices(int a, int b, int c) throws Exception{ 
		double dis = Math.pow(b, 2) - 4*a*c;
		if(dis < 0) {
			throw new Exception("No existen raices, discriminante menor a 0");
		}
		
		if(a == 0) {
			throw new Exception("No es posible dividir por 0");
		}
		
		double x1 = (-b + dis)/(2*a);
		double x2  = (-b - dis)/(2*a);
		String respuesta = (x1 + "," + x2);
		
		return respuesta;
		
	}

}
