package com.webapp.university;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class TeacherRepository {
    List<Teacher> teachers = new ArrayList<>();

    public TeacherRepository() {
        teachers.add(new Teacher("Anatolie","Balanov","CDE"));
        teachers.add(new Teacher("Leonea","Vasilache","Limba si literatura romana"));
        teachers.add(new Teacher("Alexei","Muntean","Matematica"));
        teachers.add(new Teacher("Vitea","Leontii","Informatica"));
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void delTeacher(String fName) {
        Predicate<Teacher> condition = teacher -> teacher.getFirstName().equals(fName);
        teachers.removeIf(condition);
    }

}
