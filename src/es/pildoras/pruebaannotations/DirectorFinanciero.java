package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	public String getEmail() {
		return email;
	}

	public String getEmpresa() {
		return empresa;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gesti�n y direccion de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	
	private CreacionInformeFinanciero informeFinanciero;

	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String empresa;
}
