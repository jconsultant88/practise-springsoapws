package com.learningjava.springwebservices.endpoint;

import com.practisejava.jaxb.UpdatePersonRequest;

public class UpdatePersonEndpoint extends AbstractPersonEndpoint {
	@Override
	protected Object invokeInternal(Object request) throws Exception {
		UpdatePersonRequest updatePersonRequest = (UpdatePersonRequest) request;
		personService.updatePerson(updatePersonRequest.getPerson());
		return null;
	}
}
