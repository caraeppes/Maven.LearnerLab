package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();
    private final static ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington(){}


    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getStudentArray(), numberOfHours);
    }


    public void hostLecture(long id, double numberOfHours){
        Teacher teacher = (Teacher)instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
