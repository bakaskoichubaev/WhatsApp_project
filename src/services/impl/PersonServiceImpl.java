package services.impl;

import java8.classes.Person;
import services.PersonServiceAble;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonServiceAble {
    List<Person> people = new ArrayList<>();
    @Override
    public String create(Person people) {
        this.people.add(people);
        return "УСПЕШНО!!!";
    }

    @Override
    public List<Person> getPerson() {
        return people;
    }

    @Override
    public Person getPersonFirsName(String name, List<Person> people) {
        for (Person person : people) {
            if(person.getFirstName().equals(name)){
                return person;
            }
        }
        return null;
    }
}

