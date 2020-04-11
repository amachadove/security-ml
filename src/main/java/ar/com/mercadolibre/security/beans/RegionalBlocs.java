package ar.com.mercadolibre.security.beans;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegionalBlocs {

	private String acronym;
	
	private String name;
	
	private ArrayList<String> otherAcronyms;
	
	private ArrayList<String> otherNames;
}
