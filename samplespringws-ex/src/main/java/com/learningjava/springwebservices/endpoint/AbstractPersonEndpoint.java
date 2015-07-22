package com.learningjava.springwebservices.endpoint;

import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

import com.learningjava.springwebservices.service.PersonService;
 
public abstract class AbstractPersonEndpoint extends AbstractMarshallingPayloadEndpoint {
  protected PersonService personService;
 
  public void setPersonService(PersonService personService) {
    this.personService = personService;
  }
  protected abstract Object invokeInternal(Object request) throws Exception;
}