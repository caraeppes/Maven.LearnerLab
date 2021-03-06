package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStudents {

    @Test
    public void testStudentsSingleton(){
        // Given
        Student cara = new Student(1);
        cara.setName("Cara");
        Student davis = new Student(2);
        davis.setName("Davis");
        Student sean = new Student(3);
        sean.setName("Sean");
        Student mike = new Student(4);
        mike.setName("Mike");
        List<Student> expected = new ArrayList<>();
        expected.add(cara);
        expected.add(davis);
        expected.add(sean);
        expected.add(mike);

        // When
        Students actual = Students.getInstance();
        boolean expectedTrue = true;

        for(int i = 0; i < actual.getCount(); i++){
            if(!((actual.getPersonList().get(i).getId() == expected.get(i).getId()) ||
                    (actual.getPersonList().get(i).getName().equals(expected.get(i).getName())))){
                expectedTrue = false;
            }
        }

        // Then
        Assert.assertTrue(expectedTrue);

    }

}
