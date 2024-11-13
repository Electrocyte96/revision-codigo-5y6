import java.util.Scanner;
    // Peqñeño juego que te muestra si tu numero es afortunado, se realizan sumas segun condicionales si la variable digito es(3,7,8,9) sucesivas que van incrementando dos variavles afo y noAfo. al final la variable mas grande determina si tu numero es o no es adortunado 

public class Ejercicio5 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in); //declarado objeto scanner y dandole parametros a su metodo constructor
	
    System.out.println("Introduzca un número: "); //corregido .println y las comillas
    int ni = s.nextInt(); //se pedia un numero pero se esperaba un string 
    s.close(); //cerrar el scanner
    int c = ni;
    
    int afo = 0;
    int noAfo = 0;
    
    while (ni > 0) {
	  int digito = (int)(ni % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
      }
      ni /= 10; //sacamos del else porque si no se presta para un loop infinito
     
    }
    if (afo > noAfo) { // sacamos el par if-else ultimos ya que con numeros muy grandes se podia imprimir mas de una vez y con outputs diferentes
    	System.out.println("El " + c + " es un número afortunado."); // corregido .println
    } else {
    	System.out.println("El " + c + " no es un número afortunado.");
    }
}
}