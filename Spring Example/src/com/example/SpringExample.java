package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Contact;

public class SpringExample {

	public static void main(String[] args) {
		
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"Beans.xml"});
		
		FormatService format = (FormatService) context.getBean("formatService");
		
		Contact contact = new Contact("Johnny","Rico","jrico","714-555-1212");
	    
		System.out.println(format.formatContact(contact));
	
	}

}
