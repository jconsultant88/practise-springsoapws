package com.learningjava.springwebservices.service;

import java.util.List;

import com.learningjava.springwebservices.spec.PersonException;
import com.practisejava.jaxb.Person;

public interface PersonService {

	void addPerson(Person person) throws PersonException;

	Person getPerson(Integer id) throws PersonException;

	List<Person> getAllPersons();

	void updatePerson(Person person) throws PersonException;

	void deletePerson(Integer id) throws PersonException;
}