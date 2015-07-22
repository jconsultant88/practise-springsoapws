package com.learningjava.springwebservices.endpoint;

import com.practisejava.jaxb.GetPersonRequest;
import com.practisejava.jaxb.GetPersonResponse;

public class GetPersonEndpoint extends AbstractPersonEndpoint {
	  @Override
	  protected Object invokeInternal(Object request) throws Exception {
	    GetPersonRequest getPersonRequest = (GetPersonRequest) request;
	    GetPersonResponse getPersonResponse = new GetPersonResponse();
	    getPersonResponse.setPerson(personService.getPerson(getPersonRequest.getId()));
	    return getPersonResponse;
	  }
	}
