package example.client;

import java.util.List;

import com.practisejava.jaxb.Person;

public interface PersonClient {
	void addPerson(Person person);

	Person getPerson(Integer id);

	List<Person> getAllPersons();

	void updatePerson(Person person);

	void deletePerson(Integer id);
}