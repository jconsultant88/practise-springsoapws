package com.learningjava.springwebservices.endpoint;

import com.practisejava.jaxb.DeletePersonRequest;

public class DeletePersonEndpoint extends AbstractPersonEndpoint {
	@Override
	protected Object invokeInternal(Object request) throws Exception {
		DeletePersonRequest deletePersonRequest = (DeletePersonRequest) request;
		personService.deletePerson(deletePersonRequest.getId());
		return null;
	}
}
