package ar.com.mercadolibre.security.service;

import ar.com.mercadolibre.security.beans.CountryResponse;

public interface SecurityService {
	
	public CountryResponse findById(String ip);

}
