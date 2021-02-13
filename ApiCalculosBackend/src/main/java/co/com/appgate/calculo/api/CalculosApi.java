package co.com.appgate.calculo.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 
 * Api encargada de exponer los servicios para realizar los diferentes calculos
 * @author Jonatan Velandia
 *
 */
@RestController
@RequestMapping(value = "/Calculo", produces = "application/json", headers = "Accept=application/json;charset=UTF-8")
public class CalculosApi {
	
	/**
	 * Consulta por ID
	 * 
	 * @param idPersona
	 * @return
	 */
	@CrossOrigin(origins = "*")
	@GetMapping(value = "/getSession{id}")
	public ResponseEntity<String> getSession(@PathVariable("id") String name){
		return new ResponseEntity<String>("Exito", HttpStatus.CREATED);
	}
}
