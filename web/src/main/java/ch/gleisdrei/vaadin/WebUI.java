package ch.gleisdrei.vaadin;

import javax.inject.Inject;

import ch.gleisdrei.ch.vaadin.service.HelloService;

import com.vaadin.cdi.VaadinUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@VaadinUI
public class WebUI extends UI {

	private static final long serialVersionUID = 1L;

	@Inject
	private HelloService service;

	@Override
	public void init(VaadinRequest request) {
		Label label = new Label(service.sayHello());
		setContent(label);
	}
}
