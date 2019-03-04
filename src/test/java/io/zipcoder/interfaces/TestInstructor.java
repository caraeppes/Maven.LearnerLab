package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        // Given
        Instructor instructor = new Instructor(1234567);

        // When
        boolean actual = instructor instanceof Teacher;

        // Then
        Assert.assertTrue(actual);
    }


    @Test
    public void testInheritance(){
        // Given
        Instructor instructor = new Instructor(1234567);

        // When
        boolean actual = instructor instanceof Person;

        // Then
        Assert.assertTrue(actual);
    }


    @Test
    public void testTeach(){
        // Given
        Instructor instructor = new Instructor(1234567);
        Student student = new Student(7654321);
        double expected = 10;

        // When
        instructor.teach(student, expected);
        double actual = student.getTotalStudytime();

        // Then
        Assert.assertEquals(expected, actual, .001);
    }


    @Test
    public void testLecture(){
        // Given
        Instructor instructor = new Instructor(1234567);
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);
        Student[] studentsExpected = new Student[3];
        studentsExpected[0] = student1;
        studentsExpected[1] = student2;
        studentsExpected[2] = student3;

        for(int i = 0; i < 3; i++){
            studentsExpected[i].learn(5);
        }

        // When
        Student[] studentsActual = new Student[3];
        studentsActual[0] = student1;
        studentsActual[1] = student2;
        studentsActual[2] = student3;

        instructor.lecture(studentsActual, 15);

        // Then
        Assert.assertArrayEquals(studentsExpected, studentsActual);

    }
}
