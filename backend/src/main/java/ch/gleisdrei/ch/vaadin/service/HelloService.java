package ch.gleisdrei.ch.vaadin.service;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class HelloService {
	
	public String sayHello() {
		return "Hello Vaadin user";
	}
}
