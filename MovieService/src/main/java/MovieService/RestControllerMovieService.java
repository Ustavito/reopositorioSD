package MovieService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerMovieService {
	@Autowired
	private PeliculaService peliculasService;


	@RequestMapping(value = "/getPeliculas", method = RequestMethod.GET)
	public List<Pelicula> getPeliculas() {
		return peliculasService.getPeliculas();
	}

	@RequestMapping(value = "/getPelicula", method = RequestMethod.GET)
	public Pelicula getPelicula(@RequestParam String tituloPelicula) {
		return peliculasService.getPelicula(tituloPelicula);
	}
	

	@RequestMapping(value = "/addPelicula", method = RequestMethod.POST)
	public ResponseEntity<Boolean> addPelicula(@RequestBody Pelicula pelicula) {
		peliculasService.addPelicula(pelicula);
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/modifyPelicula", method = RequestMethod.POST)
	public ResponseEntity<Boolean> modifyPelicula(@RequestBody Pelicula pelicula) {
		peliculasService.modifyPelicula(pelicula);
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
	
}

