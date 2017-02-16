import java.util.Scanner;

import javax.swing.plaf.ActionMapUIResource;

//importa las bibliotecas que creas necesaria.
public class TestPelicula
{
  public static void main (String[]arg)
  {
    Actor actor1 = new Actor("cristiano", "malo malote", 23);
    Actor actor2 = new Actor("luis enrique","mequetrefe redomado", 45);
    Actor actor3 = new Actor("ada", "augusta byron", 43);
    Director director = new Director("pedro", "pedrito pedrete");

    //crea un objeto de tipo película
    Pelicula pelicula1 = new Pelicula();
    //añade los actores y los directores
    pelicula1.añadirActores(actor1);
    pelicula1.añadirActores(actor2);
    pelicula1.añadirActores(actor3);
    pelicula1.añadirDirectores(director);
    //lee desde la clase scanner el presupuesto de la película
    //el presupuesto debe estar comprendido entre
    //6.000.000 euros a 7.999.999 euros
    //usa una expresión regular para controlar el dato introducido
    //tanto para que sea un entero y esté en ese rango de valor
    //NO puede lanzarse una excepción por introducir un valor no entero
    //en el caso que la cantidad introducida no corresponda al rango anterior
    //se establecerá un presupuesto de 6.000.000 euros en caso correcto se
    //establece el presupuesto leíedo
    //NO puede lanzarse una excepción por introducir un valor no entero
    //en el caso que la cantidad introducida no corresponda al rango anterior
    //se establecerá un presupuesto de 6.000.000 euros en caso correcto se
    //establece el presupuesto leíedo
    
    Double d = new Double("6.35");
    Scanner teclado = new Scanner(System.in);
    String presupuesto;
    
    System.out.println("Introduce el presupuesto de la pelicula: ");
    presupuesto = teclado.next();
    double presupuestoDouble = d.parseDouble(presupuesto);
    if(presupuestoDouble > 6000000 && presupuestoDouble < 7999999){
	    if (presupuesto.matches("[\\d]+{8}")){	
	    	pelicula1.setPresupuesto(presupuestoDouble);
	    }
    }else{
    	pelicula1.setPresupuesto(6000000);
    }
    
    //imprime la referencia de la película
     System.out.println("La pelicula es: \n " + pelicula1);
    //imprime la lista de actores
     System.out.println("La lista de actores es: " + pelicula1.getActores());
    //imprime la edad media de los actores
     System.out.printf("La edad media de los actores es %.2f%n", pelicula1.edadMediaActores());
    //imprime la lista de directores
     System.out.println("La lista de los directores es: " + pelicula1.getDirectores());

  }
}
