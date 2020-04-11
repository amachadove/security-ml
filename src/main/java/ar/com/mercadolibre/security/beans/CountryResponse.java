package ar.com.mercadolibre.security.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryResponse {
	
	private String ip;
	
	private String dateActually;
	
	private String country;
	
	private String isoCode;
	
	private String language;
	
	private String currency;
	
	private String hour;
	
	private String distance;

}
