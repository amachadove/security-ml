package ar.com.mercadolibre.security.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ar.com.mercadolibre.security.beans.CountryResponse;
import ar.com.mercadolibre.security.service.SecurityService;

public class SecurityServiceImpl implements SecurityService {
	
	private static final Logger log = LoggerFactory.getLogger(SecurityServiceImpl.class);

	@Override
	public CountryResponse findById(String ip) {
		
		CountryResponse countryResponse = new CountryResponse();		
		
		return countryResponse;
	}
}
