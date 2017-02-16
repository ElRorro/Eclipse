
public class Actor {
	private String nombreActor;
	private String apellidosActor;
	private int edad;
	
	public Actor(String nombre, String apellidos, int edad) {
		this.nombreActor = nombre;
		this.apellidosActor = apellidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombreActor;
	}


	public String getApellidos() {
		return apellidosActor;
	}


	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombreActor + " - " + apellidosActor + " - " + "Edad: " + edad;
	}

	
}
