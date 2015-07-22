package example.client;
 
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ws.soap.client.SoapFaultClientException;

import com.practisejava.jaxb.Person;
 
public class Main {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    PersonClient client = (PersonClient) ctx.getBean("client");
    Person person = null;

    // Add person
    try {
      person = createPerson(5, "Lex", "Luthor");
      System.out.println("Add this person " + makeString(person));
      client.addPerson(person);
    } catch (SoapFaultClientException se) {
      System.out.println("\t" + se.getMessage());
    }
 
    // Get person
    try {
      int id = 1;
      System.out.println("Get person with id=" + id + "...");
      person = client.getPerson(id);
      System.out.println("\tPerson Response " + makeString(person));
    } catch (SoapFaultClientException se) {
      System.out.println("\t" + se.getMessage());
    }
 
    // Update the person
    try {
      System.out.println("Update person's first name");
      person.setFirstName("Clark Joseph");
      client.updatePerson(person);
      System.out.println("\tsucessfully invoked update.");
    } catch (SoapFaultClientException se) {
      System.out.println("\t" + se.getMessage());
    }
 
    // Delete person
    try {
      int id = 9999;
      System.out.println("Delete person with id=" + id);
      client.deletePerson(id);
    } catch (SoapFaultClientException se) {
      System.out.println("\t" + se.getMessage());
    }
    // Get all persons
    System.out.println("Get all persons...");
    List<Person> persons = client.getAllPersons();
    for (Person p : persons) {
      System.out.println("\t" + makeString(p));
    }
  }
 
  private static Person createPerson(int id, String firstName, String lastName) {
    Person person = new Person();
    person.setId(id);
    person.setFirstName(firstName);
    person.setLastName(lastName);
    return person;
  }
 
  private static String makeString(Person p) {
    return "[id=" + p.getId() + ", firstName=" + p.getFirstName() + ", lastName="
        + p.getLastName() + "]";
  }
}