package ar.com.mercadolibre.security.beans.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Languages {

	private String iso639_1;
	
	private String iso639_2;
	
	private String name;
	
	private String nativeName;
}
