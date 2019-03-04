package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testInstructorsSingleton(){
        // Given
        Instructor leon = new Instructor(1);
        leon.setName("Leon");
        Instructor froilan = new Instructor(2);
        froilan.setName("Froilan");
        Instructor wil = new Instructor(3);
        wil.setName("Wil");
        Instructor nhu = new Instructor(4);
        nhu.setName("Nhu");

        People expected = new People();
        expected.add(leon);
        expected.add(froilan);
        expected.add(wil);
        expected.add(nhu);

        // When
        People actual = Instructors.getInstance();
        boolean expectedTrue = true;

        for(int i = 0; i < actual.getCount(); i++){
            if(!((expected.getPersonList().get(i).getId() == (actual.getPersonList().get(i).getId())) ||
                    (expected.getPersonList().get(i).getName().equals(actual.getPersonList().get(i).getName())))){
                expectedTrue = false;
            }
        }

        // Then
        Assert.assertTrue(expectedTrue);
    }

}
