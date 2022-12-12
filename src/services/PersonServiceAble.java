package services;

import java8.classes.Person;

import java.util.List;

public interface PersonServiceAble {
    String create(Person people);
    List<Person> getPerson();
    Person getPersonFirsName(String name,List<Person>people);
}
