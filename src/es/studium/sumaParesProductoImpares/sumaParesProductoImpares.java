package es.studium.sumaParesProductoImpares;

public class sumaParesProductoImpares {

	public static void main(String[] args) {
	
		
		int suma=0;
		int producto=1;
		
		for(int i=0; i<=40;i++) {
			if (i%2==0)
			{
				suma+=i;
			} else {
				producto = producto*i;
			}
				
		}
		System.out.println("la suma de los pares es "+ suma);
		System.out.println("El producto de los impares es " + producto);
	}
}






/* PARA i=1 HASTA i<=40 HACER
SI i%2=0 ENTONCES
suma = suma+i
SI NO
producto = producto*i
FIN SI
FINPARA
ESCRIBIR “La suma de los pares es:” + suma
ESCRIBIR “El producto de los impares es:” + producto
FIN */