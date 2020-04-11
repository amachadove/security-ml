package ar.com.mercadolibre.security.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
	
	private String countryCode;
	
	private String countryCode3;
	
	private String countryName;
	
	private String countryEmoji;
	
	@Override
	public String toString() {
		return "Country{" +
				"countryCode='" + countryCode + '\'' +
				", countryCode3=" + countryCode3 +
				", countryName=" + countryName +
				", countryEmoji=" + countryEmoji +
				'}';
	}

}
