package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void personConstructorTest(){
        // Given
        long expectedId = 1234567;

        // When
        Person person = new Person(expectedId);
        long actualId = person.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }


    @Test
    public void personSetNameTest(){
        // Given
        Person person = new Person(1234567);
        String expectedName = "Cara";

        // When
        person.setName(expectedName);
        String actualName = person.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

}
