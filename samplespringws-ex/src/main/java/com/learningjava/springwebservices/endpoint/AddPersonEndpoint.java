package com.learningjava.springwebservices.endpoint;

import com.practisejava.jaxb.AddPersonRequest;

public class AddPersonEndpoint extends AbstractPersonEndpoint {
	  @Override
	  protected Object invokeInternal(Object request) throws Exception {
	    AddPersonRequest addPersonRequest = (AddPersonRequest) request;
	    personService.addPerson(addPersonRequest.getPerson());
	    return null;
	  }
	}
