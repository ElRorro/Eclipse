
public class Director {
	private String nombreDirector;
	private String apellidosDirector;
	
	public Director(String nombreDirector, String apellidosDirector) {
		this.nombreDirector = nombreDirector;
		this.apellidosDirector = apellidosDirector;
	}

	public String getNombreDirector() {
		return nombreDirector;
	}

	public String getApellidosDirector() {
		return apellidosDirector;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombreDirector + " - " + apellidosDirector;
	}
}
