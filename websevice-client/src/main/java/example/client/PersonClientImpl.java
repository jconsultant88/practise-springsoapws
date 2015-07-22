package example.client;
 
import java.util.List;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.practisejava.jaxb.AddPersonRequest;
import com.practisejava.jaxb.DeletePersonRequest;
import com.practisejava.jaxb.GetAllPersonsRequest;
import com.practisejava.jaxb.GetAllPersonsResponse;
import com.practisejava.jaxb.GetPersonRequest;
import com.practisejava.jaxb.GetPersonResponse;
import com.practisejava.jaxb.Person;
import com.practisejava.jaxb.UpdatePersonRequest;
 
public class PersonClientImpl extends WebServiceGatewaySupport implements PersonClient {
 
  @Override
  public void addPerson(Person person) {
    AddPersonRequest request = new AddPersonRequest();
    request.setPerson(person);
    getWebServiceTemplate().marshalSendAndReceive(request);
  }
 
  @Override
  public void deletePerson(Integer id) {
    DeletePersonRequest request = new DeletePersonRequest();
    request.setId(id);
    getWebServiceTemplate().marshalSendAndReceive(request);
  }
 
  @Override
  public List<Person> getAllPersons() {
    GetAllPersonsRequest request = new GetAllPersonsRequest();
    GetAllPersonsResponse response = (GetAllPersonsResponse) getWebServiceTemplate()
        .marshalSendAndReceive(request);
    return response.getPerson();
  }
 
  @Override
  public Person getPerson(Integer id) {
    GetPersonRequest request = new GetPersonRequest();
    request.setId(id);
    GetPersonResponse response = (GetPersonResponse) getWebServiceTemplate()
        .marshalSendAndReceive(request);
    return response.getPerson();
  }
 
  @Override
  public void updatePerson(Person person) {
    UpdatePersonRequest request = new UpdatePersonRequest();
    request.setPerson(person);
    getWebServiceTemplate().marshalSendAndReceive(request);
  }
}