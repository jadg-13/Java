package org.example.controllers;

import org.example.models.Student;

import java.util.ArrayList;

public class StudentController {

    ArrayList<Student> students;

    public StudentController() {
        students = new ArrayList<>();
    }

    public void addStudent(String firstName, String lastName, int age) {
        Student student = new Student(firstName, lastName, age);
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

}
