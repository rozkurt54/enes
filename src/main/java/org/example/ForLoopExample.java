package org.example;




class People {

}

interface PlumberInterface {

    void fixPipe();

}

class Plumber extends People implements PlumberInterface{

    @Override
    public void fixPipe() {
        System.out.println("Fixing pipe");
    }
}

class Student extends People {

}

interface PainterInterface {

    void paint();

}

class Teacher extends People implements PlumberInterface, PainterInterface {

    @Override
    public void fixPipe() {
        System.out.println("Fixing pipe");
    }

    @Override
    public void paint() {
        System.out.println("Painting");
    }
}


public class ForLoopExample {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();

        if(teacher instanceof PlumberInterface) {
            System.out.println("Teacher is a Plumber");
            teacher.fixPipe();
        } else {
            System.out.println("Teacher is not a Plumber");
        }


        if(teacher instanceof PainterInterface) {
            System.out.println("Teacher is a Painter");
            teacher.paint();
        } else {
            System.out.println("Teacher is not a Painter");
        }


    }
}
