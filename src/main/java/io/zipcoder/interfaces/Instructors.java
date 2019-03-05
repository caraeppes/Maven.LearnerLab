package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){}

    public static Instructors getInstance(){
        return INSTANCE;
    }

    @Override
    public Instructor[] getArray() {
        return getPersonList().toArray(new Instructor[0]);
    }
}
