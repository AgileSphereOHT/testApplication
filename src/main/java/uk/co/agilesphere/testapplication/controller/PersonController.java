package uk.co.agilesphere.testapplication.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uk.co.agilesphere.testapplication.domain.Person;
import uk.co.agilesphere.testapplication.service.PersonService;

@Controller
public class PersonController {

    private PersonService personService;
    private static Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/list")
    public String list(Model model) {
        logger.info(">> listing people");
        Iterable<Person> people = personService.listPeople();
        model.addAttribute("people", people);
        return "person/list";
    }

    @RequestMapping("/create")
    public String create(Model model) {
        logger.info(">> creating a person");
        model.addAttribute("person", new Person());
        return "person/create";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Person person) {
        logger.info(">> saving a person");
        Person saved = personService.save(person);
        return "redirect:/list";
    }
}
