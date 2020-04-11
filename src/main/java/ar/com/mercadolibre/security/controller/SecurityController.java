package ar.com.mercadolibre.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.mercadolibre.security.beans.CountryResponse;

@RestController
@RequestMapping("/security")
public class SecurityController {

	@GetMapping("/users/{ip}")
	public CountryResponse getUser(@PathVariable String ip){
		
		CountryResponse countryResponse = new CountryResponse();
		
		return countryResponse;		
		
	}
}
