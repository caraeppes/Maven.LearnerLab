package io.zipcoder.interfaces;


public final class Students extends People {
    
    private final static Students INSTANCE = new Students();

    private Students(){
        Student cara = new Student(1);
        cara.setName("Cara");
        Student davis = new Student(2);
        davis.setName("Davis");
        Student sean = new Student(3);
        sean.setName("Sean");
        Student mike = new Student(4);
        mike.setName("Mike");

        add(cara);
        add(davis);
        add(sean);
        add(mike);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

    public Student[] getStudentArray(){
        Student[] studentArray = new Student[INSTANCE.getPersonList().size()];

        for(int i = 0; i < studentArray.length; i++){
            studentArray[i] = new Student(INSTANCE.getPersonList().get(i).getId());
            studentArray[i].setName(INSTANCE.getPersonList().get(i).getName());
        }
        return studentArray;
    }


}
