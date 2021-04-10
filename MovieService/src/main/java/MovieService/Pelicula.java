package MovieService;

import java.util.List;

public class Pelicula {
	private List<Actor> reparto;
	private String titulo;
	
	public Pelicula() {}
	
	public Pelicula(String titulo, List<Actor> actores) {
		this.titulo = titulo;
		this.reparto = actores;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public List<Actor> getReparto(){
		return this.reparto;
	}
	
	public void setTitulo (String t) {
		this.titulo = t;
	}
	
	public void setReparto (List<Actor> actores) {
		this.reparto = actores;
	}

}