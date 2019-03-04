package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudytime = 0;

    public Student(long id) {
        super(id);
    }

    public void learn(double numberOfHours) {
        totalStudytime += numberOfHours;
    }

    public double getTotalStudytime() {
        return totalStudytime;
    }
}
