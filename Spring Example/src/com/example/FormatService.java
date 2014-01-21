package com.example;

import com.example.format.Formatter;
import com.example.model.Contact;

public class FormatService {
	//Dependency Injected via Spring
	private Formatter formatter;

	public String formatContact(Contact contact){
		return formatter.format(contact);
	}
	
	//Setter required for Spring Dependency Injection
	public void setFormatter(Formatter formatter) {
		this.formatter = formatter;
	}

}
