import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	//private ArrayList<Actor> actores;
	//private ArrayList<Director> directores;
	private List <Actor> actor;
	List <Actor> actores = new ArrayList<Actor>();
	private List <Director> director;
	List <Director> directores = new ArrayList<Director>();
	private double presupuesto;
	
	
	public void añadirActores(Actor a){
		actores.add(a);
	}
	
	public void añadirDirectores(Director d){
		directores.add(d);
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
	public double edadMediaActores(){
		double edadMedia = 0;
		int contador = 0;
		for (int i = 0; i < actores.size(); i++) {
			edadMedia = edadMedia + actores.get(i).getEdad();
			contador++;
		}
		return edadMedia/contador;
	}

	public List<Actor> getActor() {
		return actor;
	}

	public List<Actor> getActores() {
		return actores;
	}

	public List<Director> getDirector() {
		return director;
	}

	public List<Director> getDirectores() {
		return directores;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	@Override
	public String toString() {
		//return "Pelicula [actor=" + actor + ", actores=" + actores + ", director=" + director + ", directores="
			//	+ directores + ", presupuesto=" + presupuesto + "]";
		return "ACTORES: " + "\n" + actores + "\n" + "DIRECTORES: " + "\n" + directores + "\n" + "PRESUPUESTO: " + "\n" + presupuesto+"€";
	}
}
