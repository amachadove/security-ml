package ar.com.mercadolibre.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import ar.com.mercadolibre.security.beans.Country;
import ar.com.mercadolibre.security.beans.DataCountry;

@SpringBootApplication
public class SecurityApplication {
	
	private static final Logger log = LoggerFactory.getLogger(SecurityApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Country country = restTemplate.getForObject(
					"https://api.ip2country.info/ip?83.44.196.93", Country.class);
			log.info(country.toString());
			
			DataCountry quote = restTemplate.getForObject(
					"https://restcountries.eu/rest/v2/alpha/"+country.getCountryCode3(), DataCountry.class);
			log.info(quote.toString());
		};
	}
}
