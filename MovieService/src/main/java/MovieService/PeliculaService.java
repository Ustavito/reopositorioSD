package MovieService;

import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class PeliculaService {
	
	private Map <String, Pelicula> mapaPeli = new HashMap<String, Pelicula>();
	
	private void crearDatosPrueba() {
		
		//Lista de peliculas para añadir a mapa
		List<Pelicula> peliculas = new ArrayList<Pelicula>();
		
		//Inicializacion actores de Avengers
		Actor benedict = new Actor("Benedict Cumberbatch", "Dr Strange");
		Actor robert = new Actor ("Robert Downey Jr", "Iron Man");
		Actor scarlet = new Actor ("Scarlett Johansonn", "Black Widow");
		Actor chris = new Actor ("Chris Evans", "Capitan America");
		
		//Creacion reparto avengers
		List<Actor> repartoAvengers = new ArrayList<Actor>();
		
		repartoAvengers.add(benedict);
		repartoAvengers.add(robert);
		repartoAvengers.add(scarlet);
		repartoAvengers.add(chris);
		
		//Creacion pelicula avengers
		Pelicula avengers = new Pelicula("Avengers", repartoAvengers);
		
		//Añadir avengers a lista
		peliculas.add(avengers);
		
		//Añadir pelis a mapa
		for (Pelicula pelicula : peliculas) {
			mapaPeli.put(pelicula.getTitulo(), pelicula);
		}
	}
	
	public PeliculaService() {
		crearDatosPrueba();
	}
	
	public Pelicula getPelicula(String titulo) {
		return mapaPeli.get(titulo);
	}

	public List<Pelicula> getPeliculas() {
		return new ArrayList<Pelicula>(mapaPeli.values());
	}

	public void addPelicula(Pelicula pelicula) {
		this.mapaPeli.put(pelicula.getTitulo(), pelicula);
	}
	
	public void modifyPelicula(Pelicula pelicula) {
		this.mapaPeli.remove(pelicula.getTitulo());
		this.mapaPeli.put(pelicula.getTitulo(), pelicula);
	}
	

}
