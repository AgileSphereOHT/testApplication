package uk.co.agilesphere.testapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.co.agilesphere.testapplication.domain.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

    Person findFirstByUsername(String username);

}
