package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    @Test
    public void testAdd(){
        // Given
        People people = new People();
        Person person1 = new Person(1);
        Person person2 = new Person(2);

        List<Person> expected = new ArrayList<>();
        expected.add(person1);
        expected.add(person2);

        // When
        people.add(person1);
        people.add(person2);
        List<Person> actual = people.getPersonList();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testRemoveByPerson(){
        // Given
        People people = new People();
        Person person1 = new Person(1);
        Person person2 = new Person(2);

        List<Person> expected = new ArrayList<>();

        people.add(person1);
        people.add(person2);

        // When
        people.remove(person1);
        people.remove(person2);

        List<Person> actual = people.getPersonList();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testRemoveById(){
        // Given
        People people = new People();
        Person person1 = new Person(1);
        Person person2 = new Person(2);

        List<Person> expected = new ArrayList<>();

        people.add(person1);
        people.add(person2);

        // When
        people.remove(1);
        people.remove(2);

        List<Person> actual = people.getPersonList();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testFindById(){
        // Given
        People people = new People();
        Person expected = new Person(1);

        people.add(expected);

        // When
        Person actual = people.findById(1);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
