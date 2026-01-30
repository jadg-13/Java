package org.example;

import org.example.controllers.StudentController;
import org.example.models.Student;

public class Main {
    public static void main(String[] args) {

        StudentController datos = new StudentController();

        datos.addStudent("Juan", "Perez", 20);
        datos.addStudent("Maria", "Gomez", 22);
        datos.addStudent("Luis", "Lopez", 19);

        for (Student student : datos.getStudents()) {
            System.out.println(student);
        }


    }
}