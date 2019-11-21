package com.webapp.university;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentRepository {
    List<Student> students = new ArrayList<>();

    public StudentRepository() {
        students.add(new Student("Andries", "Bonta", 7.5));
        students.add(new Student("Valoghita", "Arcan", 8.3));
        students.add(new Student("Petrica", "Zohan", 5));

    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void delStudent(String fName) {
        Predicate<Student> condition = student -> student.getFirstName().equals(fName);
        students.removeIf(condition);
    }

}
