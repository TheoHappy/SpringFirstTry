package com.webapp.university;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    String name;
    List<String> students = new ArrayList<>();

    public StudentRepository() {
        students.add("Andries");
        students.add("Valoghita");
        students.add("Petrica");
        students.add("Trofim");
        students.add("Seriojica");
    }

    public List<String> getStudents(){
        return students;
    }

    public void addStudent(String name){
        students.add(name);
    }

}
