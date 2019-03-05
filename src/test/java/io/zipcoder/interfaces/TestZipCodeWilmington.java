package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLectureWithTeacher() {
        // Given
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();

        Students expected = Students.getInstance();
        for (Student student : expected.getArray()) {
            student.learn(5);
        }

        Instructor instructor = new Instructor(1);

        // When
        zcw.hostLecture(instructor, 20);
        Students actual = zcw.getStudents();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testHostLectureWithId(){
        // Given
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        Students expected = Students.getInstance();
        for (Student student : expected.getArray()) {
            student.learn(5);
        }

        // When
        zcw.hostLecture(1, 20);
        Students actual =   zcw.getStudents();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testHostLectureWithEducator(){
        // Given
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        Students expected = Students.getInstance();
        for (Student student : expected.getArray()) {
            student.learn(5);
        }

        // When
        zcw.hostLecture(Educator.FROILAN, 20);
        Students actual = zcw.getStudents();

        // Then
        Assert.assertEquals(expected, actual);

    }

}
