package MovieService;

public class Actor {
	
	private String nombre;
	private String personaje;
	
	public Actor() {}
	
	public Actor (String n, String p) {
		nombre = n;
		personaje = p;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getPersonaje() {
		return personaje;
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	
	public void setPersonaje (String p) {
		personaje = p;
	}

}
