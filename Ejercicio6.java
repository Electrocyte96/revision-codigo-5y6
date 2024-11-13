import java.util.Scanner;
public class Ejercicio6 {
	//programa  que genera un array de numeros aleatorios y de entre esos numeros selecciona entre aquellos que sean multiplos de 5 y 7 segun pida el usuario y aquellos qye lo son se imprimen entre corchetes [345] y los que no se imprimen sin corchetes
	
	public static void main(String[] args) { //agregado a un metodo main
		Scanner sc = new Scanner(System.in);
		int[] n = new int[20]; //inicializar arreglo n de dimension 20

	    for (int i = 0; i < 20; i++) { //arreglado contador
	      n[i] = (int)(Math.random() * 381) + 20;
	      //System.out.println(n[i] + " "); //arreglado sysout y comentado por comodidad a la hora de ver la consola despues de ejecutar
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = sc.nextInt(); //cerrar scanner
	    //Integer.parseInt(System.console().readLine());
	    //anterior captura de datos comentada porque daba problemas a la hora de recibir datos
	    sc.close();
	    int multiplo = (opcion == 1) ? 5 : 7; //el ? y : del operador ternario estaban invertdos

	    for (int e : n) { // forEach existe en collection pero es mas facil hacer un for asi no se llama a colecciones
	    	//cambiaro char por int ya que no hay char en la operacion
	      if (e % multiplo == 0) {
	        System.out.println("[" + e + "] ");
	      } else {
	        System.out.println(e + " "); //cambiado .in por .out
	      }
	    }
	}

}