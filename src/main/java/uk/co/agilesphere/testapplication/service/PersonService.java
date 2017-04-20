package uk.co.agilesphere.testapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.agilesphere.testapplication.domain.Person;
import uk.co.agilesphere.testapplication.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        super();
        this.personRepository = personRepository;
    }

    public Person findPerson(String username) {
        return personRepository.findFirstByUsername(username);
    }

    public List<Person> listPeople() {
        List<Person> people = new ArrayList<Person>();
        personRepository.findAll().forEach(people::add);
        return people;
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }
}
