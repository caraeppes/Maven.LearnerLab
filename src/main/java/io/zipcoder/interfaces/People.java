package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {

    private List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }


    public Person findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }


    public void remove(Person person) {
        personList.remove(person);
    }


    public void remove(long id) {
        personList.remove(findById(id));
    }


    public int getCount() {
        return personList.size();
    }


    public Person[] getArray() {
        return (Person[]) personList.toArray();
    }


    public void removeAll() {
        personList.clear();
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
