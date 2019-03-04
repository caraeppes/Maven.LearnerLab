package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        // Given
        Student student = new Student(1234567);

        // When
        boolean actual = student instanceof Learner;

        // Then
        Assert.assertTrue(actual);
    }


    @Test
    public void testInheritance(){
        // Given
        Student student = new Student(1234567);

        // When
        boolean actual = student instanceof Person;

        // Then
        Assert.assertTrue(actual);
    }


    @Test
    public void testLearn(){
        // Given
        Student student = new Student(1234567);
        double expected = 4;

        // When
        student.learn(expected);
        double actual = student.getTotalStudytime();

        // Then
        Assert.assertEquals(expected, actual, .001);
    }
}
