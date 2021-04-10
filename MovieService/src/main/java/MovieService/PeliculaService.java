package MovieService;

import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class PeliculaService {
	
	private Map <String, Pelicula> mapaPeli = new HashMap<String, Pelicula>();
	
	private void crearDatosPrueba() {
		
	}
	
	public PeliculaService() {
		crearDatosPrueba();
	}
	

}
