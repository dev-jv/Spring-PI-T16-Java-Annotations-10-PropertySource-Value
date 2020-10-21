package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
@PropertySource("classpath:datos.txt")
public class EmpleadosConfig {
	
	// 1 - Define el bean de lo que inyectaremos, la clase...
	@Bean // El id del bean inyectado será informeFinancieroDtoCompras
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { // Definir el bean para InformeFinancieroDtoCompras
		return new InformeFinancieroDtoCompras();
	}
	
	// 2 - 
	@Bean
	public Empleados directorFinanciero() { // Definir el bean para DirectorFinanciero e inyectar dep.s
		return new DirectorFinanciero(informeFinancieroDtoCompras()); // Por el constructor..
	}
}










/*
@PropertySource("classpath:datos.txt")
Configura un file externo con los datos y nos indica cual es.
*/



/*

@bean permite definir los bean que necesitaremos.


*/

/*
@Configuration
@ComponentScan("es.pildora.pruebaannotations")

- @Configuration nos permite utilizar la clase como archivo de configuración, reemplazando el .xml.

- @ComponentScan configura el scanner para cooperar con @Autowired, requiere que se le indique donde escaneará.

*/ 