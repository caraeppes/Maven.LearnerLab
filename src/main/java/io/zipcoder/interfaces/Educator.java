package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    LEON("Leon", 1),
    FROILAN("Froilan", 2),
    WIL("Wil", 3),
    NHU("Nhu", 4);


    final Instructor instructor;
    double timeWorked = 0;

    Educator(String name, long id){
        instructor = new Instructor(id);
        instructor.setName(name);
        Instructors.getInstance().add(instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }
}
