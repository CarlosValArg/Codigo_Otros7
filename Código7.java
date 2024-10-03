//El programa permite que insetemos el nombre de un país que nos devuelve su capital, en caso contrario no nos dice nada que no se encuentre en el hashmap
import java.util.HashMap;//Se importa el hashmap
import java.util.Scanner;//Se importa el scanner

public class Código7 {
	public static void main(String[] args) {//Se añade metodo main
	 Scanner s = new Scanner(System.in);//Se añade el system.in
//Se corrige el nombre de capitales del hashmap y se les implementa el tipo string, string
	    HashMap<String, String> capitales = new HashMap<String, String>();

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador", "San Salvador");// Se añade el value a la llave de El salvador con dato real correcto
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    String c = "";//Se escribe correctamente la palabra String
	    do {
	      System.out.print("Escribe el nombre de un país y te diré su capital: ");//Se sustituye el in por out
	      c = s.nextLine();//Se corrige el tipo de dato para el scanner
	      
	      if (!c.equals("salir")) {//Se cambia equal por equals
	        if (capitales.containsKey(c)) {//Se sustituye ca por capitales y el contains value por la key
	          System.out.print("La capital de " + c);
	          System.out.println(" es " + capitales.get(c));//Se sustituye ca por capitales y el put por get
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          capitales.put(c, ca);//Se sustituye ca por capitales
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (!c.equals("salir"));//se escribe correctamente la palabra reservada while y añade un aprentesis extra
	 s.close();//Se cierra scanner
	}
	}
