package com.webapp.university;

import java.util.List;
import java.util.ArrayList;

public class TeacherRepository {
    String name;
    List<String> teachers = new ArrayList<>();

    public TeacherRepository() {
        teachers.add("Anatolie");
        teachers.add("Vera");
    }

    public List<String> getTeachers() {
        return teachers;
    }

    public void addTeacher(String name) {
        teachers.add(name);
    }
    public void delTeacher(String name) {
        teachers.remove(name);
    }

    @Override
    public String toString() {
        return "TeacherRepository{" +
                "name='" + name + '\'' +
                ", teachers=" + teachers +
                '}';
    }
}
