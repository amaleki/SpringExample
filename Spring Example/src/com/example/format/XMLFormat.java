package com.example.format;

import com.example.model.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XMLFormat implements Formatter {

	@Override
	public String format(Contact contact) {
		
		XmlMapper mapper = new XmlMapper();
		
		try {
			return mapper.writeValueAsString(contact);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
			return "";
			
		}
		
	}

}
