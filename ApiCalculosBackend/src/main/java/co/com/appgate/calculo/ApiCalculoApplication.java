package co.com.appgate.calculo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;


/**
 * Clase para inicializar el servidor de SpringBoot y su configuracion.
 * 
 * @author Jonatan Velandia
 *
 */
@SpringBootApplication
public class ApiCalculoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ApiCalculoApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApiCalculoApplication.class);
	}

}
