package com.learningjava.springwebservices.endpoint;

import com.practisejava.jaxb.GetAllPersonsResponse;
import com.practisejava.jaxb.Person;

public class GetAllPersonsEndpoint extends AbstractPersonEndpoint {
	@Override
	protected Object invokeInternal(Object request) throws Exception {
		GetAllPersonsResponse getAllPersonsResponse = new GetAllPersonsResponse();
		for (Person person : personService.getAllPersons()) {
			getAllPersonsResponse.getPerson().add(person);
		}
		return getAllPersonsResponse;
	}
}