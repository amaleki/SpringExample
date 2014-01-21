package com.example.format;

import com.example.model.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONFormat implements Formatter {

	@Override
	public String format(Contact contact) {
		
		ObjectMapper mapper = new ObjectMapper(); 
		try {
			return mapper.writeValueAsString(contact);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "";
		}
	}

} 
