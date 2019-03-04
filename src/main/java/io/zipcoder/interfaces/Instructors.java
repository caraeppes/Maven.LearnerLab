package io.zipcoder.interfaces;

public final class Instructors extends People{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor leon = new Instructor(1);
        leon.setName("Leon");
        Instructor froilan = new Instructor(2);
        froilan.setName("Froilan");
        Instructor wil = new Instructor(3);
        wil.setName("Wil");
        Instructor nhu = new Instructor(4);
        nhu.setName("Nhu");

        add(leon);
        add(froilan);
        add(wil);
        add(nhu);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
