package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    Student brian;

    @Before
    public void setUp() {
        brian = new Student(5);
        brian.setName("Brian");
    }

    @Test
    public void testAdd() {
        // Given
        List<Student> expected = new ArrayList<>();
        Students people = Students.getInstance();
        for(Student student : people.getPersonList()){
            expected.add(student);
        }
        expected.add(brian);

        // When
        people.add(brian);
        List<Student> actual = people.getPersonList();

        // Then
        Assert.assertEquals(expected, actual);
        people.remove(brian);

    }

    @Test
    public void testRemoveByPerson() {
        // Given
        List<Student> expected = new ArrayList<>();
        Students people = Students.getInstance();
        for(Student student : people.getPersonList()){
            expected.add(student);
        }
        Student mike = expected.get(3);
        expected.remove(mike);

        // When
        people.remove(mike);
        List<Student> actual = people.getPersonList();

        //Then
        Assert.assertEquals(expected, actual);
        people.add(mike);
    }


    @Test
    public void testRemoveById() {
        // Given
        List<Student> expected = new ArrayList<>();
        Students people = Students.getInstance();
        for(Student student : people.getPersonList()){
            expected.add(student);
        }
        Student mike = expected.get(3);
        expected.remove(mike);

        // When
        people.remove(4);
        List<Student> actual = people.getPersonList();

        //Then
        Assert.assertEquals(expected, actual);
        people.add(mike);
    }


    @Test
    public void testFindById() {
        // Given
        Instructors people = Instructors.getInstance();
        Person expected = people.getPersonList().get(2);

        // When
        Person actual = people.findById(3);

        // Then
        Assert.assertEquals(expected, actual);

    }

}
