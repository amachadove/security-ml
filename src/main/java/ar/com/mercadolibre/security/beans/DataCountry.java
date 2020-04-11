package ar.com.mercadolibre.security.beans;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ar.com.mercadolibre.security.beans.common.Currencies;
import ar.com.mercadolibre.security.beans.common.Languages;
import ar.com.mercadolibre.security.beans.common.Translations;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataCountry {
	
	private String name;
	
	private ArrayList<String> topLevelDomain;
	
	private String alpha2Code;
	
	private String alpha3Code;
	
	private ArrayList<String> callingCodes;
	
	private String capital;
	
	private ArrayList<String> altSpellings;
	
	private String region;
	
	private String subregion;
	
	private String population;
	
	private ArrayList<String> latlng;
	
	private String demonym;
	
	private String area;
	
	private String gini;
	
	private ArrayList<String> timezones;
	
	private ArrayList<String> borders;
	
	private String nativeName;
	
	private String numericCode;
	
	private ArrayList<Currencies> currencies;
	
	private ArrayList<Languages> languages;
	
	private Translations translations;
	
	private String flag;
	
	private ArrayList<RegionalBlocs> regionalBlocs;
	
	private String cioc;
	
	@Override
	public String toString() {
		return "DataCountry{" +
				"País='" + name + '\'' +
				'}';
	}

}
